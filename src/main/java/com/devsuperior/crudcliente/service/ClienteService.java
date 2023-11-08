package com.devsuperior.crudcliente.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.crudcliente.dto.ClienteDTO;
import com.devsuperior.crudcliente.entities.Cliente;
import com.devsuperior.crudcliente.repositories.ClienteRepository;
import com.devsuperior.crudcliente.service.exceptions.DatabaseExceptions;
import com.devsuperior.crudcliente.service.exceptions.ResourceNotFoundException;

import jakarta.persistence.EntityNotFoundException;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    // buscar por ID
    @Transactional(readOnly = true)
    public ClienteDTO findById(Long id) {

        Cliente result = repository.findById(id).orElseThrow( 
                () -> new ResourceNotFoundException("recurso não encontrado"));
        ClienteDTO dto = new ClienteDTO(result);
        return dto;
    }

    // buscar todos paginada
    @Transactional(readOnly = true)
    public Page<ClienteDTO> findAll(Pageable pageable) {

        Page<Cliente> results = repository.findAll(pageable);
        return results.map(x -> new ClienteDTO(x));
    }

    // inserir
    @Transactional
    public ClienteDTO insert(ClienteDTO dto) {

        Cliente entity = new Cliente();
        copyDtoToEntity(dto, entity);
        entity = repository.save(entity);
        return new ClienteDTO(entity);
    }

    // update por ID
    @Transactional
    public ClienteDTO update(Long id, ClienteDTO dto) {

        try {
            Cliente entity = repository.getReferenceById(id);
            copyDtoToEntity(dto, entity);
            entity = repository.save(entity);
            return new ClienteDTO(entity);
        } catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException("Recurso não encontrado");
        }
    }

    // delete por ID
    // propagation é para quando o JAVA depende do JDBC que o impossibilita deletar OBJ associado a outro OBJ
    @Transactional(propagation = Propagation.SUPPORTS)
    public void delete(Long id) {

        //caso não tenha este ID no BD lança exception
        if(!repository.existsById(id)){
            throw new ResourceNotFoundException("Recurso não encontrado");
        }

        try {
            repository.deleteById(id);
        } catch (DataIntegrityViolationException e) {
            throw new DatabaseExceptions("Falha de integridade referencial");
        }

    }

    // transfer DTO to Obj
    private void copyDtoToEntity(ClienteDTO dto, Cliente entity) {

        entity.setName(dto.getName());
        entity.setCpf(dto.getCpf());
        entity.setIncome(dto.getIncome());
        entity.setBirthDate(dto.getBirthDate());
        entity.setChildren(dto.getChildren());
    }
}

package com.devsuperior.crudcliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.crudcliente.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}

package com.devsuperior.crudcliente.dto;

import java.time.LocalDate;

import com.devsuperior.crudcliente.entities.Cliente;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;

public class ClienteDTO {

    // attribute
    private Long id;
    @Size(min = 3, max = 80, message = "nome precisa ter entre 3 a 80 caracteres")
    @NotBlank(message = "campo requerido")
    private String name;
    @Size(min = 11, max = 11, message = "CPF precisa ter 11 caracteres")
    @NotBlank(message = "campo requerido")
    private String cpf;
    private Double income;
    @PastOrPresent(message = "data deve ser atual ou anterior a hoje")
    private LocalDate birthDate;
    private Integer children;

    // constructor
    public ClienteDTO() {

    }

    public ClienteDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, Integer children) {

        this.id = id;
        this.name = name;
        this.cpf = cpf;
        this.income = income;
        this.birthDate = birthDate;
        this.children = children;
    }

    public ClienteDTO(Cliente cliente) {

        id = cliente.getId();
        name = cliente.getName();
        cpf = cliente.getCpf();
        income = cliente.getIncome();
        birthDate = cliente.getBirthDate();
        children = cliente.getChildren();
    }

    // getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getChildren() {
        return children;
    }

    public void setChildren(Integer children) {
        this.children = children;
    }

}
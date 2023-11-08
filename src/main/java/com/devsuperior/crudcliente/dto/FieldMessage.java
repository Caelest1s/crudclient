package com.devsuperior.crudcliente.dto;

// capturar campos obrigatórios e devolvendo a msg
public class FieldMessage {

    // attribute
    private String fieldName;
    private String message;

    // constructor
    public FieldMessage(String fieldName, String message) {

        this.fieldName = fieldName;
        this.message = message;
    }

    // getter
    public String getFieldName() {
        return fieldName;
    }

    public String getMessage() {
        return message;
    }
}

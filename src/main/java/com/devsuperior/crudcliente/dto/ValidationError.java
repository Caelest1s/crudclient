package com.devsuperior.crudcliente.dto;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {

    // attribute
    private List<FieldMessage> errors = new ArrayList<>();

    // method
    public void addError(String fieldName, String message) {

        errors.add(new FieldMessage(fieldName, message));
    }

    // constructor
    public ValidationError(Instant timestamp, Integer status, String error, String path) {

        super(timestamp, status, error, path);
    }

    // getter
    public List<FieldMessage> getErrors() {
        return errors;
    }

}

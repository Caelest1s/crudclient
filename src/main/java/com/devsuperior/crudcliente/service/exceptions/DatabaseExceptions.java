package com.devsuperior.crudcliente.service.exceptions;

/**
 * RuntimeException não exige o bloco try...catch
 * diferente do Exception que exige o bloco try...catch
 */
public class DatabaseExceptions extends RuntimeException{
    
    public DatabaseExceptions(String msg){

        super(msg);
    }
}

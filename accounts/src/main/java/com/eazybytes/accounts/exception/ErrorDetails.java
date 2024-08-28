package com.eazybytes.accounts.exception;

import lombok.Data;

@Data
public class ErrorDetails {
    private String message;
    private int errorCode;

    public ErrorDetails( int errorCode,String message) {
        this.message = message;
        this.errorCode = errorCode;
    }
}

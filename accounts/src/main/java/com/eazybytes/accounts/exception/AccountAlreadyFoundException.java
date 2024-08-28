package com.eazybytes.accounts.exception;

public class AccountAlreadyFoundException extends RuntimeException {
    AccountAlreadyFoundException(String message) {
        super(message);
    }
}

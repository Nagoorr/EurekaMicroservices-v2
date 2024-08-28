package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.dto.AccountsDTO;
import com.eazybytes.accounts.exception.AccountAlreadyFoundException;
import com.eazybytes.accounts.service.AccountsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/accounts")
@CrossOrigin(origins = "http://localhost:4200")
public class AccountsContoller {

    @Autowired
    private AccountsService accountsService;

    @PostMapping(produces = "application/json")
    public ResponseEntity<Void> createAccount(@Valid @RequestBody AccountsDTO accountsDTO) throws AccountAlreadyFoundException {
        accountsService.createAccount(accountsDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}

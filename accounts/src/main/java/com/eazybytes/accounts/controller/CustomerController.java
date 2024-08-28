package com.eazybytes.accounts.controller;

import com.eazybytes.accounts.dto.CustomerDTO;
import com.eazybytes.accounts.exception.CustomerAlreadyExistsException;
import com.eazybytes.accounts.exception.ErrorDetails;
import com.eazybytes.accounts.mapper.CustomerMapper;
import com.eazybytes.accounts.service.CustomerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@Validated
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(consumes = "application/json", produces = "application/json")
    public ResponseEntity<ErrorDetails> createCustomer(@Valid @RequestBody CustomerDTO customerDTO) {
        try {
            customerService.createCustomer(customerDTO);
        } catch (CustomerAlreadyExistsException exception) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body(new ErrorDetails(400, "Error Details"));
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/{mobileNumber}",produces = "application/json")
    public ResponseEntity<CustomerDTO> findByMobileNumber(@PathVariable("mobileNumber") String mobileNumber) {
        return ResponseEntity.ok(CustomerMapper.mapToCustomerDTO(customerService.findByMobileNumber(mobileNumber)));
    }
}

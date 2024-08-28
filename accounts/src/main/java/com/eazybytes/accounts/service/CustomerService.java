package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDTO;
import com.eazybytes.accounts.entity.Customer;

public interface CustomerService {
     void createCustomer(CustomerDTO customerDTO);
     Customer findByMobileNumber(String mobileNumber);
}

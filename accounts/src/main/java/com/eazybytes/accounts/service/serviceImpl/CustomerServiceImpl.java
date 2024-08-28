package com.eazybytes.accounts.service.serviceImpl;

import com.eazybytes.accounts.dto.CustomerDTO;
import com.eazybytes.accounts.entity.Customer;
import com.eazybytes.accounts.exception.CustomerAlreadyExistsException;
import com.eazybytes.accounts.mapper.CustomerMapper;
import com.eazybytes.accounts.repo.CustomerRepository;
import com.eazybytes.accounts.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public void createCustomer(CustomerDTO customerDTO) {
        Optional<Customer> customer = customerRepository.findByMobileNumber(customerDTO.getMobileNumber());
        if (customer.isPresent())
            throw new CustomerAlreadyExistsException("Customer with mobile number Already Exits");
        customerRepository.save(CustomerMapper.mapToCustomer(customerDTO, new Customer()));
    }

    @Override
    public Customer findByMobileNumber(String mobileNumber) {
        Optional<Customer> customer = customerRepository.findByMobileNumber(mobileNumber);
        if (customer.isEmpty())
            throw new CustomerAlreadyExistsException("Customer with mobile number not found");
        return customer.get();
    }
}

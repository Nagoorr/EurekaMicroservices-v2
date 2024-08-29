package com.eazybytes.accounts.service;

import com.eazybytes.accounts.dto.CustomerDetailsDto;

public interface CustomerService {

    /**
     *
     * @param mobileNumber - Input Mobile Number
     * @return Accounts,Loans,Cards,Customer Details based on a given mobileNumber
     */
    public CustomerDetailsDto fetchCustomerDetails(String mobileNumber);
}

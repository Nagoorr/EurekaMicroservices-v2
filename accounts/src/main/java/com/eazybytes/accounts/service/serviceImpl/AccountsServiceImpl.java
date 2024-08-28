package com.eazybytes.accounts.service.serviceImpl;

import com.eazybytes.accounts.dto.AccountsDTO;
import com.eazybytes.accounts.entity.Accounts;
import com.eazybytes.accounts.repo.AccountsRepository;
import com.eazybytes.accounts.service.AccountsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class AccountsServiceImpl implements AccountsService {

    @Autowired
    private AccountsRepository accountsRepository;

    @Override
    public void createAccount(AccountsDTO accountsDTO) {
        Accounts accounts = new Accounts();
        accounts.setAccountNumber(UUID.randomUUID().timestamp());
        accounts.setAccountType(accounts.getAccountType());
        accounts.setBranchAddress(accountsDTO.getBranchAddress());
        accounts.setCustomerId(accountsDTO.getCustomerId());
        accountsRepository.save(accounts);
    }
}

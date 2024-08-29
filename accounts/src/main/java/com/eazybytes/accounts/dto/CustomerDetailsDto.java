package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;


@Data
@Schema(
        name = "Customer Details",
        description = "Schema to hold Customer , Account , Cards , Loans"
)
public class CustomerDetailsDto {
    private CustomerDTO customerDTO;
    private LoansDto loansDto;
    private CardsDto cardsDto;
    private AccountsDTO accountsDTO;
}

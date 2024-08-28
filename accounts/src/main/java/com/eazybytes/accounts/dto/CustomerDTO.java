package com.eazybytes.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CustomerDTO {
    private Long customerId;
    @NotEmpty(message = "name should not empty")
    @Size(min = 5, max = 30 , message = "name should be between 5 and 30")
    private String name;
    @NotEmpty(message = "email should not empty")
    @Email(message = "Email address should be a valid value")
    private String email;
    private String mobileNumber;
    private LocalDateTime createdAt;
    private String createdBy;
    private LocalDateTime updatedAt;
    private String updatedBy;
}

package com.example.prac.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor  // Add this
public class AccountDto {
    private Long id;
    private String accountHolderName;
    private double balance;


}
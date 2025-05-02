package com.example.prac.dto;

import com.example.prac.entity.Account;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class TransactionDto {
    private Long id;
    private String type;
    private double amount;
    private LocalDateTime timestamp;
    private Account account;
}
package com.example.prac.service;

import com.example.prac.dto.TransactionDto;
import com.example.prac.entity.Account;

public interface TransactionService {

    TransactionDto createTransaction(Account account, String type, Double amount);
    TransactionDto getTransactionById(Long id);
    TransactionDto createTransaction(TransactionDto transactionDto);
}

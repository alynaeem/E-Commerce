package com.example.prac.mapper;

import com.example.prac.dto.TransactionDto;
import com.example.prac.entity.Transaction;

public class TransactionMapper {

    public static Transaction mapToTransaction(TransactionDto dto) {
        return new Transaction(
                dto.getId(),
                dto.getType(),
                dto.getAmount(),
                dto.getTimestamp(),
                dto.getAccount()
        );
    }

    public static TransactionDto mapToTransactionDto(Transaction transaction) {
        return new TransactionDto(
                transaction.getId(),
                transaction.getType(),
                transaction.getAmount(),
                transaction.getTimestamp(),
                transaction.getAccount()
        );
    }
}
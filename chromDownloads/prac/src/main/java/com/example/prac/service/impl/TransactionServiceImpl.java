package com.example.prac.service.impl;

import com.example.prac.dto.TransactionDto;
import com.example.prac.entity.Account;
import com.example.prac.entity.Transaction;
import com.example.prac.mapper.TransactionMapper;
import com.example.prac.repository.TransactionRepository;
import com.example.prac.service.TransactionService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class TransactionServiceImpl implements TransactionService {

    private TransactionRepository transactionRepository;

    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }
    @Override
    public TransactionDto createTransaction(Account account, String type, Double amount) {
        Transaction transaction = new Transaction();
        transaction.setAccount(account);
        transaction.setType(type);
        transaction.setAmount(amount);
        transaction.setTimestamp(LocalDateTime.now());

        Transaction savedTransaction = transactionRepository.save(transaction);
        return TransactionMapper.mapToTransactionDto(savedTransaction);
    }
    @Override
    public TransactionDto getTransactionById(Long id) {
        Transaction transaction = transactionRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Transaction Not Found"));
        return TransactionMapper.mapToTransactionDto(transaction);
    }
    public TransactionDto createTransaction(TransactionDto transactionDto) {
        Account account = transactionDto.getAccount(); // or fetch by accountId
        return createTransaction(account, transactionDto.getType(), transactionDto.getAmount());
    }
}

package com.example.prac.service.impl;

import com.example.prac.dto.AccountDto;
import com.example.prac.entity.Account;
import com.example.prac.mapper.AccountMapper;
import com.example.prac.repository.AccountRepository;
import com.example.prac.service.AccountService;
import com.example.prac.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl  implements AccountService {


        private final AccountRepository accountRepository;
        private final TransactionService transactionService;

        public AccountServiceImpl(AccountRepository accountRepository, TransactionService transactionService) {
            this.accountRepository = accountRepository;
            this.transactionService = transactionService;
        }

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto findAccountById(Long id) {
        Account account = accountRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Account Not Found"));
        return AccountMapper.mapToAccountDto(account);
    }

    @Override
    public AccountDto deleteAccountById(Long id) {
        Account account = accountRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Account Not Found"));
        accountRepository.delete(account);
        return AccountMapper.mapToAccountDto(account);

    }

    @Override
    public AccountDto deposit(Long id, Double amount) {
        Account account = accountRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Account Not Found"));
        account.setBalance(account.getBalance() + amount);
        Account savedAccount = accountRepository.save(account);
        transactionService.createTransaction(account, "Deposit", amount);

        return AccountMapper.mapToAccountDto(savedAccount);
    }

    @Override
    public AccountDto withdraw(Long id, Double amount) {
        Account account = accountRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Account Not Found"));
        if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient Balance");
        }
        account.setBalance(account.getBalance() - amount);
        Account savedAccount = accountRepository.save(account);
        transactionService.createTransaction(account, "Withdraw", amount);
        return AccountMapper.mapToAccountDto(savedAccount);


    }

    @Override
    public AccountDto updateAccount(AccountDto accountDto) {
        Account account = accountRepository.findById(accountDto.getId())
                .orElseThrow(() -> new RuntimeException("Account Not Found"));

        account.setAccountHolderName(accountDto.getAccountHolderName());
        account.setBalance(accountDto.getBalance());

        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount); // Fix: return updated data
    }


}

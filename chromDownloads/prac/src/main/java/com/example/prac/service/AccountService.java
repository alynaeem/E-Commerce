package com.example.prac.service;

import com.example.prac.dto.AccountDto;

public interface AccountService {

    AccountDto createAccount(AccountDto accountDto);

    AccountDto  findAccountById(Long id);

    AccountDto deleteAccountById(Long id);

    AccountDto deposit(Long id, Double amount);

    AccountDto withdraw(Long id, Double amount);

    AccountDto updateAccount(AccountDto accountDto);
}

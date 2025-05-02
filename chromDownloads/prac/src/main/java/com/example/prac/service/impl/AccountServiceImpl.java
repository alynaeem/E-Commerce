package com.example.prac.service.impl;

import com.example.prac.dto.AccountDto;
import com.example.prac.entity.Account;
import com.example.prac.mapper.AccountMapper;
import com.example.prac.repository.AccountRepository;
import com.example.prac.service.AccountService;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl  implements AccountService {
    private AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

}

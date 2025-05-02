package com.example.prac.controller;

import com.example.prac.dto.AccountDto;
import com.example.prac.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RequestMapping("api")
@RestController
public class AccountController {
    private AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    //add Account REST api
    @PostMapping("/accounts")
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {

        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }

    //find account rest api

    @PostMapping("/accounts/find")
    public ResponseEntity<AccountDto> findAccountById(@RequestBody Long id){
        return new ResponseEntity<>(accountService.findAccountById(id),HttpStatus.OK);
    }

    @PostMapping("/accounts/delete")
    public ResponseEntity<AccountDto> deleteAccountById(@RequestBody Long id){
        return new ResponseEntity<>(accountService.deleteAccountById(id),HttpStatus.OK);
    }

    @PutMapping("/accounts/{id}/deposit")
    public ResponseEntity<AccountDto> deposit(@PathVariable Long id, @RequestBody Map <String,Double> amount){
        AccountDto accountDto = accountService.deposit(id,amount.get("amount"));
        return ResponseEntity.ok(accountDto);
    }
    @PutMapping("/accounts/{id}/withdraw")
    public ResponseEntity<AccountDto> withdraw(@PathVariable Long id,@RequestBody Double amount){
        return new ResponseEntity<>(accountService.withdraw(id,amount),HttpStatus.OK);
    }
    @PutMapping("/accounts/update")
    public ResponseEntity<AccountDto> updateAccount(@RequestBody AccountDto accountDto){
        return new ResponseEntity<>(accountService.updateAccount(accountDto),HttpStatus.OK);
    }
}

package com.example.userfront.service;

import com.example.userfront.domain.PrimaryAccount;
import com.example.userfront.domain.PrimaryTransaction;
import com.example.userfront.domain.SavingsAccount;
import com.example.userfront.domain.SavingsTransaction;

import java.security.Principal;

public interface AccountService {
    PrimaryAccount createPrimaryAccount();
    SavingsAccount createSavingsAccount();
    void deposit(String accountType, double amount, Principal principal);
    void withdraw(String accountType, double amount, Principal principal);


}



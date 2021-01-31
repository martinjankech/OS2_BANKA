package com.example.userfront.dao;

import com.example.userfront.domain.SavingsAccount;
import org.springframework.data.repository.CrudRepository;

public interface SavingsAccountDao extends CrudRepository <SavingsAccount,Long> {
    SavingsAccount findByAccountNumber (int accountNumber);
}

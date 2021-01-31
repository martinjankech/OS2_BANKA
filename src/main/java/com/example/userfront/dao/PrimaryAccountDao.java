package com.example.userfront.dao;

import com.example.userfront.domain.PrimaryAccount;
import org.springframework.data.repository.CrudRepository;

public interface PrimaryAccountDao extends CrudRepository<PrimaryAccount,Long> {
PrimaryAccount findByAccountNumber(int accountNumber);
}

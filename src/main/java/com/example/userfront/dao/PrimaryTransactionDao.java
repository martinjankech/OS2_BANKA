package com.example.userfront.dao;

import com.example.userfront.domain.PrimaryTransaction;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PrimaryTransactionDao extends CrudRepository<PrimaryTransaction,Long> {
    List<PrimaryTransaction> findAll();
}

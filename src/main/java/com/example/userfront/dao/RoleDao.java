package com.example.userfront.dao;

import com.example.userfront.domain.Security.Role;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by z00382545 on 10/20/16.
 */
public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}

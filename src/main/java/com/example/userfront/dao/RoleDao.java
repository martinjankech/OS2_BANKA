package com.example.userfront.dao;

import com.example.userfront.domain.Security.Role;
import org.springframework.data.repository.CrudRepository;


public interface RoleDao extends CrudRepository<Role, Integer> {
    Role findByName(String name);
}

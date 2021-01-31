package com.example.userfront.service;

import com.example.userfront.domain.Security.UserRole;
import com.example.userfront.domain.User;

import java.util.Set;

public interface UserService {
    User findByUsername(String username);

    User findByEmail(String email);

    boolean checkUserExists(String username, String email);

    boolean checkUsernameExists(String username);

    boolean checkEmailExists(String email);
    void save (User user);

    User createUser (User user, Set<UserRole> userRoles);
public User saveUser(User user);

}

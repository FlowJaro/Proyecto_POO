package com.valo.esports.service;

import com.valo.esports.model.User;
import com.valo.esports.repository.UserRepository;

public class UserService {

    private UserRepository repo = new UserRepository();

    public void register(String username, String password, String email) throws Exception {
        User user = new User(username, password, email);
        repo.register(user);
    }

    public boolean login(String username, String password) throws Exception {
    return repo.login(username, password);
    
    }

    public void deactivate(String username) throws Exception {
    repo.deactivate(username);
    
    }

}
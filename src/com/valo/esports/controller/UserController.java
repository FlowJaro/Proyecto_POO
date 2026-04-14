package com.valo.esports.controller;

import com.valo.esports.service.UserService;

public class UserController {

    private UserService service = new UserService();

    public void register(String username, String password, String email) {
        try {
            service.register(username, password, email);
            System.out.println("User registered");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void login(String username, String password) {
    try {
        boolean ok = service.login(username, password);

        if (ok) {
            System.out.println("Login successful");
        } else {
            System.out.println("Invalid credentials");
        }

    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    
    }

    public void deactivate(String username) {
    try {
        service.deactivate(username);
        System.out.println("User deactivated");
    } catch (Exception e) {
        System.out.println("Error: " + e.getMessage());
    }
    
    }


}
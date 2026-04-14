package com.valo.esports.model;

public class User {

    private String username;
    private String password;
    private String email;
    private boolean active;

    public User(String username, String password, String email) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.active = true;
    }

    // GETTERS 
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public boolean isActive() {
        return active;
    }

    // SETTERS 
    public void setEmail(String email) {
        this.email = email;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
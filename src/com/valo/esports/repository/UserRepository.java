package com.valo.esports.repository;

import com.valo.esports.model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserRepository {

    public void register(User user) throws Exception {

        Connection conn = DatabaseConnection.getConnection();

        String sql = "INSERT INTO user (username, password, email) VALUES (?, ?, ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, user.getUsername());
        stmt.setString(2, user.getPassword());
        stmt.setString(3, user.getEmail());

        stmt.executeUpdate();
        conn.close();
    }
    
    public boolean login(String username, String password) throws Exception {

    Connection conn = DatabaseConnection.getConnection();

    String sql = "SELECT * FROM user WHERE username=? AND password=? AND active=1";
    PreparedStatement stmt = conn.prepareStatement(sql);

    stmt.setString(1, username);
    stmt.setString(2, password);

    ResultSet rs = stmt.executeQuery();

    boolean exists = rs.next();

    conn.close();

    return exists;

    }

    public void deactivate(String username) throws Exception {

    Connection conn = DatabaseConnection.getConnection();

    String sql = "UPDATE user SET active = 0 WHERE username = ?";
    PreparedStatement stmt = conn.prepareStatement(sql);

    stmt.setString(1, username);

    stmt.executeUpdate();
    conn.close();
    
    }


}
package com.valo.esports.repository;

import com.valo.esports.model.Category;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CategoryRepository {

    public void create(Category category) throws Exception {
        Connection conn = DatabaseConnection.getConnection();

        String sql = "INSERT INTO category (name) VALUES (?)";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, category.getName());

        stmt.executeUpdate();
        conn.close();
    }

    public List<String> getAll() throws Exception {
        Connection conn = DatabaseConnection.getConnection();

        String sql = "SELECT * FROM category";
        PreparedStatement stmt = conn.prepareStatement(sql);

        ResultSet rs = stmt.executeQuery();

        List<String> categories = new ArrayList<>();

        while (rs.next()) {
            categories.add(rs.getString("name"));
        }

        conn.close();
        return categories;
    }

    public void update(int id, String name) throws Exception {
        Connection conn = DatabaseConnection.getConnection();

        String sql = "UPDATE category SET name=? WHERE id_category=?";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setString(1, name);
        stmt.setInt(2, id);

        stmt.executeUpdate();
        conn.close();
    }

    public void delete(int id) throws Exception {
        Connection conn = DatabaseConnection.getConnection();

        String sql = "DELETE FROM category WHERE id_category=?";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.setInt(1, id);

        stmt.executeUpdate();
        conn.close();
    }
}
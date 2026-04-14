package com.valo.esports.controller;

import com.valo.esports.service.CategoryService;

public class CategoryController {

    private CategoryService service = new CategoryService();

    public void create(String name) {
        try {
            service.create(name);
            System.out.println("Category created");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void getAll() {
        try {
            System.out.println(service.getAll());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void update(int id, String name) {
        try {
            service.update(id, name);
            System.out.println("Category updated");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void delete(int id) {
        try {
            service.delete(id);
            System.out.println("Category deleted");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
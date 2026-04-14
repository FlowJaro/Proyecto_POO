package com.valo.esports.service;

import com.valo.esports.model.Category;
import com.valo.esports.repository.CategoryRepository;
import java.util.List;

public class CategoryService {

    private CategoryRepository repo = new CategoryRepository();

    public void create(String name) throws Exception {
        repo.create(new Category(name));
    }

    public List<String> getAll() throws Exception {
        return repo.getAll();
    }

    public void update(int id, String name) throws Exception {
        repo.update(id, name);
    }

    public void delete(int id) throws Exception {
        repo.delete(id);
    }
}
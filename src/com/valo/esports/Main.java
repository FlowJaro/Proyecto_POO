package com.valo.esports;

import com.valo.esports.controller.UserController;
import com.valo.esports.controller.CategoryController;

public class Main {
    public static void main(String[] args) {

        UserController controller = new UserController();
        
        // prueba registro
        controller.register("luis", "1234", "luis@mail.com");
        
        // prueba login
        controller.login("luis", "1234");
        
        // prueba desactivar            
        controller.deactivate("luis");
        
        CategoryController categoryController = new CategoryController();   
        categoryController.create("FPS");
        categoryController.create("MOBA");
        categoryController.getAll();
        categoryController.update(1, "Shooter");
        categoryController.delete(2);
        categoryController.getAll();
 
 
    }
}
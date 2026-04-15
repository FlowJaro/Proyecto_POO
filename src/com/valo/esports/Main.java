package com.valo.esports;

import com.valo.esports.controller.UserController;
import com.valo.esports.controller.CategoryController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserController userController = new UserController();
        CategoryController categoryController = new CategoryController();

        System.out.println("=== VALORANT ESPORTS SYSTEM ===");

        // REGISTRO
        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        System.out.print("Enter email: ");
        String email = sc.nextLine();

        userController.register(username, password, email);

        // LOGIN
        System.out.println("\n--- LOGIN ---");
        userController.login(username, password);

        // INACTIVAR
        System.out.println("\n--- DEACTIVATE USER ---");
        userController.deactivate(username);

        // LOGIN FALLA
        System.out.println("\n--- LOGIN AGAIN ---");
        userController.login(username, password);

        // CATEGORY
        System.out.println("\n--- CATEGORY ---");
        categoryController.create("FPS");
        categoryController.create("MOBA");

        categoryController.getAll();

        sc.close();
    }
}
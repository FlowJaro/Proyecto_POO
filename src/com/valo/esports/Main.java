package com.valo.esports;

import com.valo.esports.controller.UserController;
import com.valo.esports.controller.CategoryController;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        UserController userController = new UserController();
        CategoryController categoryController = new CategoryController();

        int option;

        do {
            System.out.println("\n=== VALORANT ESPORTS SYSTEM ===");
            System.out.println("1. Register User");
            System.out.println("2. Login");
            System.out.println("3. Deactivate User");
            System.out.println("4. Create Category");
            System.out.println("5. Show Categories");
            System.out.println("6. Update Category");
            System.out.println("7. Delete Category");
            System.out.println("0. Exit");

            System.out.print("Choose option: ");
            option = sc.nextInt();
            sc.nextLine(); // limpiar buffer

            switch (option) {

                case 1:
                    System.out.print("Username: ");
                    String username = sc.nextLine();

                    System.out.print("Password: ");
                    String password = sc.nextLine();

                    System.out.print("Email: ");
                    String email = sc.nextLine();

                    userController.register(username, password, email);
                    break;

                case 2:
                    System.out.print("Username: ");
                    String loginUser = sc.nextLine();

                    System.out.print("Password: ");
                    String loginPass = sc.nextLine();

                    userController.login(loginUser, loginPass);
                    break;

                case 3:
                    System.out.print("Username to deactivate: ");
                    String userToDeactivate = sc.nextLine();

                    userController.deactivate(userToDeactivate);
                    break;

                case 4:
                    System.out.print("Category name: ");
                    String name = sc.nextLine();

                    categoryController.create(name);
                    break;

                case 5:
                    categoryController.getAll();
                    break;

                case 6:
                    System.out.print("Category ID: ");
                    int updateId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("New name: ");
                    String newName = sc.nextLine();

                    categoryController.update(updateId, newName);
                    break;

                case 7:
                    System.out.print("Category ID: ");
                    int deleteId = sc.nextInt();

                    categoryController.delete(deleteId);
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option");
            }

        } while (option != 0);

        sc.close();
    }
}
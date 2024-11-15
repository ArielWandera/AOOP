package main;

import Items.Items;
import Users.Users;
import Utility.Utility;
import Transactions.Transactions;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Users user=null;


        boolean isValidateUser=false;


while (!isValidateUser) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("=== User Registration ===");


    System.out.print("Enter username: ");
    String username = scanner.nextLine();


    System.out.print("Enter email: ");
    String email = scanner.nextLine();

    System.out.print("Enter password(Must have atleast 8 characters): ");
    String password = scanner.nextLine();

    System.out.print("Enter balance: ");
    double balance = scanner.nextDouble();


    if (isValidateUser == Utility.validateUser(username, email, password)) {
        System.out.println("User creation failed due to invalid input.");
        System.out.println("Please try again");
    } else {

        user = new Users(username, balance, email, password);
        isValidateUser = true;
        System.out.println("User created successfully: " + username);


    }

}

    Items w2 = new Items("Cement", 5, 56000, 13);
    Items w3 = new Items("Bicycle", 56, 370000, 4);
    Items w4 = new Items("Bread", 566, 5622, 67);
    Items w5 = new Items("Eggs", 5660, 13000, 87);

    Items.printItems();


    Transactions.buyItems(user, w2, 3);
    Transactions.getRefund(user, w2, 2);
    Transactions.getRefund(user, w4, 3);


    user.printDetails();


    }
}
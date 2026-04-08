/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.discountchecker;

/**
 *
 * @author mdewlok
 */

import java.util.Scanner;
public class DiscountChecker {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt user for age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        input.nextLine(); // clear buffer

        // Prompt user for membership status
        System.out.print("Are you a member? (yes/no): ");
        String membership = input.nextLine();

        // Check discount eligibility using OR (||)
        if (age >= 60 || membership.equalsIgnoreCase("yes")) {
            System.out.println("You qualify for a discount!");
        } else {
            System.out.println("Sorry, you do not qualify for a discount.");
        }

        input.close();
    }
}

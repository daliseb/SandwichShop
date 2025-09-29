package com.pluralsight;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double price = 0.00;

        //Prompt user for size of sandwich
        System.out.println("Please enter the size of the sandwich! (1= reg or 2=large): ");
        int sandwichSize = input.nextInt();
        if (sandwichSize == 1) {
            price = 5.45;  //price of reg sandwich
        } else if (sandwichSize == 2) {
            price = 8.95;  //price of large sandwich

//prompt user for loaded sandwich
            System.out.println("Would you like your sandwich loaded? (3= loaded regular, 4= loaded large. (if none, press 5)");
            {
                int sandwichLoaded = input.nextInt();
                if (sandwichLoaded == 3) {
                    price = 5.45 + 1.00; //additional $1 upcharge
                } else if (sandwichLoaded == 4) {
                    price = 8.95 + 1.75;

                }

// prompt user for age
                System.out.println("Enter your age:");
                {
                    int age = input.nextInt();

                    //applying corresponding discount
                    if (age <= 17) {
                        price = price * 0.90;  //10% discount
                    } else if (age >= 65) {
                        price = price * 0.80; //20% discount

                    }
                    System.out.printf("The cost of your sandwich is: $ %.2f", price);

                }


            }

        }
    
package com.ehsan.controlStatement;

import java.util.Scanner;

public class getUserInput {
    public static void main(String[] args) {
        Scanner userName = new Scanner(System.in);
        System.out.println("Enter the USERNAME:\n");

        String newUser = userName.nextLine();
        System.out.println("your USERNAME is: " + newUser);
    }
}


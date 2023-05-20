package com.ehsan.controlStatement;

import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        Scanner myInt = new Scanner(System.in);
        int newInt = 0;

        do {
            System.out.println("enter a new int number");
            newInt = myInt.nextInt();
        }
        while (newInt != 5);




        System.out.println(newInt);
    }
}

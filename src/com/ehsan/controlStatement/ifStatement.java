package com.ehsan.controlStatement;

import java.util.Objects;
import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {

        //check the age! LOL!! age not matters! MEOW
        Scanner userAge = new Scanner(System.in);
        System.out.println("Input your age!\n");
        int age = userAge.nextInt();
        if (age < 30) {
            System.out.println("you are qualified");
        } else {
            System.out.println("you are over age");
        }

        // check the Admin of the site
        System.out.println("enter your username!\n");
        Scanner userName = new Scanner(System.in);
        String exactName = userName.nextLine();
        if (Objects.equals(exactName, "ehsan")) {
            System.out.println("you are the Admin of the site");
        }


        while (age < 30) {
            age ++;
            System.out.println(age);

            if (age==30) {
                break;
            }
        }


    }
}

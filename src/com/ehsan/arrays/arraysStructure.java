package com.ehsan.arrays;

import java.util.Arrays;

public class arraysStructure {
    public static void main(String[] args) {
        //int age;

        int[] ages = new int[4];

        ages[0] = 27;
        ages[1] = 28;
        ages[2] = 29;
        ages[3] = 30;

        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);

        System.out.println(Arrays.toString(ages));
        System.out.println(ages.length);



        int[] age = {25,23,23};
        for (int i = 0; i <= age.length; i++ ) {
            System.out.println(age[i]);
        }

    }
}

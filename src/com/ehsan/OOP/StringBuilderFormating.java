package com.ehsan.OOP;

public class StringBuilderFormating {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("");

        // we are not create new string, we are just modify it by append and save it in the same sb.
        // append return a reference to the stringbuilder objects
        sb.append("Ehsan Rezazadeh!");
        sb.append(" ");
        sb.append("I am going to be the best Java developer after 5 years");

        System.out.println(sb.toString());


        ///////////STRING FORMATING///////////


        // formatting int
        System.out.printf("I'm %d,  and u are %d\n", 6,12); //int -> %d


        // formatting float

        System.out.printf("my sum is %f\n", 22.1);


    }
}

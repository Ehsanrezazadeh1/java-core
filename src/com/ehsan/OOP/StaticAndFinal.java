package com.ehsan.OOP;

class Thing {

    public static final int LUCKY_NUMBER = 2; // Thing.LUCKY_NUMBER
    //we use static to access it by the name of the class. Thing.LUCKY_NUMBER

    public String name;
    public static String description;


    public static void showInfo() {
        System.out.println("Hello");
    }
}

public class StaticAndFinal {
    public static void main(String[] args) {

        Thing.showInfo();



        Thing thing1 = new Thing();
        Thing thing2 = new Thing();
        thing1.name = "Ehsan";
        thing2.name = "Reza";

        Thing.description = "I access just by the class ";

        System.out.println(Thing.LUCKY_NUMBER);


    }
}

package com.ehsan.OOP.inheritance;

public class Inheritance {
    public static void main(String[] args) {
        Machine mach1 = new Machine();

        mach1.start();
        mach1.stop();

        Car car1 = new Car();
        car1.start(); // Car is the child of Machine here (Car extends Machine)

        car1.changGear();

        ////////////////@override/////////////////
        car1.start();
        car1.stop();


        //////////////////////////////////

    }
}

package com.ehsan.OOP.inheritance;

public class Car extends Machine{ // Car is the child of Machine


    @Override
    public void start() {
        System.out.println("hello from car");
    }

    @Override
    public void stop() {
        System.out.println("BYE BYE from car");
    }

    public void changGear() {
        System.out.println("the gear was changed!");
    }

}

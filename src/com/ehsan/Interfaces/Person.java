package com.ehsan.Interfaces;

public class Person implements Info {
    private String name;

    public Person(String name) {
        this.name = name;
    }


    @Override
    public void showInfo() {
        System.out.println("the person name is: " + name);
    }

    @Override
    public void showIndex() {

    }
}

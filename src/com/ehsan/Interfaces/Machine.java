package com.ehsan.Interfaces;

public class Machine implements Info,State {
    private int id;

    public Machine(int id) {
        this.id = id;
    }

    @Override
    public void showInfo() {
        System.out.println("Machine id is: " + id);
    }

    @Override
    public void showIndex() {
        System.out.println("this is second method in Interface that used in Machine class");
    }

    @Override
    public void showUserStatement() {
        System.out.println("this is a example to use 2 Interface in a class");
    }
}

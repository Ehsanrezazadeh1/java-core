package com.ehsan.OOP;

class Machine {
    private String name;
    private String code;

    public Machine(String name, String code) {
        this.name = name;
        this.code = code;
    }
}

public class Constructors {
    public static void main(String[] args) {
        Machine machine1 = new Machine("Ehsan","rez");
        System.out.println();

    }
}

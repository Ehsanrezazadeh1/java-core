package com.ehsan.OOP;

class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + ": " + name;
    }
}

public class toStringMethod {
    public static void main(String[] args) {

        Student student1 = new Student(1,"Ehsan");
        Student student2 = new Student(2,"Reza");
        System.out.println(student1);
        System.out.println(student2);

    }
}

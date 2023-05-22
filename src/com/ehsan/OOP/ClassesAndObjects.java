package com.ehsan.OOP;


import java.util.Scanner;

class Person {
    String name;

   int age;


    void speak() {
        for (int age = 0; age<=30; age++) {
            System.out.println("my name is " + name + " and I'm " + age + "years old");
        }
    }

}

public class ClassesAndObjects {
    public static void main(String[] args) {



        Person person1 = new Person();
        person1.name = "Ehsan";
        person1.age = 27;

        System.out.println(person1.name);
        System.out.println(person1.age);

        Person person2 = new Person();
        person2.name = "Mehdi";
        person2.speak();
    }
}

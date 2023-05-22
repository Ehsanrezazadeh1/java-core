package com.ehsan.OOP;

class Personn {
    String name;
    int age;

    int calculateYearsToRetiremnet() {
        int yearsToretirement = 65 - age;

        return yearsToretirement;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class GetAndReturn {
    public static void main(String[] args) {
        Personn person1 = new Personn();

        person1.name = "Ehsan";
        person1.age = 27;



        int years = person1.calculateYearsToRetiremnet();



        int age = person1.getAge();
        String name = person1.getName();
        System.out.println(name + age);

        System.out.println(years);


    }
}

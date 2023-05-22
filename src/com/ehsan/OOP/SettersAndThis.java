package com.ehsan.OOP;

class Frog {
    private String name;
    private int age;


    //setters and getters




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name; //this.name is the name that we wrote in line 4 , and name is the new name that we want to set it. exple : Ehsan ,,, this.name = Ehsan
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void setInfo(String name, int age) {
        setName(name);
        setAge(age);
    }
}

public class SettersAndThis {
    public static void main(String[] args) {

        Frog frog1 = new Frog();
        Frog frog2 = new Frog();

        // we have no access to name and age because we set them private in Frog class. but we can modify them by using setters and getters. LOL Java is very Cool!!
//        frog1.name = "ehsan";
//        frog1.age = 2;

        frog1.setName("Ehsan");
        frog1.setAge(3);

        frog2.setAge(33);
        frog2.setName("Reza");

        frog1.setInfo("milad", 22);


        System.out.println(frog1.getAge());
        System.out.println(frog1.getName());

        System.out.println(frog2.getAge());
        System.out.println(frog2.getName());
    }
}

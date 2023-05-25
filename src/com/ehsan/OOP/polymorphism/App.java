package com.ehsan.OOP.polymorphism;

public class App {
    public static void main(String[] args) {
        Plant plant1 = new Plant();
        plant1.helloType();

        Tree tree1 = new Tree();
//        tree1.treeType();


        //Tree tree2 = plant1;

        Plant plant2 = tree1;  // CUZ tree is the subclass of plant. tree is a plant
        plant2.helloType();  //because plant to referenced to tree, so it use tree's method.
        // wat matters is that the obj that the variable referenced.


        ////////////example fo doPolymorphism///////////
        doPolymorphism(tree1);

        // where we have parent class (Plant) we can use child class too.(Tree)
    }

    public static void doPolymorphism(Plant plant) {
        System.out.println("the real example");
    }

}

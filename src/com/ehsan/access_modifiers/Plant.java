package com.ehsan.access_modifiers;

public class Plant {

    //bad practice
    public String name;
    private String type;  // we can access it just in Plant.java in the scope of it

    protected String size;

    //acceptable practice cuz its final!
    public final int ID;

    public Plant(String name, String type, int ID,String size) {
        this.name = name;
        this.type = type;
        this.ID = ID;
        this.size = size;
    }
}

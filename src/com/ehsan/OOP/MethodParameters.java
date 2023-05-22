package com.ehsan.OOP;

class Robot {
    public void speak(String text) {
        System.out.println(text);
    }

    public void jump(int height) {
        System.out.println("jumping " + height);
    }

    public void address(int metters,String cityName ) {
        System.out.println("go " + metters + " and " + "the city name is " + cityName);
    }

}

public class MethodParameters {
    public static void main(String[] args) {
        Robot ehsan = new Robot();
        ehsan.speak("Meow");
        ehsan.jump(22);
        ehsan.address(22,"Tehran");

    }
}

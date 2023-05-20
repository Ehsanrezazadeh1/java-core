package com.ehsan.controlStatement;

import java.util.Scanner;

public class switchKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please enter a command: ");

        String command = scanner.nextLine();

        switch (command) {
            case "start":
                System.out.println("start the VM");
                break;

            case "stop":
                System.out.println("stop the Vm as soon as possible");
                break;
            default:
                System.out.println("command not found");
        }
    }
}

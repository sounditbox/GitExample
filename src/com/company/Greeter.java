package com.company;


import java.util.Scanner;

public class Greeter {
    public static void greet() {
        System.out.println("Hello world!");
    }

    public static void greet(String name) {
        System.out.println("Hello " + name + "! \nYou're cool bro! Have a nice day");
    }

    public static void talk() {
        var scanner = new Scanner(System.in);
        Greeter.greet();
        System.out.println("What's your name, bro?");
        String name = scanner.nextLine();
        Greeter.greet(name);

    }
}

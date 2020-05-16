package sda.oop;

import sda.oop.model.User;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");

        User u1 = new User("Adam", "Stępień", "a@a.com","1234");
        System.out.println(u1.toString());
    }
}

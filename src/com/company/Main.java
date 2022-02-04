package com.company;

public class Main {

    public static void main(String[] args) {
        Pets pets = new Pets("Kim", 5, "Male");
        System.out.println(pets.toString() + "\n");
        Cat cat = new Cat("Mitzi", 1, "Tabby", "Female", true);
        System.out.println(cat.toString() + "\n");
	    Dog dog = new Dog("Milo", 5, "Pure Evil", "Male", false);
        System.out.println(dog.toString());
    }
}

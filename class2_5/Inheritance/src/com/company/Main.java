package com.company;
import java.util.Date;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Dog dog = new Dog("Happy", new Date(),"Dalmation" );
        Cat cat = new Cat("Mickey", new Date(), "Saimese");
        Elephant elephant = new Elephant("Ruby", new Date(), "Indian");
        Fish fish = new Fish("slurp", new Date(), "fighter");

        dog.eat();
    }
}

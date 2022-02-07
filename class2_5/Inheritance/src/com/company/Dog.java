package com.company;

import java.util.Date;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, Date birthDate, String breed){
        super(name, birthDate);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void eat(){
        System.out.println( this.getName()+ "is eating kebbles");
    }
    public void run(){
        System.out.println(this.getName()+ "is running");
    }
    public void breath(){
        System.out.println(this.getName()+ "is breathing");
    }
}


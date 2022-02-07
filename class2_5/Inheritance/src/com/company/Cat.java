package com.company;

import java.util.Date;

public class Cat extends Animal{

    private String breed;

    public Cat(String name, Date birthDate, String breed){
        super(name,birthDate);
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    public void eat(){
        System.out.println(this.getName()+ "is eating cat food");
    }

    public void run(){
        System.out.println(this.getName()+ "is running");
    }
    public void breath(){
        System.out.println(this.getName()+ "is breathing");
    }
}




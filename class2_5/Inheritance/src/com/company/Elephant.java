package com.company;

import java.util.Date;

public class Elephant extends Animal{
    private String breed;

    public Elephant(String name, Date birthDate, String breed){

        this.breed = breed;
    }



    public String getBreed() {
        return breed;
    }

    public void eat(){
        System.out.println(this.getName()+ "is eating");
    }
    public void run(){
        System.out.println(this.getName()+ "is running");
    }
    public void breath(){
        System.out.println(this.getName()+ "is breathing");
    }
}

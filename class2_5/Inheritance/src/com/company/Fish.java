package com.company;

import java.util.Date;

public class Fish extends Animal{

    private String breed;

    public Fish(String name, Date birthDate, String breed){
        this.breed = breed;
    }


    public String getBreed() {
        return breed;
    }

    public void eat(){
        System.out.println(this.getName()+ "is eating sea food");
    }
    public void swim(){
        System.out.println(this.getName()+ "is swimming");
    }
    public void breath(){
        System.out.println(this.getName()+ "is breathing thru gills");
    }
}

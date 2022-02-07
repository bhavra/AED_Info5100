package com.company;

import java.util.Date;

public class Rhino {
    public String name;
    public Date birthDate;
    public String breed;

    public Rhino(String name, Date birthDate, String breed){
        this.name = name;
        this.birthDate = birthDate;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public String getBreed() {
        return breed;
    }

    public void eat(){
        System.out.println(this.name+ "is eating");
    }
    public void sleep(){
        System.out.println(this.name+ "is sleeping");
    }
    public void run(){
        System.out.println(this.name+ "is running");
    }
    public void breath(){
        System.out.println(this.name+ "is breathing");
    }
}

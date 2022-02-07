package com.company;
import java.lang.String;
import java.util.Date;

public class Animal {
    private String name;
    private Date birthDate;

    public Animal(String name, Date birthDate){
        this.name= name;
        this.birthDate= birthDate;
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
    public void sleep(){
        System.out.println(this.getName()+ "is sleeping");
    }




}

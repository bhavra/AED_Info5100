package com.company;

public class Person {

    String name;
    int id,age;
    public Person(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        System.out.println("");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

package com.company;

public class Professor extends Person {

    public Professor(String name, int ID, int age) {
        super(name, ID, age);
        this.name = name;
        this.ID = ID;
        this.age = age;
    }



}

    public Professor(String name, int ID, int age){
        super(name, ID, age);
    }
    public void giveQuiz(){
        System.out.println("Professor gives quiz");
    }
}


package com.company;

public class Student extends Person {

    public Student(String name, int ID, int age){
        super(name, ID, age);

    }
    public void takeQuiz(){
        System.out.println("Student takes quiz");
    }
}

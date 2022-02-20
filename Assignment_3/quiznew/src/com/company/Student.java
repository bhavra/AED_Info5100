package com.company;

public class Student extends Person{


    public Student( String name, int id, int age){
        super(name, id, age);
    }


    public void takeQuiz(){
        System.out.println("Student - " + this.getName() + "  takes the quiz" );
    }
}

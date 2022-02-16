package com.company;

public class Student {
    private String name;
    private int rollNumber;

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Student(){
        name = "ABC";
        rollNumber = 101;
    }
    public Student(Student student){
        Student student1 = new Student();
        this.name = student.name;
        this.rollNumber = student.rollNumber;
    }



}

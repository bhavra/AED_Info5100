package com.company;

public class Student {
    private String name;
    private int rollNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    Student(int StudentRoll, String StudentName){
        rollNumber = StudentRoll;
        name = StudentName;
    }

    String printName() {
        return name;
    }

    int printRoll() {
        return rollNumber;
    }

    public Student(Student student) {
        rollNumber = student.rollNumber;
        name = student.name;
    }

}

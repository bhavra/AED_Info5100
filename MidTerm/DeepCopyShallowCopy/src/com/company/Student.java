package com.company;

public class Student {
    private String studentName;
    private int studentId;
    private float gpa;

    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public float getGpa() {
        return gpa;
    }
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public Student(String studentName, int studentId, float gpa) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.gpa = gpa;
    }

    Student(Student student){
        this.studentName = student.studentName;
        this.studentId = student.studentId;
        this.gpa = student.gpa;
    }

    public Student(){
        studentName = "Bhavani";
        studentId = 12;
        gpa = 9.7f;
    }

    public void printStudentInfo(){
        System.out.println("------------------------");
        System.out.println("Student Name : " +this.studentName);
        System.out.println("Student ID : " +this.studentId);
        System.out.println("Student gpa : " +this.gpa);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Student A = new Student("Anna", 001, 9.8f);
        Student B = new Student("bha", 002, 9.9f);
        A.printStudentInfo();
        B.printStudentInfo();

        //shallow copy
        //Example1
        Student bhav = A;
        bhav.printStudentInfo();
        //Example2
        Student kim = B;
        kim.printStudentInfo();

        //Deep copy
        Student P = new Student();
        Student Q = new Student(P);
        Q.printStudentInfo();
        Q.setGpa(9.5f);
        Q.printStudentInfo();
    }
}

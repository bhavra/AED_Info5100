package com.company;

public class Main {

    public static void main(String[] args) {

        Employee sample = new Employee();
        Employee A = new Employee(sample);
        A.printEmp();

        A.setEmpName("Anna");
        A.setEmpId(01);
        A.printEmp();

        Employee B = new Employee(sample);
        B.setEmpName("Bhavs");
        B.setEmpId(02);
        B.printEmp();

    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        Employee A = new Employee("Anna", 1);
        Employee B = new Employee("Bhav", 2);
        A.printEmp();
        B.printEmp();

        //Shallow copying here
        //Just pointing to an already available variable
        Employee X = A;
        X.printEmp();

        X.setName("xing");
        X.printEmp();

        B=X;
        B.printEmp();
    }
}

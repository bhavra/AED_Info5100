package com.company;

public class Employee {
    private String name;
    private int id;

    //constructor
    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    //getters
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    //Setter only for name because say we can change name but ID is constant
    public void setName(String name) {
        this.name = name;
    }

    public void printEmp(){
        System.out.println("------------------------");
        System.out.println("Employee Name = " +this.name);
        System.out.println("Employee Id = " +this.id);
    }
}

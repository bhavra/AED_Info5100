package com.company;

public class Shape {
    String name;
    double area, perimeter;

    public Shape(){
        //name = "Iam a Shape";
    }
    public void display() {
        System.out.println("********************");
        System.out.println("Shape: " + name);
        System.out.println("Area of the given shape: " + area);
        System.out.println("Perimeter of the given shape: " + perimeter);
    }
}

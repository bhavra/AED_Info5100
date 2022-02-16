package com.company;

public class Circle extends Shape{
    double radius;

    public Circle(){
        name = "Circle";
        radius = 0;
    }

   public Circle(double Radius){
        name = "Circle";
        radius = Radius;
    }

    public void computeArea(){
        area = 3.14 * radius * radius;
    }

    public void computePerimeter() {
        perimeter = 2 * 3.14 * radius;
    }

}

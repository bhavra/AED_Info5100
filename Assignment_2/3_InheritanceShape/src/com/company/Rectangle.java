package com.company;

public class Rectangle extends Shape{
    double length;
    double width;

    public Rectangle(){
        name = "Rectangle";
        length = 0;
        width = 0;
    }

   // public Rectangle(double length, double width){
    //    this.length = length;
     //   this.width = width;
    //}

    public Rectangle(double Length, double Width) {
        name = "Rectangle";
        length = Length;
        width = Width;
    }

    public void computeArea() {
        area = length * width;
    }
    public void computePerimeter() {
        perimeter = 2*(length + width);
    }
}

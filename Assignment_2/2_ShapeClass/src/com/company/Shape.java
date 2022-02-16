package com.company;

public class Shape {
    String name, color;
    double area, perimeter;

    public Shape shape(String name, String color){
        this.name=name;
        this.color=color;
    }

    public Shape shape(String name, String color, double area, double perimeter){
        this.name=name;
        this.color=color;
        this.area=area;
        this.perimeter=perimeter;
    }


    public void printShape() {
        System.out.println("Shape: " + name);
    }

    public double getArea(){

    }

    public double getPerimeter(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }
}

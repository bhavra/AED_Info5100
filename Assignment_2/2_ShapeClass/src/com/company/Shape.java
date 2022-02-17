package com.company;

public class Shape {
    String name, color;
    float area, perimeter;

    public Shape(String name, String color){
        this.name = name;
        this.color = color;
    }

    public Shape(String name, String color, float area, float perimeter){
        this.name = name;
        this.color = color;
        this.area = area;
        this.perimeter = perimeter;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
    /*public void setName(String name) {
        this.name = name;
    }*/


    public void printShape(){
        System.out.println("-------------------------");
        System.out.println("Name:" + this.getName() + "\nColor:" + this.getColor());
    }
    public void getArea(){

    }
    public void getPerimeter(){

    }

}

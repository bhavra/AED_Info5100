package com.company;

public class Triangle extends Shape{
    float side, base, height;

    public Triangle(String name, String color, float base, float height) {
        super(name, color);
        this.name = name;
        this.color = color;
        this.base = base;
        this.height = height;
    }

    public Triangle(String name, String color, float side) {
        super(name, color);
        this.name = name;
        this.color = color;
        this.side = side;
    }

    public float getSide() {
        return side;
    }

    public void setSide(float side) {
        this.side = side;
    }

    @Override
    public void getPerimeter() {
        perimeter = side * 3 ;
        System.out.println("Perimeter = " + perimeter);
    }

    @Override
    public void getArea(){
        area = 0.5f * base * height;
        System.out.println("Area = " + area);
    }

}


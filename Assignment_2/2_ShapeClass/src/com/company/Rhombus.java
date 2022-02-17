package com.company;

public class Rhombus extends Shape{
    float diagonal1, diagonal2;


    public Rhombus(String name, String color, float diagonal1, float diagonal2){
        super(name, color);
        this.name = name;
        this.color = color;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public Rhombus(String name, String color, float diagonal1){
        super(name, color);
        this.name = name;
        this.color = color;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal1;
    }

    public float getDiagonal1() {
        return diagonal1;
    }

    public float getDiagonal2() {
        return diagonal2;
    }

    @Override
    public void getPerimeter() {
        perimeter = (int)(2 * Math.sqrt(Math.pow(diagonal1, 2) + Math.pow(diagonal2, 2)));
        System.out.println("Perimeter = " + perimeter);
    }

    @Override
    public void getArea(){
        area = (diagonal1 * diagonal2) / 2;
        System.out.println("Area = " + area);
    }

}

package com.company;

public class Main {

    public static void main(String[] args) {

        Triangle tri1 = new Triangle("Triangle1", "yellow", 5);
        Triangle tri2 = new Triangle("Triangle2", "red", 5, 10);
        tri1.printShape();
        tri1.getPerimeter();
        tri2.printShape();
        tri2.getArea();

        Rhombus rom1 = new Rhombus("Rhombus1", "green", 3,3);
        Rhombus rom2 = new Rhombus("Rhombus2", "blue", 5,5);
        rom1.printShape();
        rom1.getPerimeter();
        rom2.printShape();
        rom2.getArea();

    }
}

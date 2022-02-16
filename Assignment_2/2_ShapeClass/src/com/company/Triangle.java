package com.company;

public class Triangle extends Shape {
    int base, height, side;

    public Triangle triangle(int base, int height){
        name = "Triangle";
        this.base=base;
        this.height=height;
    }

    public Triangle triangle(int side){
        this.side=side;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        area = 0.5 * getBase();
        return super.getArea();
    }

    @Override
    public double getPerimeter() {

        return super.getPerimeter();
    }
}


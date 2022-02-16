package com.company;

public class Rhombus extends Shape{
    int diagonal1, diagonal2;

    public Rhombus rhombus(int diagonal1, int diagonal2){
        name = "Rhombus";
        this.diagonal1=diagonal1;
        this.diagonal2=diagonal2;
    }

    public Rhombus rhombus(int diagonal1){
        this.diagonal1=diagonal1;
    }

    public int getDiagonal1() {
        return diagonal1;
    }

    public void setDiagonal1(int diagonal1) {
        this.diagonal1 = diagonal1;
    }

    public int getDiagonal2() {
        return diagonal2;
    }

    public void setDiagonal2(int diagonal2) {
        this.diagonal2 = diagonal2;
    }

    @Override
    public double getArea() {
        return super.getArea();
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }
}

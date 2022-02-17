package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {

/*        Triangle tri1 = new Triangle("Triangle1", "yellow", 5);
        Triangle tri2 = new Triangle("Triangle2", "red", 5, 10);
        tri1.printShape();
        tri1.getPerimeter();
        tri2.printShape();
        tri2.getArea();*/

        Scanner triname = new Scanner(System.in);
        System.out.println("Enter shape :");
        String name = triname.nextLine();

        if (name.equalsIgnoreCase("triangle")){
            Scanner tricolor = new Scanner(System.in);
            System.out.println("Enter the color of Triangle :");
            String color = tricolor.nextLine();
            Scanner triside = new Scanner(System.in);
            System.out.println("Enter the length of its side:");
            float side = triside.nextFloat();
            Scanner tribase = new Scanner(System.in);
            System.out.println("Enter the base of the triangle:");
            float base = tribase.nextFloat();
            Scanner triheight = new Scanner(System.in);
            System.out.println("Enter the height of the triangle:");
            float height = triheight.nextFloat();
            Triangle tri1 = new Triangle(name,color,side);
            Triangle tri2 = new Triangle(name,color,base,height);
            tri1.printShape();
            tri1.getPerimeter();
            tri2.printShape();
            tri2.getArea();
        }
        else if (name.equalsIgnoreCase("rhombus")){
            Scanner romcolor = new Scanner(System.in);
            System.out.println("Enter the color of Rhombus :");
            String color = romcolor.nextLine();
            Scanner romdiag1 = new Scanner(System.in);
            System.out.println("Enter the length of its first diagonal:");
            float diagonal1 = romdiag1.nextFloat();
            Scanner romdiag2 = new Scanner(System.in);
            System.out.println("Enter the length of its second diagonal:");
            float diagonal2 = romdiag2.nextFloat();
            if(diagonal1 == diagonal2){
                Rhombus rom2 = new Rhombus(name,color,diagonal1);
                rom2.printShape();
                rom2.getArea();
            }
            else{
                Rhombus rom1 = new Rhombus(name,color,diagonal1,diagonal2);
                rom1.printShape();
                rom1.getPerimeter();
            }
        }
        else{
            System.out.println("Invalid Input");
        }


/*        Rhombus rom1 = new Rhombus("Rhombus1", "green", 3,3);
        Rhombus rom2 = new Rhombus("Rhombus2", "blue", 5,5);
        rom1.printShape();
        rom1.getPerimeter();
        rom2.printShape();
        rom2.getArea();*/

    }
}

package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Box box1 = new Box(2, 2, 2);
        Box box2 = new Box(5, 10, 5);
        double volume1 = box1.calculateVolume();
        double volume2 = box2.calculateVolume();
        System.out.println("Volume of the box1 :  " + volume1);
        System.out.println("Volume of the box2 :  " + volume2);
    }
}

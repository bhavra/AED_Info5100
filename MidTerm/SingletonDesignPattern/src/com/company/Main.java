package com.company;

public class Main {

    public static void main(String[] args) {

            Camera myCam1 = Camera.getInstance();

            myCam1.setCameraName("My Camera 1");

            Camera myCam2 = Camera.getInstance();
            System.out.println(myCam1.getCameraName());
            System.out.println(myCam2.getCameraName());

            myCam2.setCameraName("My Camera 2");
            System.out.println(myCam1.getCameraName());
            System.out.println(myCam2.getCameraName());

    }
}

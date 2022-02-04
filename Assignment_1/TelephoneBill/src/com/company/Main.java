package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of calls: ");
        try{
            int calls = sc.nextInt();
            billCalculator(calls);
        }catch (Exception e){
            System.out.println("The entered value is not an integer. Please enter an integer for the number of calls");
        }
    }

    private static void billCalculator (int calls){
        double total;
        int condition = 0;

        if (calls <= 100) {
            condition = 1;
        }else if (calls > 100 && calls <= 150){
            condition = 2;
        }else if (calls > 150 && calls <= 200){
            condition = 3;
        }else if (calls > 200) {
            condition = 4;
        }


        switch (condition) {
            case 1 -> {
                total = 200;
                System.out.println("your bill :" + total);
            }
            case 2 -> {
                calls = calls - 100;
                total = 200 + (calls * 0.60f);
                System.out.println("your bill :" + total);
            }
            case 3 -> {
                calls = calls - 150;
                total = 200 + (50 * 0.60f) + (calls * 0.50f);
                System.out.println("your bill :" + total);
            }
            case 4 -> {
                calls = calls - 200;
                total = 200 + (50 * 0.60f) + (50 * 0.50f) + (calls * 0.40f);
                System.out.println("your bill :" + total);
            }
            default -> System.out.println("Invalid Input");
        }

    }



}

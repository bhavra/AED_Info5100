package com.company;

import java.sql.SQLOutput;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the grade in (A,B,C,D,F, type Q to quit): ");
            String grade = sc.nextLine();

            if (grade.equalsIgnoreCase("A")){
                System.out.println("Excellent");
            }
            else if (grade.equalsIgnoreCase("B")){
                System.out.println("Good");
            }
            else if (grade.equalsIgnoreCase( "C")){
                System.out.println("Average");
            }
            else if (grade.equalsIgnoreCase( "D")){
                System.out.println("Deficient");
            }
            else if (grade.equalsIgnoreCase( "F")){
                System.out.println("Failing");
            }
            else if (grade.equalsIgnoreCase("Q")){
                break;
            }
            else{
                System.out.println("Invalid Input");
            }
        }
    }
}

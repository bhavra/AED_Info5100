package com.company;

public class Main {

    public static void main(String[] args) {
       int year=1900;
	    if(isLeapYear1(year))
            System.out.println(year+ " is a leap year");
        else
            System.out.println(year+ " is not a leap year");

       /* if (((year % 4 == 0) && (year % 100 != 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year"); */
    }

    private static boolean isLeapYear1(int year){
        if(year % 4 == 0){
            if(year % 100 == 0)
            {
                if(year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else return true;
        }
        else return true;
    }

}

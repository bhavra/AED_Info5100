package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //String str1 = "listen";
        //String str2 = "silent";

        Scanner input = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String str1 = input.nextLine();
        System.out.println("Enter second String: ");
        String str2 = input.nextLine();

        char[] arr1= str1.toCharArray();
        char[] arr2= str2.toCharArray();

        if (arr1.length == arr2.length) {
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            boolean result = Arrays.equals(arr1, arr2);
            if (result == true) {
                System.out.println("Given Strings are Anagrams");
            } else {
                System.out.println("Given strings are not Anagrams");
            }
        }
        else{
            System.out.println("Given strings are not Anagrams");
        }

    }
}

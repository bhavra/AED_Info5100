package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        String str = "a";
        System.out.println("Given input string is : " + str);
        if(isPalindrome(str))
            System.out.println("Given string is palindrome");
            else
            System.out.println("Given string is not palindrome");
    }

     private static boolean isPalindrome(String str){
            int length = str.length();

                char[] arr = str.toCharArray();
                int i=0; int j=length-1;
                while (i<j)
                    {
                        if(arr[i] != arr[j])
                            return false;
                        i++; j--;
                    }
                return true;


        }



}





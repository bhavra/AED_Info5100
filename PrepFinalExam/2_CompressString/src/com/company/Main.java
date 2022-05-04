package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string : ");
        String input = sc.nextLine();
        System.out.println("Length of original string : " +input.length());
        String output = compress(input);
        System.out.println("compressed string : "+output);
        System.out.println("length of compressed string : " +output.length());
    }

    public static String compress(String input){
        if(input.length()<2){
            return input;
        }
        StringBuilder sb = new StringBuilder();
        int i, count = 1;
        String output = "";
        for(i = 0; i< input.length(); i++){
            if( i+1<input.length() && input.charAt(i) == input.charAt(i+1) ){
                count++;
                continue;
            }
            sb.append(input.charAt(i));

            if(count>1){
                sb.append(count);
                count=1;
            }
        }

        return sb.toString();
    }
}

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(sumZero(5)));
        System.out.println(Arrays.toString(sumZero(3)));
    }

    public static int[] sumZero(int n){
        if(n<0){
            System.out.println("invalid input");
        }

        int[] result = new int[n];
        int left = 0;
        int right = n - 1;
        int digit = 1;

        while (left < right) {
            result[left] = digit;
            left++;
            result[right] = -digit;
            right--;
            digit++;
        }
        return result;
    }

}

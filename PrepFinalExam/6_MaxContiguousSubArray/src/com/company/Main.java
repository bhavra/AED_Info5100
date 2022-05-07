package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int len = sc.nextInt();
        System.out.println("Enter the array values : ");
        int[] input = new int[20];
        for (int a=0; a<len; a++){
            input[a]=sc.nextInt();
        }
        System.out.println("Maximum sum of subarray : "+maxSubArray(input));
    }

    public static int maxSubArray(int[] inputArray){
        int maxsum = inputArray[0];
        int cursum = maxsum;

        for(int i = 1; i<inputArray.length; i++){
            cursum = Math.max(inputArray[i]+cursum , inputArray[i]);
            maxsum = Math.max(cursum,maxsum);
        }
        return maxsum;
    }
}

package com.company;
import java.sql.SQLOutput;
import java.util.*;
import java.lang.reflect.Array;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of prices : ");
        int len = sc.nextInt();
        System.out.println("Enter the prices : ");
        int[] input = new int[20];
        for (int a=0; a<len; a++){
            input[a]=sc.nextInt();
        }
        System.out.println("Maximum Profit : "+maximumProfit(input));

    }

    public static int maximumProfit(int[] prices){
        int minval = Integer.MAX_VALUE;
        int maxprofit = 0;
        for(int i = 0; i<prices.length; i++){
            if(prices[i]<minval){
                minval = prices[i];
            }
            else if(prices[i]-minval > maxprofit){
                maxprofit = prices[i]-minval;
            }
        }
        return maxprofit;
    }




}

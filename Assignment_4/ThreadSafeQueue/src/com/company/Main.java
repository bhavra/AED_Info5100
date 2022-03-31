package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ThreadSafe th1 = new ThreadSafe<>();
        th1.add(1);
        th1.add(2);
        th1.add(3);
        System.out.println("--------------------------------");
        System.out.println("Peek : "+th1.peek());
        System.out.println("Remove : " +th1.remove());
        System.out.println("--------------------------------");
        System.out.println("Peek : " +th1.peek());
        System.out.println("Is the Queue empty now ? : " +th1.isEmpty());
        System.out.println("Remove : " +th1.remove());
        System.out.println("--------------------------------");
        System.out.println("Peek : "+th1.peek());
        System.out.println("Remove : " +th1.remove());
        System.out.println("--------------------------------");
        System.out.println("Is the Queue empty now ? : " +th1.isEmpty());

    }
}

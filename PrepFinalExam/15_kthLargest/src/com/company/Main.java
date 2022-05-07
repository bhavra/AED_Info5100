package com.company;

import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {3,2,1,5,6,4};
        System.out.println(findKthLargest(nums,2));
    }
    public static int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> minheap = new PriorityQueue<>();
        for(int i :nums){
            minheap.add(i);
            if(minheap.size()>k){
                minheap.remove();
            }
        }
        return  minheap.remove();
    }
}

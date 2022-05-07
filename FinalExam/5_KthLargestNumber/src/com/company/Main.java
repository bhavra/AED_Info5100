package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums = {51,7,19,12,3,8,99};
        int k = 4;
        System.out.println(k+"th largest element in the given array is "+findKthLargest(nums,k));
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

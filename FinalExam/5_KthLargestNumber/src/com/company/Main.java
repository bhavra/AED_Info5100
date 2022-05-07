package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] nums1 = {3,2,1,5,6,4};
        int k1 = 2;
        System.out.println(k1+"nd largest element in the given array " +Arrays.toString(nums1)+ " : "+findKthLargest(nums1,k1));
        int[] nums2 = {3,2,3,1,2,4,5,5,6};
        int k2 = 4;
        System.out.println(k2+"th largest element in the given array "  +Arrays.toString(nums2)+ " : "+findKthLargest(nums2,k2));
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

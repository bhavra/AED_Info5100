package com.company;

public class Main {

    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        System.out.println(search(nums,8));

    }
    public static int[] search(int[] nums,int target){
        int[] result = new int[2];
        result[0] = findStarting(nums,target);
        result[1] = findEnding(nums,target);
        return result;
    }

    public static int findStarting(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;

        while(start<=end){
            int mid = start+(end-start)/2;
            if(nums[mid] >= target){
                end = mid-1;
            }else{
                start = mid+1;
            }
            if(nums[mid] == target) index=mid;
        }
        return index;
    }

    public static int findEnding(int[] nums, int target){
        int index = -1;
        int start = 0;
        int end = nums.length-1;

        while (start<=end){
            int mid = start + (end-start) /2;
            if(nums[mid]<=target){
                start=mid+1;
            }else{
                end = mid-1;
            }
            if(nums[mid] == target) index=mid;
        }
        return index;
    }
}

package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    int[] nums = {23,2,4,6,7};
        System.out.println(checkSubarraySum(nums,6));

    }

    public static boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>(){{put(0,-1);}};
        int runningSum = 0;
        for (int i=0;i<nums.length;i++) {
            runningSum += nums[i];
            if (k != 0) runningSum %= k;
            Integer prev = map.get(runningSum);
            if (prev != null) {
                if (i - prev > 1) return true;
            }
            else map.put(runningSum, i);
        }
        return false;
    }

}

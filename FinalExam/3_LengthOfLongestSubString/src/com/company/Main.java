package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        String str1 = "bbbbb";
        String str2 = "pwwkew";
        System.out.println("length of the longest substring " +str1+ " : "+longestSubstring(str1));
        System.out.println("length of the longest substring " +str2+ " : "+longestSubstring(str2));
    }

    public static int longestSubstring(String input){
        int i=0, j=0;
        int max=0;
        String output = "";
        HashSet<Character> hashset = new HashSet();
        if(input.length()==0){
            System.out.println("Empty String");
        }
        while(j<input.length()){
            if(!hashset.contains(input.charAt(j))){
                hashset.add(input.charAt(j));
                j++;
                max = Math.max(hashset.size(),max);
            }
            else{
                hashset.remove(input.charAt(i));
                i++;
            }
        }
        return max;
    }
}

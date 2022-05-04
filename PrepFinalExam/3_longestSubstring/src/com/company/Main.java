package com.company;
import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the input string : ");
        String str = sc.nextLine();
        System.out.println("length of the longest substring : "+longestSubstring(str));
    }

    public static int longestSubstring(String input){
        int i=0, j=0, max=0;
        String output = "";
        HashSet<Character> hashset = new HashSet();
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

 //           if(output.length()< j-i+1){
 //               output = input.substring(i,j);
 //           }
        }
 //       System.out.println("Longest substring : "+output);
        return max;
    }


}

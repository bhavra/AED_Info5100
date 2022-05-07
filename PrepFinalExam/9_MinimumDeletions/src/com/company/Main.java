package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        System.out.println(minDeletions("aabbbcccdd"));
    }

    public static int minDeletions(String s){
        int[] freq = new int[26];
        for(int i = 0; i< s.length(); i++){
            freq[s.charAt(i)-'a']++;
        }
        Set<Integer> occupiedFreq = new HashSet<>();
        int requiredDels = 0;

        for(int i = 0; i<26; i++){
            int currentfreq = freq[i];

            while(currentfreq >0){
                if(occupiedFreq.contains(currentfreq)){
                    currentfreq--;
                    requiredDels++;
                }
                else { break; }
            }
            if(currentfreq!=0){
                occupiedFreq.add(currentfreq);
            }
        }
        return requiredDels;
    }
}

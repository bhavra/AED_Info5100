package com.company;

public class Main {

    public static void main(String[] args) {
        String input1 = "aabcccccaaa";
        System.out.println("compressed string of "+input1+ " : " +compress(input1));
        String input2 = "ab";
        System.out.println("compressed string of "+input2+ " : " +compress(input2));
    }

    public static String compress(String input){
        if(input.length()<2){
            return input;
        }
        StringBuilder sb = new StringBuilder();
        int i, count = 1;
        String output = "";
        for(i = 0; i< input.length(); i++){
            if( i+1<input.length() && input.charAt(i) == input.charAt(i+1) ){
                count++;
                continue;
            }
            sb.append(input.charAt(i));

            if(count>1){
                sb.append(count);
                count=1;
            }
        }
        return sb.toString();
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        String str= "bhavs";
        if(uniqueChars(str))
            System.out.println("Given string has unique characters");
        else
            System.out.println("Given string has duplicate characters");
    }

    private static boolean uniqueChars(String str){
        char[] arr = str.toCharArray();
        for(int i=0; i<=str.length(); i++)
        {
            for(int j=i+1; j<str.length();j++)
            {
                //System.out.println("i,j="+i +j);
                if(arr[i]==arr[j])
                    return false;
            }
        }
        return true;
    }
}

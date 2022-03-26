package com.company;

public class Main {

    public static void main(String[] args) {
       System.out.println(compare("ransomeNote", "magazine"));
        System.out.println(compare("abcd", "aabbccd"));
        System.out.println(compare("1234", "1123344455"));
    }

    public static boolean compare(String a, String b){
        int len1 = a.length();
        int len2 = b.length();
        if (len1 > len2)
            return false;
        char[] aChars = a.toCharArray();
        for (char charOfa : aChars) {
            if (b.contains(Character.toString(charOfa)))
                b = b.replaceFirst(Character.toString(charOfa), "");
            else
                return false;
        }
        return true;
    }
}

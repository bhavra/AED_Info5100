package com.company;

public class Main {

    public static void main(String[] args) {
       System.out.println(construct("ransomenote", "magazine"));
        System.out.println(construct("abcd", "aabbccd"));
        System.out.println(construct("1234", "1123344455"));
    }

    public static boolean construct(String ransomNote, String magazine){
        int len1 = ransomNote.length();
        int len2 = magazine.length();
        if (len1 > len2)
            return false;
        char[] ransomNoteChars = ransomNote.toCharArray();
        for (char charOfransomNote : ransomNoteChars) {
            if (magazine.contains(Character.toString(charOfransomNote)))
                magazine = magazine.replaceFirst(Character.toString(charOfransomNote), "");
            else
                return false;
        }
        return true;
    }
}

package com.company;
import java.util.*;

public class Main {

    public static void main(String args[]) {

                Scanner sc = new Scanner(System.in);
                System.out.println("Enter String : ");
                String word = sc.next(), maxWord = "", newWord = "";
                int l = word.length(), i, j, max = 0;
                for (i = 0; i < l; i++) {
                    newWord = word.substring(i);
                    for (j = i + 1; j < l; j++)
                        if (newWord.indexOf(word.charAt(j)) + i != j)
                            break;
                    if (j - i > max) {
                        max = j - i;
                        maxWord = word.substring(i, j);
                    }
                }
                System.out.println("Longest substring : " +maxWord);
                int len = maxWord.length();
        System.out.println("Length : "  +len);

    }
}



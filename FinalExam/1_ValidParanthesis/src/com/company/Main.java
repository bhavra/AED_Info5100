package com.company;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    public static void main(String[] args) {
	    String str1 = "()[]{}";
        System.out.println("Is " +str1+ " is a valid paranthesis ? : " +validParanthesis(str1));
        String str2 = "(]";
        System.out.println("Is " +str2+ " is a valid paranthesis ? : " +validParanthesis(str2));
    }

    public static boolean validParanthesis(String str){
        Stack<Character> stack = new Stack();
        for (char c : str.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}


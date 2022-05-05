package com.company;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        minimumStack m = new minimumStack();
        m.push(3);
        m.push(5);
        m.push(1);
        System.out.println(m.top());
        System.out.println(m.getMin());
        m.pop();
        System.out.println(m.top());
        System.out.println(m.getMin());
    }

    public static class minimumStack {
        Stack<Integer> stack = new Stack();
        Stack<Integer> minstack = new Stack();

        public void push(int x) {
            stack.push(x);
            if (minstack.isEmpty() || x <= minstack.peek()) {
                minstack.push(x);
            }
        }

        public void pop() {
            if (stack.peek().equals(minstack.peek())) {
                minstack.pop();
            }
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minstack.peek();
        }
    }
}

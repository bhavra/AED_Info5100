package com.company;

public class Main {

    public static void main(String[] args) {
        Moody happy = new Happy();
        Moody sad = new Sad();
        Psychiatrist psychiatrist = new Psychiatrist();
        System.out.println("How are you feeling today");
        psychiatrist.examine(sad);
        psychiatrist.observe(sad);

        System.out.println("How are you feeling today");
        psychiatrist.examine(happy);
        psychiatrist.observe(happy);

    }
}

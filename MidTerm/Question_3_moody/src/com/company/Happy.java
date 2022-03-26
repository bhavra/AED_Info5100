package com.company;

public class Happy extends Moody{
    @Override
    public String getMood() {
        System.out.println("I feel Happy Today");
        return "heeehee....hahahah...HAHAHA!!";
    }

    @Override
    void ExpressFeelings() {
        System.out.println("Subject laughs a lot");
    }
}

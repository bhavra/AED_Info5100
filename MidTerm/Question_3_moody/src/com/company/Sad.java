package com.company;

public class Sad extends Moody{
    @Override
    public String getMood() {

        System.out.println("I feel sad Today");
        return "‘waah’ ‘boo hoo’ ‘weep’ ‘sob ‘";
    }

    @Override
    void ExpressFeelings() {

    }

}

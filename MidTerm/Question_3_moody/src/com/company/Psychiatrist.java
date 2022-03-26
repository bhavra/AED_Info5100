package com.company;

public class Psychiatrist extends Moody{

    //asks moody object about its mood
    public void examine(Moody moodyObject) {
        System.out.println(moodyObject.getMood());
    }

    //a moodyObject is observed to either laugh or cry
    public void observe(Moody moodyObject) {
        moodyObject.ExpressFeelings();

    }

    //returns message about self: “Subject laughs a lot”
   // public String toString();


    @Override
    String getMood() {
        return null;
    }

    @Override
    void ExpressFeelings() {

    }
}

package com.company;

public class Home implements Comparable<Home>{
    int houseNumber, builtYear ;
    float currentPrice, sqftArea, rating ;

    public Home(int houseNumber, float currentPrice, int builtYear, float sqftArea, float rating ){
        this.houseNumber = houseNumber;
        this.currentPrice = currentPrice;
        this.builtYear = builtYear;
        this.sqftArea = sqftArea;
        this.rating = rating;
    }

    @Override
    public int compareTo(Home o) {
        return Float.compare(this.currentPrice,o.currentPrice);
    }
}

package com.company;
import java.util.Comparator;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Home house1 = new Home(234, 900000, 2005, 1875, 3.2f);
    Home house2 = new Home(146, 1000000, 2010, 2000, 4.0f);
    Home house3 = new Home(567, 2000000, 2020, 2478, 4.5f);
    Home house4 = new Home(34579, 500000, 1996, 1500, 4.2f);

        Home[] houses = {house1, house2, house3, house4};

        Arrays.sort(houses);
        System.out.println(Arrays.asList(houses));

        for (Home hou : houses) {
            System.out.println(hou.houseNumber + " Price: " + hou.currentPrice);
        }

        System.out.println(house1.compareTo(house2));

    }
}

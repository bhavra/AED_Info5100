package com.company;

public class Main {

    public static void main(String[] args) {
        SeattlePoliceDepartment sea1 = new SeattlePoliceDepartment( );

        Person p1 = new Person("Bhav", 25);
        Person p2 = new Person("shiv", 30);
        Person p3 = new Person("sai", 0);

        p1.subscribe(sea1);
        p2.subscribe(sea1);

        sea1.notifyCitizens("Hello citizens");

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        p2.unSubscribe(sea1);
        p3.unSubscribe(sea1);

        try {
            Thread.sleep(1000);
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }

        sea1.notifyCitizens("Hello people of Seattle");


    }
}

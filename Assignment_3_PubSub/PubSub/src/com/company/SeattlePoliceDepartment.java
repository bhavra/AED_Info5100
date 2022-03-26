package com.company;
import java.util.*;

public class SeattlePoliceDepartment {
    String notification;
    ArrayList<Person> persons;
    public SeattlePoliceDepartment( ){
        this.persons = new ArrayList<>();
    }

    public void notifyCitizens(String notification){
        this.notification = notification;
        for (Person p : persons){
            p.receiveNotification(this);
        }
    }
}

package com.company;
import java.util.*;

public class SeattlePoliceDepartment {
    String notification;
    ArrayList<Person> persons;
    //String deptName;
    public SeattlePoliceDepartment( ){
        this.persons = new ArrayList<>();
    }
    /*public String getDept() {
        return deptName;
    }
    public void setDept(String deptName) {
        deptName = "SPD";
    } */
    public void notifyCitizens(String notification){
        this.notification = notification;
   //    System.out.println(" \n" + this.getClass() + "gives notifications : " + notification);
        for (Person person : persons){
            person.receiveNotification(this);
        }
    }
}

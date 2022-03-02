package com.company;

public class Person{
    private String name;
    private int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public void receiveNotification(SeattlePoliceDepartment seattlePoliceDepartment){
        System.out.println( this.getName() + " of age " + this.getAge() + " received the notification : " + seattlePoliceDepartment.notification);
        System.out.println("-------------------------------------------------------------------");

    }

    public void subscribe(SeattlePoliceDepartment seattlePoliceDepartment){
        if (!seattlePoliceDepartment.persons.contains(this)){
            seattlePoliceDepartment.persons.add(this);
        }
    }

    public void unSubscribe(SeattlePoliceDepartment seattlePoliceDepartment){
        if (seattlePoliceDepartment.persons.contains(this)) {
            seattlePoliceDepartment.persons.remove(this);
        }
    }
    
}

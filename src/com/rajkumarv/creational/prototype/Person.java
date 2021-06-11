package com.rajkumarv.creational.prototype;

public class Person extends Employee {

    public Person(String name){
        this.name = name;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }
}

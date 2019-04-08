package com.java.hackerrank.interviewprep;

public class TestCar {
    public static void main(String[] args) {
        Car c = new Car();
        c.setName("Honda");
        System.out.println(c.getName());
        c.method2(c);
        System.out.println(c.getName());
        c.method1(c);
        System.out.println(c.getName());
    }
}

class Car {
    public String name = "";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void method1(Car c){
        c.setName("Audi");
    }
    public void method2(Car c){
        c = new Car();
        c.setName("Audi");
    }
}
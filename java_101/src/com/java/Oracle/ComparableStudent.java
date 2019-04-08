package com.java.Oracle;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by prasun.pallav on 3/1/2019.
 */

class Student implements Comparable<Student>{
    String name;
    int roll;
    public Student(String n, int r){
        this.name = n;
        this.roll=r;
    }
    public int compareTo(Student s){
        return this.roll-s.roll;
    }
    public int getRoll(){return roll;}
    public String getName(){return name;}
}
public class ComparableStudent {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<>();
        al.add(new Student("Prasun", 3));
        al.add(new Student("Pra", 20));
        al.add(new Student("Pallav", 10));
        al.add(new Student("Vishal", 50));
        Collections.sort(al);
        for(Student s : al){
            System.out.println(s.getName()+ " - "+ s.getRoll());
        }
    }
}

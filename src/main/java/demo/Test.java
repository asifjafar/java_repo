package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by User on 11-04-2019.
 */

class Apple implements Comparable{
  int age;
  String name;

  Apple(int age, String name){
      this.age = age;
      this.name = name;
  }

  public String getName() { return this.name; }
  public int getAge() { return this.age; }
    @Override
    public int compareTo(Object o) {
        return this.age - ((Apple)o).age;
    }
}

public class Test {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(6,"Asif"));
        apples.add(new Apple(4,"Sohit"));
        apples.add(new Apple(3,"Sree"));
        apples.add(new Apple(5, "Bindu"));

        apples.sort((Apple a1, Apple a2) -> a2.age - a1.age);
        for(Apple apple : apples){
            System.out.print(apple.age + " : "+ apple.name + " | ");
        }
        System.out.println();
        Collections.sort(apples, Comparator.comparing(Apple::getName).reversed());
        Collections.sort(apples, Comparator.comparing(Apple::getAge));
        for(Apple apple : apples){
            System.out.print(apple.age + " : "+ apple.name);
        }
//        for(Apple apple : apples){
//            System.out.print(apple.age);
//        }
//        Comparator<Apple> ageComparator = (Apple a1, Apple a2) -> a2.age - a1.age;
//        Collections.sort(apples, ageComparator);
//        System.out.println();
//        for(Apple apple : apples){
//            System.out.print(apple.age);
//        }
    }
}

package demo.designpattern.factoryPattern;

import java.util.List;
import java.util.PriorityQueue;

/** Created by User on 12-04-2019. */
public class Square implements IShape {
  @Override
  public void display() {
    PriorityQueue<List<Integer>> queue = new PriorityQueue<>();

    System.out.println("Square Instance");
  }
}

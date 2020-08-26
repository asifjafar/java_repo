package demo.designpattern.factoryPattern;

import demo.designpattern.singleton.SingletonPattern;

/**
 * Created by User on 12-04-2019.
 */
public class FactoryPatternDemo {
    public static void main(String[] args) {
        IShape circle = ShapeFactory.getInstance("CIRCLE");
        circle.display();
        IShape square = ShapeFactory.getInstance("SQUARE");
        square.display();

        SingletonPattern pattern = SingletonPattern.getInstance();
    }
}

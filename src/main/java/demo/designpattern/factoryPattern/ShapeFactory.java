package demo.designpattern.factoryPattern;

/**
 * Created by User on 12-04-2019.
 */
public class ShapeFactory {
    public static IShape getInstance(String type){
        if(type == null) return null;

        switch (type){
            case "CIRCLE" :
                return new Circle();
            case "SQUARE" :
                return new Square();
        }
        return null;
    }
}

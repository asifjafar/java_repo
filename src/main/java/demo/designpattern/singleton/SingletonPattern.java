package demo.designpattern.singleton;

/**
 * Created by User on 12-04-2019.
 */
public class SingletonPattern {
    private static SingletonPattern instance = new SingletonPattern();

    private SingletonPattern(){

    }

    public static SingletonPattern getInstance(){
        return instance;
    }
}




 class ASingleton {

    private static volatile ASingleton instance;
    private static Object mutex = new Object();

    private ASingleton() {
    }

    public static ASingleton getInstance() {
        ASingleton result = instance;
        if (result == null) {
            synchronized (mutex) {
                result = instance;
                if (result == null)
                    instance = result = new ASingleton();
            }
        }
        return result;
    }

}

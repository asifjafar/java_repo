package functional;

/**
 * Created by User on 27-08-2020.
 */
public class MethodReferenceExample {
    public static void main(String[] args) {

        Thread t = new Thread(MethodReferenceExample::printMessage);
        t.start();

    }

    private static void printMessage() {
        System.out.println("Hello");
    }
}

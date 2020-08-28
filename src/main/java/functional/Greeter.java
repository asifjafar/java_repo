package functional;


/**
 * Created by User on 26-08-2020.
 */
public class Greeter {

    private void greet(){
        System.out.println("Hello World");
    }


    public static void main(String[] args) {
        Greeter greeter = new Greeter();
//        greeter.greet();

//        MyAdd addFunction = (int a, int b) -> a+b;
        StringLength length = String::length; // or s -> s.length();
        //System.out.println(length.getLength("lkuxhvlkjdvbnoildcv"));

        printString(String::length);

    }

    private static void printString(StringLength l){
        System.out.println(l.getLength("Hello Lambda"));
    }
}

interface MyAdd {
    int foo(int a, int b);
}

interface StringLength {
    int getLength(String s);
}
package functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Created by User on 26-08-2020.
 */
public class ExceptionHandling {
    public static void main(String[] args) {

        int[] numbers = {1,2,3,4,5};
        int key =0;
        process(numbers, key, wrapperLambda((v,k) -> System.out.println(v/k)));


    }

    private static void process(int[] numbers, int key, BiConsumer<Integer, Integer> consumer){
        for(int i: numbers){
            consumer.accept(i, key);
        }
    }

    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        return consumer;
    }
}

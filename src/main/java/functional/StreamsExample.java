package functional;

import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 27-08-2020.
 */
public class StreamsExample {

    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Syed", "Jafar", 10)
                , new Person("Ashutosh", "Bovoer", 20)
                , new Person("Ghanta", "Covoer", 30)
                , new Person("Ahugkd", "Avoer", 40)
                , new Person("Hema", "Chover", 50)
                , new Person("Chanchal", "Zrover", 50)
        );

        people.stream()
                .filter(x -> x.getLName().toLowerCase().startsWith("c"))

                .forEach(p  -> System.out.println(p.getFName()));

    }





}

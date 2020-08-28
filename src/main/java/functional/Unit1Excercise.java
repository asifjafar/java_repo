package functional;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by User on 26-08-2020.
 */
public class Unit1Excercise {

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
                .sorted(Comparator.comparing(Person::getLName))
                .filter(x -> x.getLName().toLowerCase().startsWith("ch"))
                .forEach(System.out::println);

    }

}

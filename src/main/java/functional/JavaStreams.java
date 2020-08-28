package functional;

import model.Employee;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by User on 25-08-2020.
 */


public class JavaStreams {
    public static void main(String[] args) throws IOException {
        /*IntStream
                .range(1, 10)
                .skip(5)
                .forEach(x -> System.out.println(x));*/

//        System.out.println(IntStream
//                .range(1, 10)
//                .sum());

        /*Stream.of("Zebra", "camel", "Govind", "Abdul", "Bopurnafs")
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);*/

        /*String[] names = {"Zebra", "camel", "Govind", "Asif", "Bopurnafs"};
        Arrays.stream(names)
                .filter(x->x.startsWith("G"))
                .sorted()
                .findFirst()
                .ifPresent(System.out::print);*/

/*        Arrays.stream(new int[] {2,4,5,6,7,10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);*/

        /*List<String> people = Arrays.asList("Al", "ankit", "Brent", "Sarika", "amanda", "Hans");
        people.stream()
                .map(String::toLowerCase)
                .filter(x ->x.startsWith("a"))
                .forEach(System.out::println);
*/
        /*Stream<String> bands = Files.lines(Paths.get("C:\\java_repo\\java_101\\src\\functional\\bands.txt"));
        bands
                .sorted()
                .filter(x -> x.length() > 13)
                .forEach(System.out::println);
        bands.close();*/

/*        List<String> bands = Files.lines(Paths.get("C:\\java_repo\\java_101\\src\\functional\\bands.txt"))
                .sorted()
                .filter(x -> x.contains("for"))
                .collect(Collectors.toList());
        bands.forEach(System.out::println);*/


/*    Stream<String> rows = Files.lines(Paths.get("C:\\\\java_repo\\\\java_101\\\\src\\\\functional\\\\data.txt"));
    int rowCount = (int)rows
            .map(x -> x.split(","))
            .filter( x-> x.length == 3)
            .count();
            rows.close();
        System.out.println("Rows count: " + rowCount);*/

/*        Stream<String> rows = Files.lines(Paths.get("C:\\\\java_repo\\\\java_101\\\\src\\\\functional\\\\data.txt"));
        rows
                .map(x -> x.replaceAll(" ", "").split(","))
                .filter( x-> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .forEach(x -> System.out.println(x[0]+ " " + x[1] + " " + x[2]));
        rows.close();*/

       /* Stream<String> rows = Files.lines(Paths.get("C:\\\\java_repo\\\\java_101\\\\src\\\\functional\\\\data.txt"));
        Map<String, Integer> map = new HashMap<>();
        map = rows
                .map(x -> x.replaceAll(" ", "").split(","))
                .filter( x-> x.length == 3)
                .filter(x -> Integer.parseInt(x[1]) > 15)
                .collect(Collectors.toMap(
                        x->x[0],
                        x->Integer.parseInt(x[1])));
        rows.close();
        for(Map.Entry entry : map.entrySet()) {
            System.out.println(entry.getKey() +" : " +entry.getValue());
        }*/

       double total  = Stream.of(7.3,1.6,7.9)
               .reduce(0.0, (Double a, Double b) -> a+b);
        System.out.println("total: " + total);

        IntSummaryStatistics summary = IntStream.of(7, 2, 19, 88, 73, 4 ,10).summaryStatistics();
        System.out.println(summary);
        System.out.println();
    }
}

package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

/**
 * Created by User on 28-04-2019.
 */
public class AddSpecialCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        System.out.println(line);
        int counter = 0;

        List<Integer> numbers = new ArrayList<>();
        for(char c : line.toCharArray()){
            numbers.add(Character.getNumericValue(c));
        }
        StringBuilder result = new StringBuilder();

        for(int i : numbers){
            if(result.length() == 0){
                result.append(i);
                counter++;
                continue;
            }
            int prevInt = numbers.get(counter-1);
            if(isEven(prevInt) && isEven(i)){
                result.append("*");
            }else if(!isEven(prevInt) && !isEven(i)){
                result.append("-");
            }
            result.append(i);
            counter++;
        }


        System.out.println(result.toString());

    }
    private static boolean isEven(int value){
        return value%2 == 0;
    }

}

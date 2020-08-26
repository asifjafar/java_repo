package functional;

import lombok.*;

/**
 * Created by User on 26-08-2020.
 */

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Person {

    private String fName;
    private String lName;
    private int age;

//    public Person(String fName, String lName, int age) {
//        this.fName = fName;
//        this.lName = lName;
//        this.age = age;
//    }

//    public String getLastName() { return lName; }

}

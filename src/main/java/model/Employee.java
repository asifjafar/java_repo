package model;

import lombok.*;

/**
 * Created by User on 25-08-2020.
 */

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private String name;
    private int age;
    private double salary;
}

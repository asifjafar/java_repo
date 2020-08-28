package Oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by prasun.pallav on 3/1/2019.
 */
class Employee {
    private String name;
    private int salary;

    Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }
}

class Salary implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() < e2.getSalary()) return -1;
        if (e1.getSalary() > e2.getSalary()) return 1;
        return 0;
    }
}

public class ComparatorEmployee {
    public static void main(String[] args) {
        ArrayList<Employee> al = new ArrayList<>();
        al.add(new Employee("Prasun", 3000));
        al.add(new Employee("Pra", 2000));
        al.add(new Employee("Pallav", 10000));
        al.add(new Employee("Vishal", 5000));
        Salary sal = new Salary();
        Collections.sort(al, sal);
        for (Employee stu : al) {
            System.out.println(stu.getName() + " - " + stu.getSalary());
        }
    }
}

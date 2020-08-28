package demo.designpattern.builderpattern;

/**
 * Created by User on 12-04-2019.
 */
public class Person {
    private final String fname;
    private final String lname;
    private final int age;

    Person(PersonBuilder personBuilder){
        this.fname = personBuilder.getFname();
        this.lname = personBuilder.getLname();
        this.age = personBuilder.getAge();
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder toBuilder(){
        return new PersonBuilder(this);
    }
    @Override
    public String toString() {
        return "Person{" +
                "fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", age=" + age +
                '}';
    }
}

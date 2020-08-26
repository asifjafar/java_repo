package demo.designpattern.builderpattern;

/**
 * Created by User on 12-04-2019.
 */
public class PersonBuilder {
    private String fname;
    private String lname;
    private int age;

    PersonBuilder(){

    }

    PersonBuilder(Person person){
        this.fname = person.getFname();
        this.lname = person.getLname();
        this.age = person.getAge();
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person toItem(){
        return new Person(this);
    }
}

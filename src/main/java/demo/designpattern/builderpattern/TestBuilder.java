package demo.designpattern.builderpattern;

/**
 * Created by User on 12-04-2019.
 */
public class TestBuilder {
    public static void main(String[] args) {
        PersonBuilder builder = new PersonBuilder();
        builder.setAge(12);
        builder.setFname("Asif");
        Person person = builder.toItem();
        System.out.println(person.toString());

        PersonBuilder newBuilder = new PersonBuilder(person);
        newBuilder.setLname("Jafar");

        person = newBuilder.toItem();
        System.out.println(person.toString());
//
//        StringBuilder strBuilder = new StringBuilder();
//        strBuilder.append("12");
//        strBuilder.append("13");
//        String str = strBuilder.toString();
//        int i = 0;
//        Integer.hashCode(3);
//        System.out.println(str);

    }
}

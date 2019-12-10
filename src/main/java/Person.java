import java.util.Arrays;

public class Person {

    String name;
    int age;
    String gender;
    String [] interest;

    public Person(String name, int age, String gender, String[] interest) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.interest = interest;
    }

    public String hello(){
        String greetings = String.format("Hello, my name is %s and I am %d years old %s. MY interest are %s%n", name, age, gender, Arrays.toString(interest).replace("[" , "").replace("]", ""));
        return greetings;
    }
}

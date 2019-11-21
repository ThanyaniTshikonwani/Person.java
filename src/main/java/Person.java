import java.util.Arrays;

public class Person {

    String name;
    int age;
    String gender;
    String [] intrest;

    public Person(String name, int age, String gender, String[] intrest) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.intrest = intrest;
    }

    public String hello(){
        String greetings = String.format("Hello, my name is %s and I am %d years old %s. MY intrest are %s%n", name, age, gender, Arrays.toString(intrest).replace("[" , "").replace("]", ""));
        return greetings;
    }
}

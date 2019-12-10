public class Main {
    public static void main(String[] args) {
        System.out.println(" ");

        Person person =new Person("Ryan",30,"male", new String[]{"being a hardarse","agile","and ssd hard drives."});
        String hello = person.hello();
        System.out.println(hello);

        // test for OOP object
        Person person2 =new Person("Ronex",29,"male",new String[]{"eating","sleeping","and coding."});
        String greetings = person2.hello();
        System.out.println(greetings);
    }
}

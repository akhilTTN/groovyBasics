package Exercise;

public class PersonMain {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Akhil");
        person.setAge((byte) 24);
        person.gender = "Male";
        person.address = "Kalkaji";

//        System.out.println(person);
        System.out.println("Person name: " + person.getName());
        System.out.println("Person age: " + person.age);
        System.out.println("Person gender: " + person.getGender());
        System.out.println("Person address: " + person.address);
    }
}

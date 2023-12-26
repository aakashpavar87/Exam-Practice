import Human.Person;

public class StringOverride {
    public static void main(String[] args) {
        Person p = new Person("Aakash", 500000);
        Person.createPerson();
        System.out.println(p);
    }
}

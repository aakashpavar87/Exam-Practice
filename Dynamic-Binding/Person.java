package Human;

public class Person {
    public String name;
    static int person = 0;
    public float salary;
    public Person(String n, int sal) {
        name = n;
        salary = sal;
    }
    public String toString() {
        return "Name : " + name + "\nSalary : " + salary;
    }
    public static void createPerson() {
        person += 1;
        System.out.println(person);
    }
}

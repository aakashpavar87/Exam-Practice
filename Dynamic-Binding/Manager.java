package Management;
import Human.Person;

public class Manager extends Person{
    public int bonus;
    public Manager(String n, int sal, int b) {
        super(n, sal);
        bonus = b;
    }
    public int getBonus() {
        return bonus;
    }
    public static void main(String[] args) {
        Manager m = new Manager("Aakash", 500000, 2000);
        Person.createPerson();
        System.out.println("Bonus : " + m.getBonus() + "\n" + m);
    }
}

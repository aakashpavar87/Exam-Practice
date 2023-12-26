package AllClass.SubClasses;
import AllClass.*;
public class Second_class extends First_class{
    public String cast;
    public int sal;
    public void setter(String cst, int sal) {
        cast = cst;
        this.sal = sal;
    }
    public void talk() {
        System.out.println(String.format("Hi I am %s I earn Rs. %s \nAnd My cast is %s", name, sal, cast));
    }
    public Second_class(String n,int id) {
        super(n, id);
    }
    public static void main(String[] args) {
        Second_class sc = new Second_class("Aakash", 101);
        sc.intro();
        sc.setter("Agent", 1000000);
        sc.talk();
    }
}

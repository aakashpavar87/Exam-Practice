package AllClass;

public class First_class {
    public String name;
    public int id;

    public First_class(String n, int id) {
        name = n;
        this.id = id;
    }

    protected void intro() {
        System.out.println(String.format("I am %s and My ID : %s", name, id));
    }
}

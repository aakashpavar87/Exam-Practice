package AllClass;
import AllClass.SubClasses.Second_class;
public class Third_class extends Second_class{
    public Third_class(String name, int id) {
        super(name, id);
    }
    public static void main(String[] args) {
        Third_class tc = new Third_class("James Bond", 007);
        tc.setter("Agent", 1000000);
        tc.talk();
    }
}

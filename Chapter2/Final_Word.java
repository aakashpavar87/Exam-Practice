class Game{
    final public void Intro() {
        System.out.println("I am Final Method.");
    }
    final public void Intro(int a) {
        System.out.println(String.format("I am Final Method. wtih Variable %s", a));
    }
    final public void Intro(String name) {
        System.out.println(String.format("I am Final Method. with name : %s", name));
    }
}
public class Final_Word extends Game{
    public static void main(String[] args) {
        Final_Word g = new Final_Word();
        g.Intro();
        g.Intro(45);
        g.Intro("Aakash");
    }
}

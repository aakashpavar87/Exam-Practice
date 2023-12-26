public class Polymorphism {

    int add(int a, int b) {
        return a+b;
    }
    float add(float a, float b, float c) {
        return a+b+c;
    }
    String add(String a, String b) {
        return a+b;
    }
    public static void main(String[] args) {
        Polymorphism p = new Polymorphism();
        System.out.println(p.add(2,4));
        System.out.println(p.add("Aakash", " Pavar"));
        float a = (float) 9.8;
        float b = (float) 3.8;
        float c = (float) 2.8;
        System.out.println(p.add(a, b, c));
    }
}

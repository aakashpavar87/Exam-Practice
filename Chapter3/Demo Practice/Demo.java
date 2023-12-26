import java.io.Console;

public class Demo{
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter a Number : ");
        int num = Integer.parseInt(c.readLine());
        System.out.println(Integer.max(23, 34));
        System.out.println(num);
    }
}
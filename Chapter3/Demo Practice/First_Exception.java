package exceptionClasses;
import java.util.Scanner;

public class First_Exception {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Age : ");
            int age = sc.nextInt();
            int a, b;
            System.out.print("Enter a : ");
            a = sc.nextInt();
            System.out.print("Enter b : ");
            b = sc.nextInt();
            sc.close();
            
            if (age == 0) {
                throw new Exception("You can't enter zero as Age.");
            }
            float result = a / b;
            System.out.println(String.format("Result is : %s", result));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Code excuted because of Error is handled (^_^)");
    }
}
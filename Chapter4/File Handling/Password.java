package Classes;
import java.io.*;
public class Password {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("Data\\password.txt", true);
            FileInputStream fin = new FileInputStream("Data\\password.txt");
            Console c = System.console();
            System.out.print("Enter Password : ");
            char[] pass = c.readPassword();
            String passstr = String.valueOf(pass);
            System.out.println("Your Password is : " + passstr);
            byte[] b = (passstr + "\n").getBytes();
            int i = fin.read();
            System.out.println((char)i);
            System.out.println("This is Password taker file.");
            fin.close();
            fout.write(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("After try catch");
    }
}

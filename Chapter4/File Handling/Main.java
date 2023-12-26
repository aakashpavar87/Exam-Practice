package Classes;
import java.io.*;
public class Main{
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("Data\\mytxt.txt");
            // FileOutputStream fout = new FileOutputStream("Data\\mytxt.txt");
            // Console c = System.console();
            int i = 0;
            while ((i=fin.read())!= -1) {
                System.out.print((char)i);
            }
            fin.close();
            // System.out.print("Enter Demo text : ");
            // String n = c.readLine();
            // byte[] b = n.getBytes();
            // fout.write(b);
            // fout.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
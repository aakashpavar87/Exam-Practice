import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try {
            /* 
            // Reading and Writing using Buffer Class.
            // FileWriter fw = new FileWriter("new.txt");
            // BufferedWriter bw = new BufferedWriter(fw);
            // bw.append("\nThis is New text. Another Text");
            // bw.close();

            // FileReader fr = new FileReader("new.txt");
            // BufferedReader br = new BufferedReader(fr);
            // while (br.ready()) {
            //     String lines = br.readLine();
            //     System.out.println(lines);
            // }
            // br.close();
            //Creating a file and reading that file.
            // File f = new File("new.txt");
            // Scanner sc = new Scanner(f);
            // while (sc.hasNextLine()) {
            //     String line = sc.nextLine();
            //     System.out.println(line);
            // }
            // sc.close();
            // Create a new File and Writing to that file.
            // f.createNewFile();
            // FileWriter fw = new FileWriter(f);
            // fw.write("This is Some Demo Text \n\t\t\t\tWritten By Aakash");
            // fw.close();
            */
            // Deleting Current File
            File f = new File("new.txt");
            if (f.exists()) {
                if (f.delete()) {
                    System.out.println("Deleted this file : " + f.getName());
                }else{
                    System.out.println("Some problem has occured.");
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

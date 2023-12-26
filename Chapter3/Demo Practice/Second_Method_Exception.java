package exceptionClasses;

import java.util.Scanner;

public class Second_Method_Exception{
    public void CheckNum(int num) throws Exception{
        if(num % 2 != 0) {
            throw new Exception("You Can't Enter Odd Number.");
        }else{
            System.out.println(String.format("This %s is Even.", num));
        }
    }
    public static void main(String[] args) {
        try{
            Second_Method_Exception sme = new Second_Method_Exception();
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number : ");
            int num = sc.nextInt();
            sme.CheckNum(num);
        }catch(Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Created Error throwing Method....");
    }
}

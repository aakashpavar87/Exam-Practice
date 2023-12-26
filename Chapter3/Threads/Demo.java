class UserThread implements Runnable{
    public void run() {
        System.out.println("Custom Message from Thread Class");
    }
}
public class Demo {
    public static void main(String[] args) {
        System.out.println("Program Started ...");
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        try{Thread.sleep(5000);}catch(Exception e){}
        System.out.println(t.getId());
        System.out.println("Program Terminated ...");
        
        UserThread myThread = new UserThread();
        Thread t1 = new Thread(myThread);
        t1.start();
    }
}

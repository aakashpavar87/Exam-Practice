package myThreads;
public class MyThread implements Runnable{
	public int number = 1;
	public void run() {
		for(int i=0;i<=10;i++) {
			System.out.println("Number : " + i + " From Thread No. " + number);
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
    public static void main(String args[]) {
		MyThread t = new MyThread();
		Thread thread = new Thread(t);
		AnotherThread t2 = new AnotherThread();
		thread.start();
		t2.start();
	}
}
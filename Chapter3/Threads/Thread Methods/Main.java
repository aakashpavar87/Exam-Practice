// package myThreads;

public class Main implements Runnable{
	String name;
	Main(String name) {
		this.name=name;
	}
	public void run() {
		System.out.println("Inside a thread " + this.name);
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String args[]) {
		Main myThread = new Main("t1");
		Thread thread = new Thread(myThread);
		Main myThread2 = new Main("t2");
		Thread thread2 = new Thread(myThread2);
		Main myThread3 = new Main("t3");
		Thread thread3 = new Thread(myThread3);
		Main myThread4 = new Main("t4");
		Thread thread4 = new Thread(myThread4);

		thread.setPriority(7);
		thread2.setPriority(5);
		thread3.setPriority(9);
		thread4.setPriority(1);

		thread.start();
		thread2.start();
		thread3.start();
		thread4.start();
	}
}
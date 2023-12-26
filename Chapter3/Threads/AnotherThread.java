package myThreads;
public class AnotherThread extends Thread{
	public int number=2;
	public void run() {
		for(int i=10;i>0;i--) {
			
			System.out.println("Number : " + i + " From Thread No. " + number);
			try{
				Thread.sleep(2000);
			}catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}
}
//package mycompany;

public class Company{
	boolean f=false;
	//f=false chance: Producer
	//f=true chance: Consumer
	synchronized public void produce_item(int n) throws Exception
	{
		if (f) 
		{	
			wait();
		}
		notify();
		System.out.println("Produced item : " + n);
		this.f=true;
	}
	synchronized public int consume_item(int n) throws Exception
	{
		if (!f) 
		{
			wait();
		}
		notify();
		System.out.println("Cosumed item : " + n);
		this.f=false;
		return n;
	}
}

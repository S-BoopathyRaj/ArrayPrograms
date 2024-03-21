package in;

import java.util.Iterator;

public class thread1  extends Thread{
	public void run()
	{
		System.out.println("hello i am run");
	}
	public static void main(String[] args) {
		for(int i=0;i<3;i++)
		{
			System.out.println("Hello from main");
		}
		Thread t=new Thread();
		t.start();
		t.run();
	}
}

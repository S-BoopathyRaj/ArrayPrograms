package in;

public class Runnable1  implements Runnable{
	public void run()
	{
		for(int i=0;i<3;i++)
		{
		System.out.println("running");
	}
	}
	public static void main(String[] args) {
		Runnable r=new Runnable1();
		Thread t=new Thread();
		t.start();
		for(int i=0;i<3;i++)
		{
			System.out.println("hello from main");
		}
		
	}

}

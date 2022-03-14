class ThreadDemo11 implements Runnable
{
	public void run()
	{
		for (int i=1 ; i<=5 ; i++)
		{
			System.out.println("Hi");
			
			try {Thread.sleep(500);} catch (InterruptedException e) {}
			
		}
	}
}
class ThreadDemo22 implements Runnable
{
	public void run()
	{
		for (int i=1 ; i<=5 ; i++)
		{
			System.out.println("Hello");
			
			try {Thread.sleep(500);} catch (InterruptedException e) {}
			
		}
	}
}
public class Orunnable1 {
	
	public static void main(String args[])
	{
		Runnable r1 = new ThreadDemo11();
		Runnable r2 = new ThreadDemo22();
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		try {Thread.sleep(10);} catch (InterruptedException e) {}
		t2.start();
	}

}

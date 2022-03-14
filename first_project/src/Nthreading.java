class ThreadDemo1 extends Thread
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
class ThreadDemo2 extends Thread
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
public class Nthreading {

	public static void main(String[] args) throws InterruptedException {
				
		Thread t1 = new ThreadDemo1();
		Thread t2 = new ThreadDemo2();
		
		t1.start();
		Thread.sleep(10); //sleep between t1 & t2... sleep - static method
		t2.start();

	}

}

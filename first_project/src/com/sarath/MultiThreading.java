package com.sarath;

public class MultiThreading {

	public static void main(String[] args) throws Exception
	{
		
		Thread t1 = new Thread(() ->
		{
			for(int i=0; i<5; i++)
			{
				System.out.println("hi");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		Thread t3 = new Thread(() ->
		{
			for(int i=0; i<5; i++)
			{
				System.out.println("hello");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		
		t1.start();
		Thread.sleep(10);
		t3.start();
		
		t1.join();
		t3.join();
		
		System.out.println("Bye");
		
		
		
	}

}

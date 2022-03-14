package com.sarath;

public class Consumer implements Runnable
{
	InterThreadCommunication it;
	
	public Consumer(InterThreadCommunication it1)
	{
		this.it=it1;
	}
	
	@Override
	public void run() 
	{
		for(int m=0; m<100;m++)
		{
		it.get();
		}
	}
	
}
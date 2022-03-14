package com.sarath;

public class Producer implements Runnable
{
	InterThreadCommunication it;
	
	public Producer(InterThreadCommunication it1)
	{
		this.it=it1;
	}
	
	@Override
	public void run() 
	{
		for(int m=0; m<100;m++)
		{
		it.put();
		}
	}
	
}

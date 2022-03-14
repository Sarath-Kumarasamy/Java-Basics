package com.sarath;


public class InterThreadCommunication 
{
	int i;
	private boolean valueset = false;
	

	public synchronized void put()
	{
		while(valueset)
		{
			try {wait();} catch (InterruptedException e) {}
		}
		i++;
		System.out.println("put : "+i);
		valueset=true;
		notify();
		
	}
	
	public synchronized void get()
	{
		while(!valueset)
		{
			try {wait();} catch (InterruptedException e) {}
		}
		System.out.println("get : " + i);
		valueset=false;
		notify();
	}
	
}



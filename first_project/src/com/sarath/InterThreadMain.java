package com.sarath;

public class InterThreadMain {

	public static void main(String[] args) {
		
		InterThreadCommunication it = new InterThreadCommunication();
		
		Producer p1 = new Producer(it);
		Consumer c1 = new Consumer(it);
		
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		
		t1.start();
		t2.start();
	}

}

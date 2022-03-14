public class OrunnableLambda2 {

	public static void main(String[] args) throws Exception {
		
		Runnable r1 = () ->
						{
							for(int j=1;j<=5;j++)
							{
								System.out.println("Hi lambda");
								try { Thread.sleep(500);} catch(Exception e) {}
							}
						};
				
		Runnable r2 = () -> 
						{
							for (int i=1;i<=5;i++)
							{
							System.out.println("hello lambda");
							
							try { Thread.sleep(500); } catch(Exception e) {}
							}
						};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		
		// lambda applying in thread below
		
		Thread t3 = new Thread(() ->
						{
							for (int i=1 ; i<=5 ; i++)
							{
								System.out.println("Thread 3");
				
								try {Thread.sleep(500);} catch (InterruptedException e) {}
				
							}
						},"Sk3"); //Thread name set here
				
		Thread t4 = new Thread(() ->
		{
			for (int i=1 ; i<=5 ; i++)
			{
				System.out.println("Thread 4");

				try {Thread.sleep(500);} catch (InterruptedException e) {}

			}
		},"Sk4");
		
		Thread t5 = new Thread(() ->
		{
			for (int i=1 ; i<=5 ; i++)
			{
				System.out.println("Thread 5");

				try {Thread.sleep(500);} catch (InterruptedException e) {}

			}
		},"Sk5");
		
		
		t1.start();
		try { Thread.sleep(10); } catch(Exception e) {}
		t2.start();
		try { Thread.sleep(10); } catch(Exception e) {}
		t3.start();
		try { Thread.sleep(10); } catch(Exception e) {}
		t4.start();
		try { Thread.sleep(10); } catch(Exception e) {}
		t5.start();
		
		//isAlive - before join
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());

		//join
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("");
		System.out.println("Bye - all is well");

		//isAlive - after join
		System.out.println("");
		System.out.println(t1.isAlive());
		System.out.println(t2.isAlive());
		System.out.println(t3.isAlive());
		
		//thread name set & get
		t1.setName("Sk1");
		t2.setName("Sk2");
		
		System.out.println("");
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t3.getName());
		System.out.println(t4.getName());
		System.out.println(t5.getName());
		
	}

}

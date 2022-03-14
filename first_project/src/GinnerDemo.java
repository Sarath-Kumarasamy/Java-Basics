class Outer
{
	int a,b;
	public Outer()
	{
		System.out.println("Outer class");
	}
	class Inner1
	{
		int c,d;
		public Inner1()
		{
			System.out.println("Member Inner1 class");
		}	
	}
	static class Inner2
	{
		int e,f;
		public Inner2()
		{
			System.out.println("Static Inner class");
		}	
		static public void show()
		{
			System.out.println("Static Inner class - show method");
		}
	}
	static public void show()
	{
		System.out.println("Static Outer class - show method");
	}
}
public class GinnerDemo {
	public static void main(String args[])
	{
		Outer obj=new Outer();
		Outer.Inner1 obj1 = obj.new Inner1();
		Outer.Inner2.show();
		Outer.Inner2 obj2 = new Outer.Inner2();
		
		Outer.show();
	}

}

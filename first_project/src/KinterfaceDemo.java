@FunctionalInterface
interface Writer1
{
	void show();
	default void print()  //default method in interface
	{
		System.out.println("print - default interface");
	}
	default void txt()
	{
		System.out.println("txt - default interface");
	}
}

public class KinterfaceDemo {

	public static void main(String[] args) {
		
		Writer1 obj = new Writer1()
						{
							public void show()
							{
							System.out.println("in show");
							}
						}; //anonymous interface concept
		
		Writer1 obj2 = () -> System.out.println("in show2 - lambda"); //lambda expression in interface
		
						
		obj.print();
		obj.txt();
		obj.show();
		
		System.out.println();
		
		obj2.print();
		obj2.show();
	}

}

class Ab
{
	public Ab()
	{
		System.out.println("AAA");
	}
	public Ab(int i)   //constructor overloading
	{
		System.out.println("AAA $int");
	}
	public void show()
	{
		System.out.println("Class A show - method");
	}
}
class B extends Ab
{
	public B()
	{
		super(5); //super method  concept	
		
		System.out.println("BBB");
	}
	public void show() //method overriding
	{
		System.out.println("Classs B show-menthod");
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
		System.out.println("1");
		Ab objA = new Ab();  //normal instanciation of class A
		objA.show();
		System.out.println("2");
		
		B objB = new B();  //normal instanciation of class B
		objB.show();
		System.out.println("3");
		
		Ab objB2 = new B(); //run time polymorphism - creating an object of B wrf to class A 
		objB2.show(); //dynamic method dispatch
		

	}

}

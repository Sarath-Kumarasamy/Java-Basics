class A
{
	int n1,n2;
	int result;
	public A() {
		System.out.println("Welcome on the board");
	}
	public A(int n1)
	{
		this.n1=n1;
		System.out.println("Single parm constructor");
	}
	public A(int n1,int n2)
	{
		this.n1=n1;
		this.n2=n2;
		System.out.println("Double parm constructor");
	}
	public int perform(int n1)
	{
		this.result=(this.n1+this.n2)*n1;
		System.out.println("Single parm method");
		return result;
	}
	public int perform(int n1, int n2)
	{
		this.result=(this.n1+this.n2)*(n1+n2);
		System.out.println("Double parm method");
		return result;
	}
	public int perform(int n1, int n2, int n3)
	{
		this.result=(this.n1+this.n2)*(n1+n2+n3);
		System.out.println("Triple parm method");
		return result;
	}
	public void show2() {
		// TODO Auto-generated method stub
		
	}
}
public class HmethodOverloaaading {
	public static void main(String args[])
	{
		A obj1=new A();
		A obj2=new A(5);
		A obj3=new A(5,10);
		
		System.out.println(obj1.perform(1));
		System.out.println(obj1.perform(1,2));
		System.out.println(obj1.perform(1,2,3));
		
		System.out.println(obj2.perform(1));
		System.out.println(obj2.perform(1,2));
		System.out.println(obj2.perform(1,2,3));
		
		System.out.println(obj3.perform(1));
		System.out.println(obj3.perform(1,2));
		System.out.println(obj3.perform(1,2,3));
	}

}

import com.sarath.LaccessModifiersTest;

class TestAccessModifier extends LaccessModifiersTest
{
	public void show4()
	{
		l=50;
	}
}

public class LaccessModifiers
{
	public static void main( String a[])  
	{
		LaccessModifiersTest obj1 = new LaccessModifiersTest();
		obj1.show2();
		
		TestAccessModifier obj2 = new TestAccessModifier();
		obj2.show4();
		
	}
}



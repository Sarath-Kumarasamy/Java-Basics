
public class BifElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		if(n==0)
		{
			System.out.println("The value zero is neither even nor odd, please enter a value greater than zero");
		}
		else if(n%2==0) 
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
		System.out.println(n==0?"Zero":n%2==0?"Even":"Odd"); //ternary operator
	}

}

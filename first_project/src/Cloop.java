
public class Cloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i");
		for(int i =1; i<=16; i++)
		{
			System.out.print("* ");
			if(i%4==0)
			{
				System.out.println("");
			}
		}
		System.out.println("j");
		int j=1;
		while(j<=16)
		{
			System.out.print("* ");
			if(j%4==0)
			{
				System.out.println("");
			}
			j++;
		}
		System.out.println("k");
		int k =1;
		
		do
		{
			System.out.print("* ");
			if(k%4==0)
			{
				System.out.println("");
			}
			k++;
		}while(k<=16);
		
		//assignment 1
		
		for(int a =1; a<=6; a++)
		{
			for(int b =1; b<=a; b++)
			{
				System.out.print(b + " ");
			}
			System.out.println("");
			
		}
		System.out.println();
		//assignment 2
		
		for(int m =1; m<=6; m++)
		{
			for(int n =1; n<=m; n++)
			{
				int o=n+64;
				System.out.print((char)o + " ");
			}
			System.out.println("");
			
		}
		

		//assignment 3
		System.out.println();
		
		for(int p=1;p<=16;p++)
		{
			if(p==6 || p==7 || p==10 || p==11)
				{
					System.out.print(" ");
					continue;
				}
			System.out.print("$");
			if(p%4==0)
			{
				System.out.println();
			}
		}

	}

}

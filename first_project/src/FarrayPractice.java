
public class FarrayPractice {

	public static void main(String[] args) {
		int a1[]= {5,10,15};
		
		int a2[][]= {
				{2,4,6,8,10},
				{3,6,9},
				{4,8,12,16}
		};
		
		int a3[]= new int[4];
		a3[0]= 4;
		a3[2]= 8;

		for(int i=0;i<a2.length;i++)
		{
			System.out.print(a3[i] + " ");
		}
		
		System.out.println();
		
		for(int i : a3)
		{
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("using length func");
		System.out.println();
		
		for(int i=0;i<a2.length;i++)
		{
			for(int j=0;j<a2[i].length; j++)
			{
				System.out.print(a2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("using enchanced for loop");
		System.out.println();
		
		for(int i[] : a2)
		{
			for(int j : i)
				
				
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}

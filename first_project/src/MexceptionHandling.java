import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MexceptionHandling {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		long n = 0;
		System.out.println("");
		System.out.println("Enter a number");
		BufferedReader br = null;
		try
		{
		 br = new BufferedReader(new InputStreamReader(System.in));
		 String s = br.readLine();
		 n=Integer.parseInt(s);
		 System.out.println(n);
		}
		catch(Exception e)
		{
			System.out.println("Error : " + e);
		}
		finally
		{
			br.close();
		}

	}

}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Rcomparator {

	public static void main(String[] args) {
		
		List<Integer> l3 = new ArrayList<>();
		
		l3.add(0,201);
		l3.add(1,103);
		l3.add(2,302);
		l3.add(3,507);
		l3.add(4,409);
		
		System.out.println("Size : " + l3.size());
		
		Comparator<Integer> c = (i,j) -> 
		{
			return (i % 10)>(j % 10)? 1 : -1 ;
		};
		
		Collections.sort(l3, c);
		
		System.out.println(" sorting the last digit using comparator");
		System.out.println(l3);
		
	}

}

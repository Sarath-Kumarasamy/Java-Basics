import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class QlistIterator {

	public static void main(String[] args) {
		List<Integer> l2 = new ArrayList<>();
		l2.add(0, 10);
		l2.add(1, 20);
		l2.add(2, 30);
		l2.add(3, 40);
		l2.add(4, 50);
		
		for (int i=0 ; i<l2.size() ; i++) //normal for loop
		{
			System.out.println("Normal for loop " + l2.get(i));
		}
		
		Iterator<Integer> it = l2.iterator(); //Iterator loop
		while(it.hasNext())
		{
			System.out.println("Iterator for loop " + it.next());
		}
		
		for (Integer i : l2)
		{
			System.out.println("Enhanced -  for loop " + i);
		}
		
		Collections.sort(l2);
		Collections.reverse(l2);
		System.out.println("After reverse sorting : " + l2);
		
		Collections.shuffle(l2);
		System.out.println("After shuffling : " + l2);
		
	

	}

}
 
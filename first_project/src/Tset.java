import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Tset {

	public static void main(String[] args) {
		
		Set<Integer> st1 = new HashSet<>();  //unsorted hash set
		
		st1.add(2);
		st1.add(5);
		st1.add(10);
		System.out.println(st1.add(5));
		System.out.println(st1.add(50));
		
		System.out.println("Hash set : " + st1);
		
		Set<Integer> st2 = new TreeSet<>();  // sorted tree set

		st2.add(2);
		st2.add(5);
		st2.add(10);
		System.out.println(st2.add(5));
		System.out.println(st2.add(50));
		System.out.println("Tree set : " + st2);

	}

}

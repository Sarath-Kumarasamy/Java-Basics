import java.util.*;


public class Plist {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<>(); //added Integer generics for type safety
		l1.add(0,10);
		l1.add(1,20);
		l1.add(2,30);
		l1.add(3,40);
		System.out.println(l1);
		
		for (Object o : l1) //can mention Integer also for wrapper class specifically
		{
			System.out.println(o);
		}
		
		l1.remove(0); //removing the element with index
		System.out.println("Removing at 0 index : " + l1);
		
		int i = l1.get(0);
		
		System.out.println("Contains 20 : " + l1.contains(i));
		
		l1.clear(); //clearing the list
		System.out.println("After clearing the list " + l1);
	
	}

}

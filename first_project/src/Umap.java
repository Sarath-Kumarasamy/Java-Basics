import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Umap {

	public static void main(String[] args) {
		Map<String,Integer> mp = new HashMap<>();
		mp.put("One", 1);
		mp.put("Two",2);
		mp.put("Three",3);
		mp.put("Four",4);
		
		Set<String> set = mp.keySet(); //to store the keys
		
		for (String str : set)
		{
			System.out.println(str+ " : " + mp.get(str) );
		}

	}

}

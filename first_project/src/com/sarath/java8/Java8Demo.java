/**
 * 
 */
package com.sarath.java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author Sarath
 *
 */
public class Java8Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(3);
		lst.add(4);
		lst.add(5);
		lst.add(6);
		
		Map<String, Integer> mp = new HashMap<>();
		mp.put("Sarath", 1);
		mp.put("Sam", 2);
		
//		lst.forEach(System.out::println);
//		mp.forEach((i,j) -> System.out.println(i + " : " + j));
//		}
		
		System.out.println(mp.get("Sam"));
		
	}
}

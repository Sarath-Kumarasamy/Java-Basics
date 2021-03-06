package com.sarath;

import java.util.Arrays;
import java.util.List;

public class ForEachFeature {

	public static void main(String[] args) {
		
		List<Integer> values = Arrays.asList(1,2,3,4,5,6);
		
		values.forEach((i) -> System.out.println(i));
		
		System.out.println("using method reference");
		
		values.forEach(System.out::println);
		
		System.out.println(values.stream());
		
	}

}

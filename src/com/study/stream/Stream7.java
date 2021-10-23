package com.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Stream7 {
	
	
	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,2,3,3,5,1,9,3,2,4);
	  
		Set<Integer> inSet = list.stream().collect(Collectors.toSet());
		System.out.println(inSet);
		
		List<Integer> listWithoutDuplicates  = list.stream().distinct().collect(Collectors.toList());
		System.out.println(listWithoutDuplicates);
		
		Map<Integer,Integer> map = list.stream().collect(Collectors.toMap(Function.identity(), v -> 1 , Integer::sum));
		System.out.println(map);
		
		Map<Integer,Integer> map1 = list.stream().collect(Collectors.toMap(Function.identity(), v -> v , (oldValue, newValue) -> newValue ));
		System.out.println(map1);
		
		
		
		Map<Integer,Long> map2 = list
				.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map2);
	}
}
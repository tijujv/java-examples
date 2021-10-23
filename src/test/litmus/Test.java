package test.litmus;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test {
	
	
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
	  
		Set<Integer> inSet = Arrays.asList(1,2,2,3,3,5).stream().collect(Collectors.toSet());
		System.out.println(inSet);
		
		Map<Integer,Integer> map = Arrays.asList(1,2,2,3,3,5).stream().collect(Collectors.toMap(i -> i, i -> i));
		System.out.println(map);
	}
}

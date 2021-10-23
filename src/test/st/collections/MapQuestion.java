package test.st.collections;

import java.util.HashMap;
import java.util.Map;

public class MapQuestion {

	

	public static <K, V> void main(String[] args) {
		
		Map map1 = new HashMap<Integer, Character>();		
		map1.put(1, 'a');
		map1.put(2, 'b');
		map1.put(2, 'c');
		System.out.println(map1);
		
		Map newMap = new HashMap<String, String>();
		newMap.put("11","aa");
		newMap.put("22","bb");
		newMap.put("22","cc");
		
		map1 = newMap;
		
		System.out.println(map1);

		final Map map2 = new HashMap<Integer, Character>();

		map2.put(1, 'a');
		map2.put(2, 'b');
		map2.put(2, 'c');
		map2.put("11","aa");
		map2.put("22","bb");
		map2.put("22","cc");
		System.out.println(map2);
		
		//(ERROR since final map2) map2 = newMap;

	}

}

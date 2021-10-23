package com.study.maps;

import java.util.TreeMap;
import java.util.Map.Entry;

public class TestTreeMap {
	public static void main(String[] args) {
		Cat d1 = new Cat("red", 30);
		Cat d2 = new Cat("black", 20);
		Cat d3 = new Cat("white", 10);
		Cat d4 = new Cat("white", 10);

		TreeMap<Cat, Integer> treeMap = new TreeMap();
		treeMap.put(d1, 10);
		treeMap.put(d2, 15);
		treeMap.put(d3, 5);
		treeMap.put(d3, 20);

		for (Entry entry : treeMap.entrySet()) {
			System.out.println(entry.getKey().toString() + " - " + entry.getValue());
		}

	}
}

package com.study.maps;

import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class TestLinkedHashMap {
	public static void main(String[] args) {
		Dog d1 = new Dog("red");
		Dog d2 = new Dog("black");
		Dog d3 = new Dog("white");
		Dog d4 = new Dog("white");
		LinkedHashMap<Dog, Integer> linkedHashMap = new LinkedHashMap();
		linkedHashMap.put(d1, 10);
		linkedHashMap.put(d2, 15);
		linkedHashMap.put(d3, 5);
		linkedHashMap.put(d4, 20);
		for (Entry<Dog, Integer> entry : linkedHashMap.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}

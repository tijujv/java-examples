package com.study.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamStudy {
	public static void main(String[] args) {
		streamStudy();
	}

	public static void streamStudy() {
		List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
		myList.stream().filter(s -> s.startsWith("c")).map(String::toUpperCase).sorted().forEach(System.out::println);

		myList.stream().filter(s -> s.startsWith("a")).map(str -> str.toUpperCase()).sorted()
				.forEach(System.out::println);
	}

	public static void removeNegativeFromArray() {
		Integer[] array = new Integer[] { 0, 1, 2, 3, 4, -1, -2, -3 };
		Set<Integer> integerSet = new HashSet<>((Arrays.asList(array)));
		integerSet = integerSet.stream().filter(i -> i >= 0).collect(Collectors.toSet());
	}

}

package com.study.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 2, 2, 3, 5);

		System.out.println(numbers);

		List<Integer> removedDuplicates = numbers.stream().distinct().collect(Collectors.toList());

		System.out.println(removedDuplicates);
	}

}
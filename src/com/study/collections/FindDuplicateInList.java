package com.study.collections;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class FindDuplicateInList {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		for (int i = 0; i < 10; i++) {
			list.add(String.valueOf(i));
		}
		for (int i = 0; i < 5; i++) {
			list.add(String.valueOf(i));
		}

		System.out.println("My List : " + list);
		System.out.println("\nHere are the duplicate elements from list : " + findDuplicates(list));
	}

	public static Set<String> findDuplicates(List<String> listContainingDuplicates) {

		final Set<String> duplicates = new HashSet<String>();
		final Set<String> setUsedtoCheck = new HashSet<String>();

		for (String input : listContainingDuplicates) {
			if (!setUsedtoCheck.add(input)) {
				duplicates.add(input);
			}
		}
		return duplicates;
	}
}
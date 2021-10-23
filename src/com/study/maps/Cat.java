package com.study.maps;

public class Cat implements Comparable<Cat> {
	String color;
	int size;

	Cat(String c, int s) {
		color = c;
		size = s;
	}

	public String toString() {
		return color + " dog";
	}

	@Override
	public int compareTo(Cat o) {
		return o.size - this.size;
	}
}

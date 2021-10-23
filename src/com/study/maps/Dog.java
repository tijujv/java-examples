package com.study.maps;

public class Dog {

	String color;

	public Dog(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Dog [color=" + color + "]";
	}

	public boolean equals(Object o) {
		return ((Dog) o).color == this.color;
	}

	public int hashCode() {
		return color.length();
	}

}
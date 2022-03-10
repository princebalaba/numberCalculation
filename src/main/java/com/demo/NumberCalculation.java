package com.demo;

public class NumberCalculation {
	String temp = "";

	public int add(int x, int y) {
		return x + y;
	}

	// coverts small to upper case
	public String convertCase(String str) { // str = hello //ASCII 97-121, 65,91 32
		for (int i = 0; i < str.length(); i++) {
			int x = str.charAt(i);
			x = x - 32;
			temp = temp + (char) x;
		}
		return temp;
	}

}

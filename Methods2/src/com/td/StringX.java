package com.td;

public class StringX {

	public static void main(String[] args) {
		
		System.out.println(removeMiddleX("xxHxix"));
		System.out.println(removeMiddleX("abxxxcd"));
		System.out.println(removeMiddleX("xabxxxcdx"));
		System.out.println(removeMiddleX("xx"));
	}
	
	public static String removeMiddleX(String value) {
		
		StringBuilder builder = new StringBuilder();
		int counter = 0;
		
		for (char x : value.toCharArray()) {
			if (counter == 0 || counter == value.length() - 1 || x != 'x') {
				builder.append(x);
			}
			counter++;
		}
		
		return builder.toString();
	}

}

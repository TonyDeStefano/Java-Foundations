package com.td;

public class DoubleX {

	public static void main(String[] args) {
	
		Boolean b;
		
		b = hasDoubleX("axxbb");
		System.out.println(b);
		
		b = hasDoubleX("axaxax");
		System.out.println(b);
		
		b = hasDoubleX("xxxxx");
		System.out.println(b);
	}
	
	/**
	 * 
	 * @param value
	 * @return Boolean
	 */
	public static Boolean hasDoubleX(String value) {
		
		int pos = value.indexOf('x');
		
		if (pos >= 0 && pos < value.length() - 1) {
			if (value.charAt(pos + 1) == 'x') {
				return true;
			}
		}
		
		return false;
	}

}

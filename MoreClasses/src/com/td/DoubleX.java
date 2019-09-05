package com.td;

public class DoubleX {

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

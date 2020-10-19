package com.ecoaccumulation.eco.utils;
/**
 * @author abhijit
 *
 */
public class CommonUtils {

	/**
	 * @param str
	 * @return boolean
	 */
	public static boolean isNumber(String str) {
		return str.matches("-?\\d+(\\.\\d+)?");
	}

	/**
	 * @param string
	 * @return boolean
	 */
	public static boolean isEmptyString(String string) {
		return string == null || string.isEmpty();
	}

}

package com.GeeksForGeeks.project.Math;

import java.util.HashMap;

/**
 * Given a fraction. Convert it into a decimal. If the fractional part is
 * repeating, enclose the repeating part in parentheses.
 * 
 * 
 * Example 1:
 * 
 * Input: numerator = 1, denominator = 3 Output: "0.(3)" Explanation: 1/3 =
 * 0.3333... So here 3 is recurring.
 * 
 * Example 2:
 * 
 * Input: numerator = 5, denominator = 2 Output: "2.5" Explanation: 5/2 = 2.5
 * 
 * 
 * 
 * Your Task: You don't need to read or print anyhting. Your task is to complete
 * the function fractionToDecimal() which takes numerator and denominator as
 * input parameter and returns its decimal form in string format.
 * 
 * 
 * Expected Time Compelxity: O(k) where k is constant. Expected Space
 * Complexity: O(k)
 * 
 * 
 * Constraints: 1 ≤ numerator, denominator ≤ 2000
 * 
 * @author 05946N744
 *
 */
public class GeekMath3 {
	
	public static void main(String[] args) {
		
		System.out.println(fractionToDecimal(22,7));
		
	}
	
	public static String fractionToDecimal(int numerator, int denominator) {

		String res = "";

		HashMap<Integer, Integer> mp = new HashMap<>();
		mp.clear();

		int rem = numerator % denominator;

		while ((rem != 0) && (!mp.containsKey(rem))) {
			mp.put(rem, res.length());
			rem = rem * 10;

			int res_part = rem / denominator;
			res += String.valueOf(res_part);

			rem = rem % denominator;
		}

		int fraction=numerator/denominator;
		if (mp.containsKey(rem)) {
			res = ""+fraction+"."+res.substring(0, mp.get(rem))+"(" + res.substring(mp.get(rem)) + ")";
		} else if (rem == 0) {
			if(res!="") {
				return ""+fraction+"."+res;
			}
			return ""+fraction;
		}
		return res;
	}
}

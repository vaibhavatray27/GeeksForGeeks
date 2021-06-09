package com.GeeksForGeeks.project.Math;

/**
 * Given an array of size N-1 such that it only contains distinct integers in
 * the range of 1 to N. Find the missing element.
 * 
 * Example 1:
 * 
 * Input: N = 5 A[] = {1,2,3,5} Output: 4
 * 
 * Example 2:
 * 
 * Input: N = 10 A[] = {1,2,3,4,5,6,7,8,10} Output: 9
 * 
 * 
 * Your Task : You don't need to read input or print anything. Complete the
 * function MissingNumber() that takes array and N as input parameters and
 * returns the value of the missing number.
 * 
 * 
 * Expected Time Complexity: O(N) Expected Auxiliary Space: O(1)
 * 
 * 
 * Constraints: 1 ≤ N ≤ 106 1 ≤ A[i] ≤ 106
 * 
 * @author 05946N744
 *
 */
public class GeekMath1 {

	public static void main(String[] args) {

		int arr[] = { 1, 2, 3, 5 };
		int[] arr1 = new int[5];
		int n = 5;
		System.out.println(missingNumber(arr, n));

	}

	static int missingNumber(int array[], int n) {
		// Your Code Here
		int sum = 0;

		for (int i : array) {
			sum += i;
		}

		int sumOfNNumbers = 0;
		for (int i = 0; i <= n; i++) {
			sumOfNNumbers += i;
		}
		return (sumOfNNumbers - sum);
	}
}

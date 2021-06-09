package com.GeeksForGeeks.project.array;

/**
 * Given an unsorted array arr[] of size N, rotate it by D elements in the
 * counter-clockwise direction.
 * 
 * 
 * Example 1:
 * 
 * Input: N = 5, D = 2 arr[] = {1,2,3,4,5} Output: 3 4 5 1 2 Explanation: 1 2 3
 * 4 5 when rotated by 2 elements, it becomes 3 4 5 1 2.
 * 
 * Example 2:
 * 
 * Input: N = 10, D = 3 arr[] = {2,4,6,8,10,12,14,16,18,20} Output: 8 10 12 14
 * 16 18 20 2 4 6 Explanation: 2 4 6 8 10 12 14 16 18 20 when rotated by 3
 * elements, it becomes 8 10 12 14 16 18 20 2 4 6.
 * 
 * Your Task: Complete the function rotateArr() which takes the array, D and N
 * as input parameters and rotates the array by D elements. The array must be
 * modified in-place without using extra space.
 * 
 * Expected Time Complexity: O(N) Expected Auxiliary Space: O(1)
 * 
 * 
 * @author 05946N744
 *
 */
public class GeekArray2 {

	public static void main(String[] args) {

		int D = 2;
		int n = 8;
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// int[] array = {40, 13, 27, 87, 95, 40, 96, 71, 35, 79, 68, 2, 98, 3, 18, 93,
		// 53, 57, 2, 81, 87, 42, 66, 90, 45, 20, 41, 30, 32, 18, 98, 72, 82, 76, 10,
		// 28, 68, 57, 98, 54, 87, 66, 7, 84, 20, 25, 29, 72, 33, 30, 4, 20, 71, 69, 9,
		// 16, 41, 50, 97, 24, 19, 46, 47, 52, 22, 56, 80, 89, 65, 29, 42, 51, 94, 1,
		// 35, 65, 25};
		rotateArray(array, D, n);
	}

	private static void rotateArray(int arr[], int d, int n) {

		int[] temp = new int[d];
		// 2
		int j = 0;

		for (int i = 0; i < d; i++) {
			temp[i] = arr[i];
		}
		// temp = 1,2
		for (int i = d; i < n; i++) {
			arr[j] = arr[i];
			j++;
		}
		// arr= 3,4,5
		int k = 0;
		for (int i = (n - d); i < n; i++) {
			arr[i] = temp[k];
			k++;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(+arr[i]);
		}

		// int[] rotatedArraytemp1 = new int[arr.length-d];
		// rotatedArraytemp1=Arrays.copyOfRange(arr, d, arr.length);
		/*
		 * int[] rotatedArraytemp = new int[d]; int[] rotatedArraynew = new
		 * int[arr.length];
		 * 
		 * for (int i=0;i<d;i++) { rotatedArraytemp[i] = arr[i]; }
		 * arr=Arrays.copyOfRange(arr, d, arr.length);
		 * 
		 * System.arraycopy(arr, 0, rotatedArraynew, 0, (n-d));
		 * System.arraycopy(rotatedArraytemp, 0, rotatedArraynew, (n-d),
		 * rotatedArraytemp.length);
		 * 
		 * 
		 * arr = rotatedArraynew.clone();
		 */
	}

}

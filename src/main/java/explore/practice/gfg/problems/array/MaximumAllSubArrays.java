package explore.practice.gfg.problems.array;

import java.util.ArrayList;

/**
 * 
 * @author Santosh Thapa
 * 
 * Given an array arr[] of size N and an integer K. 
 * Find the maximum for each and every contiguous subarray of size K.
 *
 * Date: 30 May 2021
 */
public class MaximumAllSubArrays {
	
	public ArrayList <Integer> max_of_subarrays(int arr[], int n, int k) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if(n == 0 || k > n) return result;
		int max = 0, secondMax = 0;
		for(int i = 0; i < k; i++) {
			if(max < arr[i]) {
				secondMax = max;
				max = arr[i];
			} else if(secondMax < arr[i])
				secondMax = arr[i];
		}
		result.add(max);
		for(int i = k; i < n; i++) {
			max = max == arr[i - k] ? secondMax : max;
			if(max < arr[i]) {
				secondMax = max;
				max = arr[i];
			} else if(secondMax < arr[i])
				secondMax = arr[i];
			result.add(max);
		}
		return result;
    }
	
	public static void main(String[] args) {
		MaximumAllSubArrays max = new MaximumAllSubArrays();
		int[] arr = new int[] {5, 4, 3, 4, 1, 4, 6, 8, 1};
		ArrayList<Integer> result = max.max_of_subarrays(arr, arr.length, 3);
		result.forEach(System.out::println);
		System.out.println("===========");
		result = max.max_of_subarrays(new int[] {1999, 1453, 1333, 1, 4, 5, 2, 3, 6}, 9, 8);
		result.forEach(System.out::println);
	}

}

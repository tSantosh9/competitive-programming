package explore.practice.gfg.problems.array;

import java.util.Arrays;

/**
 * 
 * @author Santosh Thapa
 * 
 * <br><br>
 * Given an input stream arr[] of n integers. 
 * Find the Kth largest element for each element in the stream and 
 * if the Kth element doesn't exist, return -1. 
 * <br><br>
 * Input: k = 4, n = 6, arr[] = {1, 2, 3, 4, 5, 6} <br>
 * Output: -1 -1 -1 1 2 3
 * <br><br>
 * Explanation: k = 4 <br>
 * For 1, the 4th largest element doesn't exist so we print -1.<br>
 * For 2, the 4th largest element doesn't exist so we print -1.<br>
 * For 3, the 4th largest element doesn't exist so we print -1.<br>
 * For 4, the 4th largest element is 1.<br>
 * For 5, the 4th largest element is 2.<br>
 * For 6, the 4th largest element is 3.<br>
 * <br>
 * Expected Time Complexity: O(nlogk) <br>
 * Expected Auxiliary Space: O(n)
 *
 */
public class KthLargestElementInStream {

	public int[] kthLargest(int k, int[] arr, int n) {
		int[] result = new int[n];
		for(int i = 0; i < n; i++) {
				result[i] = -1;
		}
        return result;
    }
	
	public static void main(String[] args) {
		KthLargestElementInStream k = new KthLargestElementInStream();
		int[] arr = {1, 2, 3, 4, 5, 6};
		int[] result = k.kthLargest(4, arr, arr.length);
		System.out.println(Arrays.toString(result));
		int[] arr1 = {3, 4};
		result = k.kthLargest(1, arr1, arr1.length);
		System.out.println(Arrays.toString(result));
		int[] arr2 = {12003, 4168, 26210, 25513, 25028, 26515, 28658, 31452, 22969, 15171, 25973, 24290, 7484, 27196, 4933, 12155, 32413, 10457, 6761, 3935, 17471, 22599, 31336, 22217, 8452, 27947, 27999, 20278, 4358, 10635, 19026, 23658, 28296, 11755, 25024, 14005, 21292, 9654, 2170, 6772, 6502, 4832, 17589, 4314, 4656, 31946, 20829, 13809, 17151, 1638, 27564, 8155, 16374, 12187, 7932, 19294, 30298, 17899, 729, 12704, 31559, 18515, 8027, 27438, 12961, 17010, 27570, 1091, 25164, 25326, 6915, 26184, 1440, 20756, 11123, 31383, 29975, 1470, 27521, 27268, 13897, 11130, 27032, 8350, 2075, 18920};
		result = k.kthLargest(76, arr2, arr2.length);
		System.out.println(Arrays.toString(result));
		
	}
	
}

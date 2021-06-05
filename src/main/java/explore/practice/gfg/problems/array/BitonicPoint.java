package explore.practice.gfg.problems.array;

/**
 * 
 * @author Santosh Thapa 
 * 
 * <br>
 * Given an array arr of n elements which is first increasing and then may be decreasing, 
 * find the maximum element in the array.<br>
 * Note: If the array is increasing then just print then last element will 
 * be the maximum value.<br><br>
 * 
 * Input: n = 9, arr[] = {1,15,25,45,42,21,17,12,11} <br>
 * Output: 45 <br>
 * Explanation: Maximum element is 45. 
 * <br><br> 
 * Expected Time Complexity: O(logn) <br>
 * Expected Auxiliary Space: O(1)
 *
 */
public class BitonicPoint {

	int max(int num1, int num2) {
		return num1 > num2 ? num1 : num2;
	}
	
	int findMaximum(int[] arr, int n) {
		if(n == 1) return arr[0];
		int start = 0;
		int mid = n / 2;
		while(true) {
			if(mid - 1 < 0)
				return max(arr[mid], arr[mid + 1]);
			if(mid + 1 >= n)
				return max(arr[mid], arr[mid - 1]);
			if(arr[mid] > arr[mid + 1]  && arr[mid] > arr[mid - 1])
				return arr[mid];			
			if(arr[mid - 1] > arr[mid] && arr[mid] > arr[mid + 1])
				mid = (start + mid - 1) / 2;
			else if(arr[mid - 1] < arr[mid] && arr[mid] < arr[mid + 1]) {
				start = mid + 1;
				mid = (start + n) / 2;
			}
		}
	}
	
	public static void main(String[] args) {
		BitonicPoint bp = new BitonicPoint();
		int arr[] = {1,15,25,45,55,60,65,75,100,42,21,17,12,11};
		System.out.println(bp.findMaximum(arr, arr.length));
		int arr1[] = {1, 45, 47, 50, 5};
		System.out.println(bp.findMaximum(arr1, arr1.length));
		int arr3[] = {1,15,25,45,42,21,17,12,11};
		System.out.println(bp.findMaximum(arr3, arr3.length));
	}

}

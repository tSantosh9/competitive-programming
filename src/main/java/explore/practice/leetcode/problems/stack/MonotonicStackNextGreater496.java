// https://leetcode.com/problems/next-greater-element-i/description/?envType=problem-list-v2&envId=monotonic-stack

package explore.practice.leetcode.problems.stack;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class MonotonicStackNextGreater496 {

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> indexResultMap = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        for (int j = 0; j < nums2.length; j++) {
            /*
             * Monotonic decreasing stack i.e., the elements are stored in the decreasing order from BOTTOM to TOP.
             * Storing index in the stack
             * If the element indexed using top of the stack is less than the current element then pop
             */
            while (!stack.isEmpty() && nums2[stack.peek()] < nums2[j]) {
                indexResultMap.put(nums2[stack.pop()], nums2[j]);
            }
            stack.push(j);
        }
        int[] result = new int[nums1.length];
        for (int i = 0; i< nums1.length; i++) {
            result[i] = indexResultMap.getOrDefault(nums1[i], -1);
        }
        return result;
    }

    public static void main(String[] args) {
        MonotonicStackNextGreater496 solution = new MonotonicStackNextGreater496();
        System.out.println(Arrays.toString(solution.nextGreaterElement(new int[]{4, 1, 2}, new int[]{1, 3, 4, 2})));
        System.out.println(Arrays.toString(solution.nextGreaterElement(new int[]{2, 4}, new int[]{1, 2, 3, 4})));
        System.out.println(Arrays.toString(solution.nextGreaterElement(new int[]{0}, new int[]{1, 2, 0, 4})));
        System.out.println(Arrays.toString(solution.nextGreaterElement(new int[]{2, 1}, new int[]{4, 3, 1, 2})));

    }

}

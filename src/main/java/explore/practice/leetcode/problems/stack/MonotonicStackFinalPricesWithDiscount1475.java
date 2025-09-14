// https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop

package explore.practice.leetcode.problems.stack;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStackFinalPricesWithDiscount1475 {

    public int[] finalPrices(int[] prices) {
        int[] result = new int[prices.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < prices.length; i++) {
            /*
             * Monotonic Increasing Stack i.e., Elements are stored in increasing order from BOTTOM to TOP
             * Storing the index in the stack
             */
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i])
                result[stack.pop()] = prices[i];
            stack.push(i);
        }
        for (int i = 0; i < prices.length; i++)
            result[i] = prices[i] - result[i];
        return result;
    }

    public static void main(String[] args) {
        MonotonicStackFinalPricesWithDiscount1475 solution = new MonotonicStackFinalPricesWithDiscount1475();
        System.out.println(Arrays.toString(solution.finalPrices(new int[]{8, 4, 6, 2, 3})));
        System.out.println(Arrays.toString(solution.finalPrices(new int[]{1, 2, 3, 4, 5})));
        System.out.println(Arrays.toString(solution.finalPrices(new int[]{10, 1, 1, 6})));
    }

}

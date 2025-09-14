package explore.practice.leetcode.problems.stack;

import java.util.Arrays;
import java.util.Stack;

public class MonotonicStackDailyTemperatures739 {

    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < temperatures.length; i++) {
            /*
             * Used Monotonic Decreasing Stack i.e., Elements are stored in the decreasing order from BOTTOM to TOP
             * Storing the index in the stack
             */
            while(!stack.isEmpty() && temperatures[stack.peek()] < temperatures[i]) {
                int top = stack.pop();
                result[top] = i - top;
            }
            stack.push(i);
        }
        return result;
    }

    public static void main(String[] args) {
        MonotonicStackDailyTemperatures739 solution = new MonotonicStackDailyTemperatures739();
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{30, 40, 50, 60})));
        System.out.println(Arrays.toString(solution.dailyTemperatures(new int[]{30, 60, 90})));
    }

}

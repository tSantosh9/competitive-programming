package explore.practice.leetcode.problems.string;

/**
 * Given a string s and an integer k, reverse the first k characters 
 * for every 2k characters counting from the start of the string.
 * If there are fewer than k characters left, reverse all of them. 
 * If there are less than 2k but greater than or equal to k characters, 
 * then reverse the first k characters and left the other as original.
 * 
 * @author santosh
 *
 */
public class ReverseString {

	public String reverseString(String str, int start, int end) {
		System.out.println("start: " + start + ", end: " + end);
		StringBuffer sb = new StringBuffer();
		int mid = (start + end) / 2;
		System.out.println("Mid: " + mid);
		char[] s = str.toCharArray();
		char temp;
		for(int i = start; i <= mid; i++) {
			temp = s[i];
			s[i] = s[end];
			s[end] = temp;
			end--;
			sb.append(s[i]);
		}
		return sb.toString();
	}

	public String reverseStr(String s, int k) {
		StringBuffer sb = new StringBuffer();
		for(int i = 1; i <= s.length();) {
			sb.append(reverseString(s, i - 1, (i - 1) + k - 1));	
			i += 2 * k;
		}
		return sb.toString();
	}
	
	public static void main(String[] args) {
		ReverseString solution = new ReverseString();
		String result = solution.reverseStr("abcdefgh", 2);
		System.out.println(result);
	}
	
}

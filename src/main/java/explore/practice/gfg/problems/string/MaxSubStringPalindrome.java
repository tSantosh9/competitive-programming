package explore.practice.gfg.problems.string;

import java.util.LinkedList;
import java.util.Queue;

public class MaxSubStringPalindrome {
	
	public boolean isPalindrome(String str) {
		if(str == null || str.isEmpty()) return false;
		int length = str.length();
		int index = 0;
		while(index <= length - 1) {
			if(str.charAt(index) != str.charAt(length - 1))
				return false;
			index++;
			length--;
		}
		return true;
	}
	
	public String getMaxSubStringPalindrome(String str) {
		if(str == null || str.isEmpty()) return str;
		Queue<String> queue = new LinkedList<String>();
		queue.add(str);
		int length = 0;
		String s = null;
		while(!queue.isEmpty()) {
			s = queue.remove();
			if(isPalindrome(s))
				return s;
			length = s.length();
			queue.add(s.substring(0, length - 1));
			queue.add(s.substring(1, length));
		}
		return null;
	}

	public static void main(String[] args) {
		MaxSubStringPalindrome solution = new MaxSubStringPalindrome();
		String string = "ababadaaabbbaaa";
		System.out.println("Max substring of '" + string + "' that is a palindrome is: "
				+ solution.getMaxSubStringPalindrome(string));
	}
	
}

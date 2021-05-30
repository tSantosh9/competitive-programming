package explore.practice.leetcode.problems.string;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class PalindromicSubStrings {

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

	public int countSubstrings(String s) {
		if(s == null || s.isBlank()) return 0;
		Map<String, Boolean> map = new HashMap<String, Boolean>();
		Queue<String> queue = new LinkedList<String>();
		queue.add(s);
		String subStr = null;
		int length = 0;
		int sum = 0;
		while(!queue.isEmpty()) {
			subStr = queue.remove();
			length = subStr.length();
			if(length == 1) continue;
			if(map.get(subStr) == null || map.get(subStr) == false) {
				if(isPalindrome(subStr))
					map.put(subStr, true);
			} else
				sum++;
			queue.add(subStr.substring(0, length - 1));
			queue.add(subStr.substring(1, length));
		}
		return map.keySet().size() + sum + s.length();
	}
	
	public static void main(String[] args) {
		PalindromicSubStrings sol = new PalindromicSubStrings();
		String str = "aaaa";
		System.out.println(sol.countSubstrings(str));
	}

}

// https://leetcode.com/problems/maximum-number-of-words-you-can-type/description/

package explore.practice.leetcode.problems.string;

import java.util.HashSet;
import java.util.Set;

public class MaxNoWordsYouCanType1935 {

    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> brokenSet = new HashSet<>();
        for (char c : brokenLetters.toLowerCase().toCharArray()) {
            brokenSet.add(c);
        }
        String[] words = text.split(" ");
        int count = 0;
        for (String word : words) {
            boolean canType = true;
            for (char c : word.toCharArray()) {
                if (Character.isLetter(c) && brokenSet.contains(Character.toLowerCase(c))) {
                    canType = false;
                    break;
                }
            }
            if (canType) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        MaxNoWordsYouCanType1935 solution = new MaxNoWordsYouCanType1935();
        System.out.println(solution.canBeTypedWords("hello world", "ad"));
    }

}

// Given a string s, find the length of the longest 
// substring
//  without repeating characters.

// Example 1:

// Input: s = "abcabcbb"
// Output: 3
// Explanation: The answer is "abc", with the length of 3.
// Example 2:

// Input: s = "bbbbb"
// Output: 1
// Explanation: The answer is "b", with the length of 1.

import java.util.ArrayList;
import java.util.List;

public class LongestSubStringWithoutRepeatingCharacters {
    public static void main(String[] args) {
        LongestSubStringWithoutRepeatingCharacters obj = new LongestSubStringWithoutRepeatingCharacters();
        String s = "abcabcbb";
        System.out.println("Maximum length is : "+obj.lengthOfLongestSubstring(s));
    }
    public int lengthOfLongestSubstring(String s) {
        // Sliding Window
        int start = 0;
        int end = 0;
        int max_length = 0;
        List<Character> list = new ArrayList<Character>();
        
        while(end<s.length()){
            if(!list.contains(s.charAt(end))){
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(list.size(), max_length);
            }else{
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
}

import java.util.*;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int start = 0; // Left pointer of window

        for (int end = 0; end < s.length(); end++) {
            char c = s.charAt(end);
            
            // If character is already seen, move the left pointer
            if (map.containsKey(c)) {
                start = Math.max(map.get(c) + 1, start);
            }

            map.put(c, end); // Store latest index of character
            maxLength = Math.max(maxLength, end - start + 1);
        }

        return maxLength;
    }
}

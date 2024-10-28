import java.util.HashMap;

class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Fill the map with the frequency of characters in s1
        for (char x : s1.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        int right = 0, left = 0;
        int n = s2.length();
        int required = s1.length(); // Total number of characters to match

        while (right < n) {
            char rightChar = s2.charAt(right);

            // Decrease required if the character in s2 is in the map and still needed
            if (map.getOrDefault(rightChar, 0) > 0) {
                required--;
            }

            // Decrement the count of the current character in the map
            map.put(rightChar, map.getOrDefault(rightChar, 0) - 1);
            right++;

            // If required becomes 0, it means s1's permutation is found in s2
            if (required == 0) {
                return true;
            }

            // If the window size equals s1's length, slide the window
            if (right - left == s1.length()) {
                char leftChar = s2.charAt(left);

                // If the character was part of s1, increase required
                if (map.getOrDefault(leftChar, 0) >= 0) {
                    required++;
                }

                // Increment the count of the character in the map as it leaves the window
                map.put(leftChar, map.getOrDefault(leftChar, 0) + 1);
                left++;
            }
        }

        return false;
    }
}

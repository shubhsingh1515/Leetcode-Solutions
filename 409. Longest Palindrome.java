public class Solution {
    public int longestPalindrome(String s) {

        HashSet<Character> hs = new HashSet<>();
        int length = 0;

        for (char ch : s.toCharArray()) {
            if (hs.contains(ch)) {
                hs.remove(ch);
                length += 2;
            } else {
                hs.add(ch);
            }
        }
        if (!hs.isEmpty()) {
            length += 1;
        }

        return length;
    }
}

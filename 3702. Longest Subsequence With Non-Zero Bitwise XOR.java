class Solution {
    public int longestSubsequence(int[] nums) {
        int totalXor = 0;
        int length = nums.length;
        boolean hasNonZeroElement = false;

        for (int number : nums) {
            if (number != 0) {
                hasNonZeroElement = true;
            }

            totalXor ^= number;
        }

        if (totalXor != 0) {
            return length;
        }

        if (hasNonZeroElement) {
            return length - 1;
        }

        return 0;
    }
}

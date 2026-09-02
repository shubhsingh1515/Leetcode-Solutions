class Solution {
    public boolean uniformArray(int[] nums1) {
        // If all numbers have the same parity, keep them unchanged.
        // If both odd and even numbers exist:
        // even - odd = odd, so we can make every number odd.
        // Therefore, it is always possible.
        return true;
        
    }
}

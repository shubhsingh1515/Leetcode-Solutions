class Solution {
    public int maxProduct(int n) {
        char[] digits = String.valueOf(n).toCharArray();

        int max1 = 0;
        int max2 = 0;

        for (char ch : digits) {
            int digit = ch - '0';

            if (digit >= max1) {
                max2 = max1;
                max1 = digit;
            } else if (digit > max2) {
                max2 = digit;
            }
        }

        return max1 * max2;
        
    }
}

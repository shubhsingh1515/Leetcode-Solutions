class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            int digitSum = sumDigits(num);
            min = Math.min(min, digitSum);
        }

        return min;
    }

    int sumDigits(int n) {
        int sum = 0;

        while (n != 0) {
            int k = n % 10;
            sum += k;
            n /= 10;
        }

        return sum;
    }
}

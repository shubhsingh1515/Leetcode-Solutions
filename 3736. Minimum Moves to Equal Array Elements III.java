class Solution {
    public int minMoves(int[] nums) {
        int max = 0;
        int sum = 0;

        for(int a : nums){
            max = Math.max(max, a);
            sum += a;
        }
        return max * nums.length - sum;
        
    }
}

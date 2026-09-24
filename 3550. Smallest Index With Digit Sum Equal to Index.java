class Solution {
    public int smallestIndex(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int k = nums[i];
            int sum = 0;
            while(k > 0){
                sum += k%10;
                k /= 10;
            }
            if(sum == i) return i;
        }
        return -1;
    }
}

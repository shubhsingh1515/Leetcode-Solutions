class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length;
        HashSet <Integer> hs = new HashSet<>();
        for(int a : nums){
            if(hs.contains(a)){
                return a;
            }
            hs.add(a);
        }
        return -1;
    }
}

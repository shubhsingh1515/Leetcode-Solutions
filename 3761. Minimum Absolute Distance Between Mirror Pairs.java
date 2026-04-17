class Solution {
    public int reverse(int n) {
      int rev = 0;

        while (n != 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n = n / 10;
        }

        return rev;
    }

    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int minDist = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            if (map.containsKey(nums[i])) {
                int prevIndex = map.get(nums[i]);
                int dist = i - prevIndex;
                minDist = Math.min(minDist, dist);
            }

            int rev = reverse(nums[i]);
            map.put(rev, i);
        }

        return (minDist == Integer.MAX_VALUE) ? -1 : minDist;   
    }
}

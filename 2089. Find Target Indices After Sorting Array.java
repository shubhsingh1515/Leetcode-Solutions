class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        // Arrays.sort(nums);

        // ArrayList<Integer> list = new ArrayList<>();

        // for(int i=0; i<nums.length; i++) {
        //     if(nums[i] == target) {
        //         list.add(i);
        //     }
        // }        
        // return list;


        int smaller = 0, equal = 0;

        for (int num : nums) {
            if (num < target) smaller++;
            else if (num == target) equal++;
        }

        List<Integer> result = new ArrayList<>(equal);

        for (int i = smaller; i < smaller + equal; i++) {
            result.add(i);
        }

        return result;
    }
}

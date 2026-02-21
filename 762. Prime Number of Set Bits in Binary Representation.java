class Solution {
    public int countPrimeSetBits(int left, int right) {
        int res = 0;
        Set<Integer> primes = new HashSet<>(
            Arrays.asList(2,3,5,7,11,13,17,19,23,29,31)
        );

        for(int i = left; i <= right; i++) {
            int num = i;
            int setBits = 0;

            while(num > 0) {
                setBits += (num & 1);
                num >>= 1;
            }

            if(primes.contains(setBits))
                res++;
        }

        return res;
    }
}

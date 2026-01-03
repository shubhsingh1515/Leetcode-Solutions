class Solution {
    public int numOfWays(int n) {
        int mod = 1000000007;
        long dpA = 6;
        long dpB = 6;

        for( int i = 2; i <= n; i++ ){
            long newA = (dpA * 2 + dpB * 2) % mod;
            long newB = (dpA * 2 + dpB * 3) % mod;

            dpA = newA;
            dpB = newB;
        }
        return (int)(dpA + dpB) % mod;
        
    }
}

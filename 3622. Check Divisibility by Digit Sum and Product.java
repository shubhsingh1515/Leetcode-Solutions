class Solution {
    public boolean checkDivisibility(int n) {
        int num = n;
        int digSum = 0;
        int digProd = 1;

        while(num != 0 ){
            int k = num % 10;
            digSum += k;
            digProd *= k;
            num /= 10;
        }
        int div = digSum + digProd;
        return n % div == 0;
    }
}

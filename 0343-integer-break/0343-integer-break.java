class Solution {
    public int integerBreak(int n) {
        if(n == 2) {
            return 1;
        }
        if(n == 3) {
            return 2;
        }
        if(n == 4) {
            return 4;
        }
        if(n == 5) {
            return 6;
        }
        int numberOfThrees = n / 3;
        if(n % 3 == 0) {
            return (int)Math.pow(3 , numberOfThrees);
        }
        int remainingNumber = n - (3 * numberOfThrees);
        int ans1 = (int)Math.pow(3 , numberOfThrees) * remainingNumber;
        remainingNumber = n - (3 * (numberOfThrees - 1));
        int ans2 = (int)Math.pow(3 , numberOfThrees - 1) * remainingNumber;
        return Math.max(ans1 , ans2);
    }
}
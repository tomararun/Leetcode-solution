class Solution {
    public int getSum(int a, int b) {
        /*This is the Base Case  that when 
        the value of b is Zero value of a Become result*/
        if(b==0) return a;
        
        if(b<0)
            return getSum(--a,++b);
        else
            return getSum(++a,--b);
    }
}
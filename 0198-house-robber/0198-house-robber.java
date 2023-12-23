class Solution {
    public int rob(int[] nums) {
        int l = nums.length;
        if(l==1) return nums[0];
        if(l==2) return Math.max(nums[0],nums[1]);
        if(l==3) return Math.max(nums[0]+nums[2],nums[1]);
        int[] res = new int[l];
        res[0] = nums[0];
        res[1] = nums[1];
        res[2]= nums[0]+nums[2];
        for(int i=3;i<l;i++)
        {
            res[i]= Math.max(res[i-2]+nums[i] , res[i-3]+nums[i]);
        }

        return Math.max(res[l-1],res[l-2]);
        
    }
}
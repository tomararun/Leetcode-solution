class Solution {
    public boolean canPartition(int[] nums) {
        int sum = 0; 
        for(int n : nums) sum += n; 
        if(sum %2 != 0) return false; 
        int target = sum/2; 
        Boolean[][] dp = new Boolean[nums.length][target+1];
        return partition(target, nums, 0, nums.length, dp);
    }

    private boolean partition(int target, int[] nums, int index, int n, Boolean[][] dp){
        if(target == 0) return true; 
        if(index >= nums.length || target < 0 ) return false; 
        if(dp[index][target] == null){
            dp[index][target] = false; 
            if(partition(target-nums[index], nums, index+1, n, dp)){
                dp[index][target] = true;
                return true; 
            } 
            if(partition(target, nums, index+1, n, dp)){
                dp[index][target] = true;
                return true;
            }
        }
        return dp[index][target]; 
    }
}
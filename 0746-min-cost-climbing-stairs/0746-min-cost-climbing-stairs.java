class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        int pprev = cost[0];
        int prev = cost[1];
  
        for(int i = 2; i < cost.length; i++){
            int curr = Math.min(prev, pprev) + cost[i];
            pprev = prev;
            prev = curr;
        }
        return Math.min(pprev, prev);
    }
}
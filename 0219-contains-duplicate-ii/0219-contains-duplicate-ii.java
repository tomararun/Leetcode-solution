
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        if(nums == null || nums.length < 2 || k == 0)
            return false;
        int i = 0;
        
        HashSet<Integer> hset = new HashSet<Integer>();
        
        for(int j = 0; j < nums.length; j++) {
            
            if(!hset.add(nums[j])){
                return true;
            }
            // If size of the Hash Set becomes greater than k...
            if(hset.size() >= k+1){
                // Remove the last visited element from the set...
                hset.remove(nums[i++]);
            }
        }
        // If no duplicate element is found then return false...
        return false;
    }
}
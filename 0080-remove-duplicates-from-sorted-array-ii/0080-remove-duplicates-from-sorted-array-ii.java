class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int count=1,i=1;
        for(int j=1;j<n;j++){
            if(count<2 && nums[j]==nums[j-1]){
                nums[i]=nums[j];
                count++;
                i++;
            }
            else if(nums[j]!=nums[j-1]){
                count=1;
                nums[i]=nums[j];
                i++;
            }
        }
        return i;
    }
}
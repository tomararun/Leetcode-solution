class Solution {
    
    static int count;
    static int max;
    static int[] arr;
    
    public int countMaxOrSubsets(int[] nums) {
        count = 0;
        max = 0;
        arr = nums;
		//find max OR value
        for (int i = 0; i < nums.length; i++) {
            max |= nums[i];
        }
		
        for (int i = 0; i < nums.length; i++) {
            findCount(i, 0);
        }
        return count;
    }
    
    private void findCount(int idxStart, int orResult) {
		
        if (idxStart >= arr.length) return;
		
        orResult |= arr[idxStart];
		
        if (orResult == max) {
            count++;
        }
        
        for (int i = idxStart + 1; i < arr.length; i++) {
            findCount(i, orResult);
        }
    }
}
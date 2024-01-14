class Solution {
    public boolean find132pattern(int[] nums) {
       int sz = nums.length;
        int two = min_element(nums);
        Deque<Integer> threeStack = new ArrayDeque<>();
        for(int indx = sz - 1; indx > - 1; indx--){
             int currEle = nums[indx];
             if(currEle < two){
                return true;
             }
             while(!threeStack.isEmpty() && threeStack.peekLast() < currEle){
                 two = threeStack.pollLast();
             }
             threeStack.offerLast(currEle);
        }
        return false;
    }
    private int min_element(int nums[]){
        int minE = Integer.MAX_VALUE;
        for(var ele : nums){
            minE = Math.min(minE, ele);
        }
        return minE;
    }
}
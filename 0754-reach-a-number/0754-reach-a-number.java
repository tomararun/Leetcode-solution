class Solution {
    public int reachNumber(int target) {

        
        int step = 0;

        
        int count = 0;

        
        target = Math.abs(target);

        // while out count is less than target
        // Or count - target is odd number 
        // Beacuse if count - target is even it always exceeds the value
        while(count < target || (count - target)% 2 != 0){
               step++; // Increment the steps
               count += step; // Increment count by number of steps
        }

        
        return step;
    }
}
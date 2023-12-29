class Solution {
    public int findMaxConsecutiveOnes(int[] nums)
    {
        // Initialize variables to track the maximum count and current count of consecutive 1s
        int maxCount=0;
        int curCount=0;

        // Iterate through each element in the array
        for(int element: nums)
        {
            if(element==0)
            {
        //reset curCount and maxCount whenever 0 is encountered.
                if(maxCount<curCount)
                {
                    maxCount=curCount;
                }
                curCount=0;                
            }
            else
            {
                curCount++;
            }
        }
        
        return maxCount>curCount? maxCount:curCount;
        
    }
}
class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list= new ArrayList<String>();

        StringBuilder sb= new StringBuilder();
        for(int i= 0; i< nums.length; i++){
            int prev_diff= 0;
            int next_diff= 0;
            if(sb.length()== 0)
                sb.append(String.valueOf(nums[i]));

            // check previous difference
                if(i> 0)
                    prev_diff= nums[i]- nums[i-1];

            // check next difference
                if(i< nums.length-1)
                    next_diff= nums[i+1]- nums[i];

            if(prev_diff== 1 && next_diff!= 1){
                sb.append("->"+ nums[i]);
                list.add(sb.toString());
                sb.setLength(0);
            }

            if(prev_diff!= 1 && next_diff!= 1){
                list.add(sb.toString());
                sb.setLength(0);
            }


        }

        return list;        
    }
}
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        findSubsets(nums,list,new ArrayList<>(),0);
        return list;
    }
    
    public static void findSubsets(int[] nums,List<List<Integer>> list,ArrayList<Integer> temp,int i){
        if(i>=nums.length){
            list.add(new ArrayList<>(temp));
            return;
        }
        
        findSubsets(nums,list,temp,i+1);
        temp.add(nums[i]);
        findSubsets(nums,list,temp,i+1);
        temp.remove(temp.size()-1);
    }
}
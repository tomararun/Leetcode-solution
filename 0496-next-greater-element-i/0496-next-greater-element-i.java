class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer,Integer> map = new HashMap<>();
        Stack<Integer> stack = new Stack<>();

        for(int i=nums2.length-1;i>=0;i--){
            int element = nums2[i];
            while(!stack.isEmpty() && stack.peek() <= element){
                stack.pop();
            }
            int ans = (stack.isEmpty()) ? -1: stack.peek();
            map.put(element, ans);
            stack.push(element);
        }
        int[] result = new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            result[i] = map.get(nums1[i]);
        }
        return result;
    }
}
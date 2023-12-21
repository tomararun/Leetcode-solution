class Solution {
    public int getMinimumDifference(TreeNode root) {
       if(root == null) return 0;
       Stack<TreeNode> stack = new Stack<>();
       int res = Integer.MAX_VALUE;
       TreeNode prev = null, curr = root;
       while(curr != null || ! stack.isEmpty()) {
           while(curr != null) {
               stack.push(curr);
               curr = curr.left;
           }
           curr = stack.pop();
           if(prev != null) {
                res = Math.min(res, Math.abs(curr.val - prev.val));
            }
            prev = curr;
            curr = curr.right;
       } 
       return res;
    }
}
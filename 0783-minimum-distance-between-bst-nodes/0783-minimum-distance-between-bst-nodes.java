class Solution {
    List<Integer> list;
    public int minDiffInBST(TreeNode root) {
        list=new ArrayList<>();
        help(root);
        Collections.sort(list);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<list.size()-1;i++)
        {
            min=Math.min(min,Math.abs(list.get(i)-list.get(i+1)));
        }
        return min;
        
    }
    public void help(TreeNode root)
    {
        if(root==null)return;
        list.add(root.val);
        help(root.left);
        help(root.right);
        return;
        
    }
}
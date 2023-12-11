
class Solution {
    ArrayList<Integer> ls = new ArrayList<>();
    public int countNodes(TreeNode root) {
        count(root);
        return ls.size();
    }
    private void count(TreeNode root){
        if(root == null){
            return;
        }
        ls.add(root.val);
        count(root.left);
        count(root.right);
    }
}
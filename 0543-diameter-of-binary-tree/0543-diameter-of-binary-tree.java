
class Solution {
    public int diameterOfBinaryTree(TreeNode root) {

        
        int diameter[] = new int[1];

        
        height(root,diameter);


      return diameter[0];
    }

    public int height(TreeNode root, int diameter[]){
        
        // Base case: if the root is null, the height is 0
        if(root == null){
            return 0;
        }

        // Recursively calculate the height of the left and right subtrees
        int left = height(root.left,diameter);
        int right = height(root.right,diameter);

        
        diameter[0] = Math.max(diameter[0],left + right);

    
        return Math.max(left,right)+1;
    }
}
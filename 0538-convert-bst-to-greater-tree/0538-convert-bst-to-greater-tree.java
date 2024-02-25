class Solution {
    static Set<Integer> set;
    static int sum;
    public TreeNode convertBST(TreeNode root) {
        set = new TreeSet<>();
        sum = 0;
        traverseBST(root);
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : set) {
            map.put(i, sum);
            sum -= i;
        }
        traverseBSTAndPutNewValues(root, map);
        return root;
    }
    
    private void traverseBSTAndPutNewValues(TreeNode node, Map<Integer, Integer> map) {
        if (node == null) {
            return;
        }
        if (map.containsKey(node.val)) {
            node.val = map.get(node.val);
        }
        traverseBSTAndPutNewValues(node.left, map);
        traverseBSTAndPutNewValues(node.right, map);
    }
    
    private void traverseBST(TreeNode node) {
        if (node == null) {
            return;
        }
        
        if (set.add(node.val)) {
            sum += node.val;
        }
        traverseBST(node.left);
        traverseBST(node.right);
    }
    
}
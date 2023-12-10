class Solution {
    public TreeNode sortedListToBST(ListNode head) {
       
	    	
	    	if(head == null)
	    		return null;
            if(head.next==null) {
			TreeNode node = new TreeNode(head.val);
			return node;
		}
	    	
	    	ListNode mid = findMid(head);
	    	TreeNode node = new TreeNode(mid.val);
	    	node.left = sortedListToBST(head);
	    	node.right = sortedListToBST(mid.next);
	    	
	        return node;
	     
    }

      public ListNode findMid(ListNode start) {
	    	
	    	ListNode fast = start;
	    	ListNode prev = start;
	    	
	    	while(fast!=null && fast.next!=null) {
	    		prev = start;
	    		start = start.next;
	    		fast=fast.next.next;
	    	}
	    	prev.next = null;
	    	return start;
	    }
}
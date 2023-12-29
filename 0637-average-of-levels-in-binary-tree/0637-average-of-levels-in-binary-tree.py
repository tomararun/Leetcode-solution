class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        if not root:
            return None
        q = [root]
        level = []
        res = [root.val]
        x = 0
        while q and root:
            for node in q:
                if node.left:
                    level.append(node.left)
                if node.right:
                    level.append(node.right)
            temp = []
            for i in level:
                temp.append(i.val)
            if temp:
                res.append(sum(temp)/len(temp))
            q = level
            level = []
        return res
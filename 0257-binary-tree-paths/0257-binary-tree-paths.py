class Node:
    def __init__(self, value):
        self.value = value
        self.next = None
    
class LinkedList:
    def __init__(self):
        self.head = None
        self.tail = None
        self.length = 0

    def __len__(self):
        return self.length

    def add(self, value):
        node = Node(value)
        if self.head:
            self.tail.next = node
            self.tail = node
        else:
            self.head = node
            self.tail = node
        self.length += 1

    def remove_first(self):
        if self.head:
            value = self.head.value
            self.head = self.head.next
            self.length -= 1
            return value

class Queue:
    def __init__(self, size = 0):
        self.list = LinkedList()
        self.size = size

    def enqueue(self, value):
        self.list.add(value)

    def dequeue(self):
        return self.list.remove_first()
    
    def is_empty(self):
        return self.list.head == None

class Solution:
    def binaryTreePaths(self, rootNode: Optional[TreeNode]) -> List[str]:
        if not rootNode:
            return
        else:
            queue = Queue()
            queue.enqueue(rootNode)
            paths = {
                f"0-{rootNode.val}": str(rootNode.val)
            }
            next_counter = 0
            current_counter = 0
            while not queue.is_empty():
                current = queue.dequeue()
                current_parent = paths[f"{current_counter}-{current.val}"]
                if current.left:
                    next_counter += 1
                    paths[f'{next_counter}-{current.left.val}'] = f'{current_parent}->{current.left.val}'
                    queue.enqueue(current.left)
                if current.right:
                    next_counter += 1
                    paths[f'{next_counter}-{current.right.val}'] = f'{current_parent}->{current.right.val}'
                    queue.enqueue(current.right)
                if current.right or current.left:    
                    del paths[f"{current_counter}-{current.val}"]
                current_counter += 1
            return list(paths.values())
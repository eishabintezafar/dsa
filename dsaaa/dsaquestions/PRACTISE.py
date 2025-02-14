# Basic Practice Questions for Binary Tree

class Node:
    def __init__(self, key):
        self.left = None
        self.right = None
        self.val = key

# 1. Create a binary tree and insert nodes
def insert(root, key):
    if root is None:
        return Node(key)
    if key < root.val:
        root.left = insert(root.left, key)
    else:
        root.right = insert(root.right, key)
    return root

# 2. Implement in-order, pre-order, and post-order traversals
def inorder(root):
    if root:
        inorder(root.left)
        print(root.val, end=" ")
        inorder(root.right)

def preorder(root):
    if root:
        print(root.val, end=" ")
        preorder(root.left)
        preorder(root.right)

def postorder(root):
    if root:
        postorder(root.left)
        postorder(root.right)
        print(root.val, end=" ")

# 3. Find the height of a binary tree
def height(root):
    if root is None:
        return -1
    return max(height(root.left), height(root.right)) + 1

# 4. Count the number of nodes in a binary tree
def count_nodes(root):
    if root is None:
        return 0
    return 1 + count_nodes(root.left) + count_nodes(root.right)

# 5. Count the number of leaf nodes
def count_leaves(root):
    if root is None:
        return 0
    if root.left is None and root.right is None:
        return 1
    return count_leaves(root.left) + count_leaves(root.right)

# 6. Find the maximum value in a binary tree
def find_max(root):
    if root is None:
        return float('-inf')
    return max(root.val, find_max(root.left), find_max(root.right))

# 7. Find the minimum value in a binary tree
def find_min(root):
    if root is None:
        return float('inf')
    return min(root.val, find_min(root.left), find_min(root.right))

# 8. Check if a binary tree is balanced
def is_balanced(root):
    if root is None:
        return True
    left_height = height(root.left)
    right_height = height(root.right)
    if abs(left_height - right_height) > 1:
        return False
    return is_balanced(root.left) and is_balanced(root.right)

# 9. Check if two binary trees are identical
def is_identical(root1, root2):
    if root1 is None and root2 is None:
        return True
    if root1 is not None and root2 is not None:
        return (root1.val == root2.val and is_identical(root1.left, root2.left) and is_identical(root1.right, root2.right))
    return False

# 10. Find the lowest common ancestor of two nodes
def lca(root, n1, n2):
    if root is None:
        return None
    if root.val > n1 and root.val > n2:
        return lca(root.left, n1, n2)
    if root.val < n1 and root.val < n2:
        return lca(root.right, n1, n2)
    return root

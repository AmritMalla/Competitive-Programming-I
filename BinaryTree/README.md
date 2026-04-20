# Binary Tree Problems

This directory contains implementations of various Binary Tree operations and algorithms in Java.

## 📋 Table of Contents

- [Overview](#overview)
- [Problems](#problems)
  - [1. Construct and Display Binary Tree](#1-construct-and-display-binary-tree)
  - [2. Diameter of Binary Tree](#2-diameter-of-binary-tree)
  - [3. Find Largest BST](#3-find-largest-bst)
  - [4. Is Balanced Tree](#4-is-balanced-tree)
  - [5. Is Binary Search Tree](#5-is-binary-search-tree)
  - [6. Iterative Tree Traversal](#6-iterative-tree-traversal)
  - [7. K Distance Away from Given Node](#7-k-distance-away-from-given-node)
  - [8. Left Cloned to Normal Tree](#8-left-cloned-to-normal-tree)
  - [9. Level Order Traversal](#9-level-order-traversal)
  - [10. Path Sum to Leaves on Given Range](#10-path-sum-to-leaves-on-given-range)
  - [11. Path to Root Node](#11-path-to-root-node)
  - [12. Print K Level Away](#12-print-k-level-away)
  - [13. Print Single Child Node](#13-print-single-child-node)
  - [14. Remove All Leaf Nodes from BT](#14-remove-all-leaf-nodes-from-bt)
  - [15. Size, Sum, Max, Height of Tree](#15-size-sum-max-height-of-tree)
  - [16. Tilt of Binary Tree](#16-tilt-of-binary-tree)
  - [17. Transform to Left Cloned](#17-transform-to-left-cloned)
- [Common Structure](#common-structure)
- [How to Run](#how-to-run)

---

## Overview

A Binary Tree is a hierarchical data structure where each node has at most two children (left and right). Unlike Binary Search Trees, binary trees don't have any ordering constraints on node values.

**Key Properties:**
- Maximum nodes at level `l`: 2^l
- Maximum nodes in tree of height `h`: 2^(h+1) - 1
- Minimum height for n nodes: ⌊log₂(n)⌋

---

## Problems

### 1. Construct and Display Binary Tree

**File:** `ConstructAndDisplayBinaryTree.java`

**Problem Statement:**  
Construct a binary tree from an array representation and display it.

**Description:**  
- Uses a stack-based approach to construct the tree from level order traversal
- Two construction methods implemented:
  - `construct()`: Standard approach
  - `construct1()`: Alternative approach with different index handling
- Display shows each node with its left and right children

**Input:**  
Hardcoded array: `[50, 25, 12, null, null, 37, 30, null, null, null, 75, 62, null, 70, null, null, 87, null, null]`

**Output Format:**  
Tree structure showing parent-child relationships

**Time Complexity:** O(n)  
**Space Complexity:** O(h) for stack

---

### 2. Diameter of Binary Tree

**File:** `DiameterOfBinaryTree.java`

**Problem Statement:**  
Find the diameter (longest path between any two nodes) of a binary tree.

**Description:**  
Two approaches implemented:

**Approach 1 (Optimized):**  
- Returns both height and diameter in a single traversal
- Diameter at each node = left_height + right_height + 2
- Time: O(n), Space: O(h)

**Approach 2 (Alternative):**  
- Uses a static variable to track maximum diameter
- Calculates height separately
- Time: O(n), Space: O(h)

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
The diameter (number of edges in longest path)

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 3. Find Largest BST

**File:** `FindLargestBST.java`

**Problem Statement:**  
Find the largest Binary Search Tree (BST) subtree within a binary tree.

**Description:**  
- For each node, check if subtree rooted at that node is a BST
- Track: isBST flag, min value, max value, and size
- If BST, compare size with current largest
- Return root node and size of largest BST

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
`rootData@size` (e.g., "50@5" means BST of size 5 rooted at node 50)

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 4. Is Balanced Tree

**File:** `IsBalancedTree.java`

**Problem Statement:**  
Check if a binary tree is height-balanced.

**Description:**  
- A tree is balanced if the height difference between left and right subtrees is at most 1
- Calculate height of each subtree
- Track balance status using a boolean flag

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
`true` or `false`

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 5. Is Binary Search Tree

**File:** `IsBinaryTree.java`

**Problem Statement:**  
Verify if a given binary tree is a valid Binary Search Tree (BST).

**Description:**  
- For each node, validate BST property:
  - All values in left subtree < node value
  - All values in right subtree > node value
- Track min and max values from subtrees
- Use MinMaxPair to propagate constraints up the tree

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
`true` or `false`

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 6. Iterative Tree Traversal

**File:** `IterativeTreeTraversal.java`

**Problem Statement:**  
Perform preorder, inorder, and postorder traversals iteratively using a single stack.

**Description:**  
- Uses state machine approach with Pair class
- State 0: Preorder (process before children)
- State 1: Inorder (process after left child)
- State 2: Postorder (process after right child)

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
Three lines:
1. Preorder traversal
2. Inorder traversal
3. Postorder traversal

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 7. K Distance Away from Given Node

**File:** `KDistanceAwaFromGivenNode.java`

**Problem Statement:**  
Print all nodes at distance k from a given target node.

**Description:**  
- First find path from root to target node
- For each node in path, print nodes at distance (k - distance_from_target)
- Use blocker parameter to avoid going back down the path

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
data (target node value)
k (distance)
```

**Output Format:**  
Nodes at distance k, one per line

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 8. Left Cloned to Normal Tree

**File:** `LeftClonedToNormalTree.java`

**Problem Statement:**  
Convert a left-cloned tree back to normal binary tree.

**Description:**  
- In a left-cloned tree, each node has a clone as its left child
- Remove the clone by setting `node.left = node.left.left`
- Recursively process the tree

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
Level order display of the restored tree

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 9. Level Order Traversal

**File:** `LevelOrderTraversal.java`

**Problem Statement:**  
Print the tree level by level (BFS traversal).

**Description:**  
- Use a queue to process nodes level by level
- Track width of each level to separate output
- Add children to queue for next level processing

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
Each level on a separate line

**Time Complexity:** O(n)  
**Space Complexity:** O(w) where w is maximum width

---

### 10. Path Sum to Leaves on Given Range

**File:** `PathSumToLeavesOnGivenRange.java`

**Problem Statement:**  
Print all root-to-leaf paths where the sum of node values falls within a given range [lo, hi].

**Description:**  
- DFS traversal accumulating path sum
- At leaf node, check if sum is within range
- Prune branches where sum exceeds hi

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
lo (lower bound)
hi (upper bound)
```

**Output Format:**  
Valid paths, one per line

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 11. Path to Root Node

**File:** `PathToRootNode.java`

**Problem Statement:**  
Find the path from a given node to the root.

**Description:**  
Two approaches:
1. **Return ArrayList:** Build path while returning from recursion
2. **Use Static List:** Add nodes to global list during return

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
data (target node value)
```

**Output Format:**  
Path from target to root as a list

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 12. Print K Level Away

**File:** `PrintKLevelAway.java`

**Problem Statement:**  
Print all nodes at exactly k levels down from the root.

**Description:**  
Two approaches:
1. **Iterative (BFS):** Use queue, track level
2. **Recursive (DFS):** Decrease k until 0

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
k (level distance)
```

**Output Format:**  
Nodes at level k, one per line

**Time Complexity:** O(n)  
**Space Complexity:** O(w) or O(h)

---

### 13. Print Single Child Nodes

**File:** `PrintSingleChildNode.java`

**Problem Statement:**  
Print all nodes that are single children (parent has only one child).

**Description:**  
- Track parent node during traversal
- If parent has only one child, print that child's value

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
Single child nodes, one per line

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 14. Remove All Leaf Nodes from BT

**File:** `RemoveAllLeafNodesFromBT.java`

**Problem Statement:**  
Remove all leaf nodes from a binary tree.

**Description:**  
- Postorder traversal (process children first)
- If node is leaf, return null to remove it
- Update parent's references

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
Level order display of modified tree

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 15. Size, Sum, Max, Height of Tree

**File:** `SizeSumMaxHeightOfTree.java`

**Problem Statement:**  
Calculate basic properties of a binary tree.

**Description:**  
- **Size:** Count total nodes
- **Sum:** Sum of all node values
- **Max:** Maximum value in tree
- **Height:** Maximum depth (edges from root to deepest leaf)

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**
```
size
sum
max
height
```

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 16. Tilt of Binary Tree

**File:** `TiltOfBinaryTree.java`

**Problem Statement:**  
Calculate the tilt of a binary tree.

**Description:**  
- Tilt of a node = |left_subtree_sum - right_subtree_sum|
- Total tilt = sum of tilts of all nodes
- Use postorder traversal to calculate subtree sums

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
Total tilt value

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 17. Transform to Left Cloned

**File:** `TransformToLeftCloned.java`

**Problem Statement:**  
Transform a binary tree into a left-cloned tree.

**Description:**  
- Create a clone of each node
- Insert clone as left child
- Original left subtree becomes left child of clone

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
Level order display of left-cloned tree

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

## Common Structure

All files share common classes:

```java
public static class Node {
    int data;
    Node left;
    Node right;
    
    Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
}

public static class Pair {
    Node node;
    int state;
    
    Pair(Node node, int state) {
        this.node = node;
        this.state = state;
    }
}
```

---

## How to Run

1. **Compile:**
   ```bash
   javac FileName.java
   ```

2. **Run:**
   ```bash
   java FileName
   ```

3. **Provide Input:**
   - Enter number of nodes
   - Enter level order traversal (use 'n' for null)
   - Enter additional parameters as needed

**Example:**
```bash
javac DiameterOfBinaryTree.java
java DiameterOfBinaryTree
```

**Sample Input:**
```
7
50 25 75 12 37 62 87
```

---

## 📚 Related Topics

- [BinarySearchTree](../BinarySearchTree/) - Binary search tree operations
- [GenericTrees](../GenericTrees/) - General tree structures
- [Recursion Basics](../recursion-basics/) - Fundamental recursion concepts

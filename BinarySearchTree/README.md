# Binary Search Tree (BST) Problems

This directory contains implementations of various Binary Search Tree (BST) operations and algorithms in Java.

## 📋 Table of Contents

- [Overview](#overview)
- [Problems](#problems)
  - [1. Add Node in BST](#1-add-node-in-bst)
  - [2. Construct and Display BST](#2-construct-and-display-bst)
  - [3. LCA of BST](#3-lca-of-bst)
  - [4. Print in Range](#4-print-in-range)
  - [5. Size, Sum, Min, Max of BST](#5-size-sum-min-max-of-bst)
  - [6. Print Target Sum Pair](#6-print-target-sum-pair)
  - [7. Remove Node from BST](#7-remove-node-from-bst)
  - [8. Replace with Sum of Larger](#8-replace-with-sum-of-larger)
- [Common Structure](#common-structure)
- [How to Run](#how-to-run)

---

## Overview

All problems in this directory work with Binary Search Trees (BSTs). A BST is a binary tree where:
- The left subtree of a node contains only nodes with values less than the node's value
- The right subtree of a node contains only nodes with values greater than the node's value
- Both left and right subtrees must also be binary search trees

**Time Complexity Reference:**
- Search: O(log n) average, O(n) worst case
- Insert: O(log n) average, O(n) worst case
- Delete: O(log n) average, O(n) worst case

---

## Problems

### 1. Add Node in BST

**File:** `AddNodeInBST.java`

**Problem Statement:**  
Given a BST and a value, insert the value into the BST while maintaining the BST property.

**Description:**  
- Recursively traverse the tree to find the correct position for the new node
- If the current node is null, create a new node with the given data
- If the data is less than current node's data, go to the left subtree
- If the data is greater than current node's data, go to the right subtree

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
data (value to insert)
```

**Output Format:**  
Level order display of the BST after insertion

**Time Complexity:** O(h) where h is the height of the tree  
**Space Complexity:** O(h) for recursion stack

---

### 2. Construct and Display BST

**File:** `ConstructAndDisplayBST.java`

**Problem Statement:**  
Construct a balanced BST from a sorted array and display it.

**Description:**  
- Uses the middle element of the sorted array as the root
- Recursively constructs left subtree from left half
- Recursively constructs right subtree from right half
- This ensures the BST is height-balanced

**Input:**  
Hardcoded sorted array: `[12, 25, 37, 39, 50, 62, 75, 87]`

**Output Format:**  
Tree structure showing each node with its left and right children

**Time Complexity:** O(n) where n is the number of elements  
**Space Complexity:** O(h) for recursion stack

---

### 3. LCA of BST (Lowest Common Ancestor)

**File:** `LcaOfBST.java`

**Problem Statement:**  
Find the Lowest Common Ancestor (LCA) of two nodes in a BST.

**Description:**  
- If both values are less than current node, LCA is in left subtree
- If both values are greater than current node, LCA is in right subtree
- Otherwise, current node is the LCA (one value is on each side, or one value equals current node)

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
d1 (first value)
d2 (second value)
```

**Output Format:**  
The value of the LCA node

**Time Complexity:** O(h) where h is the height of the tree  
**Space Complexity:** O(h) for recursion stack

---

### 4. Print in Range

**File:** `PrintInRange.java`

**Problem Statement:**  
Print all nodes in a BST whose values lie within a given range [d1, d2].

**Description:**  
- If current node's value is greater than both range bounds, only check left subtree
- If current node's value is less than both range bounds, only check right subtree
- Otherwise, traverse both subtrees and print the current node if it's in range
- Output is printed in ascending order (inorder traversal)

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
d1 (lower bound)
d2 (upper bound)
```

**Output Format:**  
Values in the range, one per line, in ascending order

**Time Complexity:** O(n) in worst case  
**Space Complexity:** O(h) for recursion stack

---

### 5. Size, Sum, Min, Max of BST

**File:** `SizeSumMinMaxOfBST.java`

**Problem Statement:**  
Calculate various properties of a BST: size, sum, minimum, maximum, and search for a value.

**Description:**  
- **Size:** Count total number of nodes (recursive)
- **Sum:** Calculate sum of all node values (recursive)
- **Min:** Find minimum value (leftmost node)
- **Max:** Find maximum value (rightmost node)
- **Find:** Search for a specific value in the BST

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
data (value to search)
```

**Output Format:**
```
size
sum
max
min
found (true/false)
```

**Time Complexity:**
- Size/Sum: O(n)
- Min/Max: O(h)
- Find: O(h)

**Space Complexity:** O(h) for recursion stack

---

### 6. Print Target Sum Pair

**File:** `PrintTargetSumPair.java`

**Problem Statement:**  
Find and print all pairs of nodes in a BST whose sum equals a given target value.

**Description:**  
Three approaches are implemented:

**Method 1:** For each node, check if (target - node.data) exists in the BST
- Time: O(n log n), Space: O(1)

**Method 2:** Store inorder traversal in ArrayList, use two-pointer technique
- Time: O(n), Space: O(n)

**Method 3:** Use two iterators (normal and reverse inorder) simultaneously
- Time: O(n), Space: O(h) ⭐ **Best approach**

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
target (target sum)
```

**Output Format:**  
Pairs that sum to target, one pair per line (smaller value first)

**Time Complexity:** O(n)  
**Space Complexity:** O(h)

---

### 7. Remove Node from BST

**File:** `RemoveNodeFromBST.java`

**Problem Statement:**  
Delete a node with a given value from the BST while maintaining BST property.

**Description:**  
Three cases when deleting a node:
1. **Leaf node:** Simply remove it
2. **One child:** Replace node with its child
3. **Two children:** Replace node's value with its inorder predecessor (max of left subtree), then delete the predecessor

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
data (value to remove)
```

**Output Format:**  
Level order display of the BST after deletion

**Time Complexity:** O(h) where h is the height of the tree  
**Space Complexity:** O(h) for recursion stack

---

### 8. Replace with Sum of Larger

**File:** `ReplaceWithSumOfLarger.java`

**Problem Statement:**  
Replace each node's value with the sum of all nodes greater than it in the BST.

**Description:**  
- Perform reverse inorder traversal (right → root → left)
- Maintain a running sum of all visited nodes
- Replace current node's value with the running sum before adding current node's original value

**Example:**  
For BST with values [1, 2, 3, 4, 5]:
- 5 becomes 0 (no larger values)
- 4 becomes 5
- 3 becomes 9 (5+4)
- 2 becomes 12 (5+4+3)
- 1 becomes 14 (5+4+3+2)

**Input Format:**
```
n (number of nodes)
arr (level order traversal with 'n' for null)
```

**Output Format:**  
Level order display of the modified BST

**Time Complexity:** O(n)  
**Space Complexity:** O(h) for recursion stack

---

## Common Structure

All files share a common `Node` class structure:

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
```

Most files also include:
- `construct()` method to build tree from level order array
- `display()` method to visualize the tree structure

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
   - Enter the number of nodes
   - Enter level order traversal (use 'n' for null nodes)
   - Enter additional parameters as specified in each problem

**Example:**
```bash
javac AddNodeInBST.java
java AddNodeInBST
```

**Sample Input:**
```
7
50 25 75 12 37 62 87
30
```

---

## 📚 Related Topics

- [BinaryTree](../BinaryTree/) - General binary tree operations
- [Recursion Basics](../recursion-basics/) - Fundamental recursion concepts
- [Graph](../graph/) - Graph algorithms

# Generic Trees

This directory contains implementations of various algorithms and operations on **Generic Trees** (also known as N-ary trees), where each node can have any number of children.

## Table of Contents

| # | Problem | Description | Time Complexity | Space Complexity |
|---|---------|-------------|-----------------|------------------|
| 1 | [AreMirroredInShape](#aremirroredinshape) | Check if two trees are mirror images of each other | O(n) | O(h) |
| 2 | [AreTwoTreeSimilarInShape](#aretwotreesimilarinshape) | Check if two trees have similar structure | O(n) | O(h) |
| 3 | [CeilAndFloorOfNode](#ceilandfloorofnode) | Find ceil and floor values for a given key in tree | O(n) | O(h) |
| 4 | [DiameterOfTree](#diameteroftree) | Calculate the diameter (longest path) of the tree | O(n) | O(h) |
| 5 | [DistanceBetweenTwoNodes](#distancebetweentwonodes) | Find distance between two nodes in the tree | O(n) | O(h) |
| 6 | [FindingKthLargestElement](#findingkthlargestelement) | Find the Kth largest element in the tree | O(n log k) | O(k + h) |
| 7 | [GenericTreeTraversal](#generictreetraversal) | Pre-order and Post-order traversals | O(n) | O(h) |
| 8 | [HeightOfTree](#heightoftree) | Calculate the height of the tree | O(n) | O(h) |
| 9 | [IsTreeSymmetric](#istreesymmetric) | Check if the tree is symmetric | O(n) | O(h) |
| 10 | [IterableAndIteratorForeach](#iterableanditeratorforeach) | Custom iterator implementation for tree traversal | O(n) | O(n) |
| 11 | [IterativePreAndPostOrder](#iterativepreandpostorder) | Iterative pre-order and post-order traversal | O(n) | O(n) |
| 12 | [LevelOrderTraversal](#levelordertraversal) | Level order traversal using queue | O(n) | O(w) |
| 13 | [LevelOrderTraversalLinewise](#levelordertraversallinewise) | Level order traversal with line breaks | O(n) | O(w) |
| 14 | [LevelOrderZigZagTraversal](#levelorderzigzagtraversal) | Zig-zag level order traversal | O(n) | O(w) |
| 15 | [LinearizeTheGenericTree](#linearizethegenerictree) | Convert tree to linear form | O(n) | O(1) |
| 16 | [LowestCommonAncestor](#lowestcommonancestor) | Find LCA of two nodes | O(n) | O(h) |
| 17 | [MaxSumSubtree](#maxsumsubtree) | Find subtree with maximum sum | O(n) | O(h) |
| 18 | [MaxValueOfNode](#maxvalueofnode) | Find maximum value in the tree | O(n) | O(h) |
| 19 | [MirrorImageOfGivenTree](#mirrorimageofgiventree) | Create mirror image of the tree | O(n) | O(h) |
| 20 | [PathToRoot](#pathtoroot) | Find path from a node to root | O(h) | O(h) |
| 21 | [PredecessorAndSuccessor](#predecessorandsuccessor) | Find predecessor and successor of a node | O(n) | O(h) |
| 22 | [RemoveAllLeafNodes](#removeallleafnodes) | Remove all leaf nodes from the tree | O(n) | O(h) |
| 23 | [SizeofTree](#sizeofTree) | Calculate total number of nodes in the tree | O(n) | O(h) |

**Legend:** n = number of nodes, h = height of tree, w = maximum width of tree

---

## Problem Details

### AreMirroredInShape

**Problem Statement:**  
Check if two generic trees are mirror images of each other in shape.

**Description:**  
Two trees are mirrors if:
- They have the same number of children at each corresponding node
- The first child of tree1 is mirror of last child of tree2, second child of tree1 is mirror of second-last child of tree2, and so on

**Input Format:**
```
n1 (number of nodes in tree1)
arr1 (level order representation with -1 for null)
n2 (number of nodes in tree2)
arr2 (level order representation with -1 for null)
```

**Output Format:**  
`true` or `false`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### AreTwoTreeSimilarInShape

**Problem Statement:**  
Check if two generic trees have similar structure (same shape).

**Description:**  
Two trees are similar if:
- They have the same number of children at each corresponding node
- Each corresponding child subtree is also similar

**Input Format:**
```
n1 (number of nodes in tree1)
arr1 (level order representation)
n2 (number of nodes in tree2)
arr2 (level order representation)
```

**Output Format:**  
`true` or `false`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### CeilAndFloorOfNode

**Problem Statement:**  
Find the ceiling and floor values for a given key in a generic tree.

**Description:**  
- **Ceil:** Smallest value in tree that is greater than or equal to key
- **Floor:** Largest value in tree that is less than or equal to key

**Input Format:**
```
n (number of nodes)
arr (level order representation)
key (target value)
```

**Output Format:**  
```
Ceil: <value>
Floor: <value>
```

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### DiameterOfTree

**Problem Statement:**  
Calculate the diameter of a generic tree.

**Description:**  
Diameter is the length of the longest path between any two nodes in the tree. The path may or may not pass through the root.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
`<diameter_value>`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### DistanceBetweenTwoNodes

**Problem Statement:**  
Find the distance between two nodes in a generic tree.

**Description:**  
Distance is calculated as the number of edges in the path between two nodes. Uses Lowest Common Ancestor (LCA) approach.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
node1 (first node value)
node2 (second node value)
```

**Output Format:**  
`<distance_value>`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### FindingKthLargestElement

**Problem Statement:**  
Find the Kth largest element in a generic tree.

**Description:**  
Uses a min-heap of size k to efficiently track the k largest elements while traversing the tree.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
k (position of largest element to find)
```

**Output Format:**  
`<kth_largest_value>`

**Time Complexity:** O(n log k)  
**Space Complexity:** O(k + h) - heap + recursion stack

---

### GenericTreeTraversal

**Problem Statement:**  
Implement pre-order and post-order traversals of a generic tree.

**Description:**  
- **Pre-order:** Visit root, then recursively visit all children from left to right
- **Post-order:** Recursively visit all children from left to right, then visit root

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
```
Pre-order: <values>
Post-order: <values>
```

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### HeightOfTree

**Problem Statement:**  
Calculate the height of a generic tree.

**Description:**  
Height is the number of edges on the longest path from root to a leaf node.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
`<height_value>`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### IsTreeSymmetric

**Problem Statement:**  
Check if a generic tree is symmetric (mirror of itself).

**Description:**  
A tree is symmetric if its left subtree is a mirror reflection of its right subtree. For generic trees, we check if children from both ends are mirrors.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
`true` or `false`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### IterableAndIteratorForeach

**Problem Statement:**  
Implement custom Iterable and Iterator for generic tree traversal.

**Description:**  
Demonstrates the use of Java's Iterable and Iterator interfaces to enable foreach loop traversal of the tree. Implements level-order traversal.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
Tree nodes printed using foreach loop

**Time Complexity:** O(n)  
**Space Complexity:** O(n) - queue for level order

---

### IterativePreAndPostOrder

**Problem Statement:**  
Implement iterative pre-order and post-order traversal without recursion.

**Description:**  
Uses explicit stacks to simulate the recursive call stack for both traversals.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
```
Pre-order: <values>
Post-order: <values>
```

**Time Complexity:** O(n)  
**Space Complexity:** O(n) - explicit stacks

---

### LevelOrderTraversal

**Problem Statement:**  
Perform level order traversal of a generic tree.

**Description:**  
Uses a queue to traverse the tree level by level from left to right.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
`<level_order_values>`

**Time Complexity:** O(n)  
**Space Complexity:** O(w) - queue (w = maximum width)

---

### LevelOrderTraversalLinewise

**Problem Statement:**  
Perform level order traversal with line breaks between levels.

**Description:**  
Similar to level order traversal but prints each level on a separate line.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
```
<level_1_values>
<level_2_values>
...
```

**Time Complexity:** O(n)  
**Space Complexity:** O(w) - queue

---

### LevelOrderZigZagTraversal

**Problem Statement:**  
Perform zig-zag level order traversal.

**Description:**  
Traverse level by level, but alternate direction at each level (left-to-right, then right-to-left, etc.).

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
`<zigzag_level_order_values>`

**Time Complexity:** O(n)  
**Space Complexity:** O(w) - two stacks

---

### LinearizeTheGenericTree

**Problem Statement:**  
Convert a generic tree into a linear tree (each node has at most one child).

**Description:**  
Rearranges the tree such that it becomes a linked list-like structure while maintaining pre-order traversal sequence. Done in-place.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
Linearized tree printed in level order

**Time Complexity:** O(n)  
**Space Complexity:** O(1) - in-place modification

---

### LowestCommonAncestor

**Problem Statement:**  
Find the Lowest Common Ancestor (LCA) of two nodes in a generic tree.

**Description:**  
LCA is the deepest node that is an ancestor of both given nodes.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
node1 (first node value)
node2 (second node value)
```

**Output Format:**  
`<lca_value>`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### MaxSumSubtree

**Problem Statement:**  
Find the subtree with maximum sum in a generic tree.

**Description:**  
Calculates sum of each subtree and returns the maximum sum found.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
`<max_sum_value>`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### MaxValueOfNode

**Problem Statement:**  
Find the maximum value among all nodes in a generic tree.

**Description:**  
Traverses the entire tree to find the node with maximum value.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
`<max_value>`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### MirrorImageOfGivenTree

**Problem Statement:**  
Create a mirror image of a given generic tree.

**Description:**  
Reverses the order of children at each node to create the mirror image. Modifies the tree in-place.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
Mirrored tree printed in level order

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### PathToRoot

**Problem Statement:**  
Find the path from a given node to the root.

**Description:**  
Returns the list of nodes from the target node up to the root.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
target (node value to find path from)
```

**Output Format:**  
`<path_values_from_target_to_root>`

**Time Complexity:** O(h)  
**Space Complexity:** O(h) - recursion stack + result list

---

### PredecessorAndSuccessor

**Problem Statement:**  
Find the predecessor and successor of a given node in pre-order traversal.

**Description:**  
- **Predecessor:** Node visited immediately before the target in pre-order
- **Successor:** Node visited immediately after the target in pre-order

**Input Format:**
```
n (number of nodes)
arr (level order representation)
target (node value)
```

**Output Format:**  
```
Predecessor: <value>
Successor: <value>
```

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### RemoveAllLeafNodes

**Problem Statement:**  
Remove all leaf nodes from a generic tree.

**Description:**  
A leaf node is a node with no children. This operation removes all such nodes from the tree.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
Modified tree printed in level order

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

### SizeofTree

**Problem Statement:**  
Calculate the total number of nodes in a generic tree.

**Description:**  
Counts all nodes in the tree using recursive traversal.

**Input Format:**
```
n (number of nodes)
arr (level order representation)
```

**Output Format:**  
`<total_node_count>`

**Time Complexity:** O(n)  
**Space Complexity:** O(h) - recursion stack

---

## Common Input Format

All problems in this directory use a **level-order representation** with `-1` indicating the end of children for a node.

**Example:**
```
Input array: [10, 20, -1, 30, 40, -1, 50, -1, -1]

Tree structure:
        10
       /  \
      20   30
          /  \
         40   50
```

## Usage

Compile and run any problem:
```bash
javac GenericTrees/<ProblemName>.java
java -cp GenericTrees Main < input.txt
```

Or run directly with input redirection:
```bash
echo -e "7\n10 20 -1 30 40 -1 50 -1 -1" | java -cp GenericTrees <ProblemName>
```

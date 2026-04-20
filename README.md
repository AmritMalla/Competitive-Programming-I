# Competitive Programming & Data Structures Solutions

A comprehensive collection of **265+** Java implementations covering fundamental data structures, algorithms, and competitive programming problems.

## 📚 Table of Contents

- [Overview](#overview)
- [Directory Structure](#directory-structure)
- [Topics Covered](#topics-covered)
- [Getting Started](#getting-started)
- [How to Use](#how-to-use)
- [Contributing](#contributing)

## Overview

This repository contains solutions to various programming problems implemented in **Java**. Each directory focuses on a specific topic, from basic array operations to advanced dynamic programming and graph algorithms.

## Directory Structure

```
cp-code/
├── basics/                 # Fundamental concepts (arrays, strings, number theory)
├── Sorting/                # Sorting algorithms and related problems
├── LinkedList/             # Singly and doubly linked list operations
├── stack/                  # Stack implementations and applications
├── queue/                  # Queue implementations and variations
├── BinarySearchTree/       # BST operations and problems
├── BinaryTree/             # Binary tree traversals and algorithms
├── GenericTrees/           # N-ary tree operations
├── heap/                   # Heap data structure and applications
├── hashmap/                # Hash map implementations and problems
├── recursion-basics/       # Basic recursion and backtracking
├── recursion-one/          # Advanced recursion problems
├── dp/                     # Dynamic programming solutions
├── graph/                  # Graph algorithms and traversals
├── greedy/                 # Greedy algorithm solutions
└── star-pattern/           # Pattern printing programs
```

## Topics Covered

### 🔹 Basics (`basics/`)
- Array operations (reverse, subsets, bar charts)
- Number system conversions (any base to any base)
- String manipulation (palindromic substrings)
- Searching algorithms (first/last index, broken economy)

### 🔹 Sorting Algorithms (`Sorting/`)
- Bubble Sort, Insertion Sort, Selection Sort
- Merge Sort, Quick Sort
- Counting Sort, Radix Sort
- Partition algorithms and Quick Select

### 🔹 Linked Lists (`LinkedList/`)
- Basic operations (add, delete, display)
- Palindrome checking (iterative & recursive)
- Intersection point detection
- Folding and reversing operations

### 🔹 Stacks (`stack/`)
- Stack implementation (fixed & dynamic size)
- Balanced brackets validation
- Infix evaluation and conversion
- Min Stack, Celebrity Problem
- Interval merging, Largest histogram area

### 🔹 Queues (`queue/`)
- Queue implementation (static & dynamic)
- Stack from Queue (push/pop efficient variants)

### 🔹 Binary Search Trees (`BinarySearchTree/`)
- Node insertion and deletion
- LCA (Lowest Common Ancestor)
- Range queries
- Replace with sum of larger nodes

### 🔹 Binary Trees (`BinaryTree/`)
- Tree construction and traversal
- Level order traversal
- Diameter calculation
- Balanced tree check
- Path sum problems
- Left clone transformations
- K-distance nodes

### 🔹 Generic Trees (`GenericTrees/`)
- Tree traversals
- Height and diameter calculations
- Mirror and symmetry checks
- Distance between nodes
- Iterators and iterables

### 🔹 Heaps (`heap/`)
- Min/Max heap implementation
- Heap construction
- K largest elements
- Median finding
- Merge K sorted arrays
- Sort K-sorted arrays

### 🔹 Hash Maps (`hashmap/`)
- HashMap implementation
- Frequency counting
- Common elements problems
- Longest consecutive sequence

### 🔹 Recursion (`recursion-basics/`, `recursion-one/`)
- Factorial, Fibonacci
- Array operations (display, find, indices)
- Maze paths with jumps
- Subsequences and keypad combinations
- **Backtracking**: N-Queens, Knight's Tour, Flood Fill

### 🔹 Dynamic Programming (`dp/`)
- 0/1 Knapsack Problem
- Coin change (combination & permutation)
- Climbing stairs (with variable jumps)
- Buy and Sell Stock (I-VI)
- Binary strings without consecutive zeros
- Minimum path sums
- Longest increasing subsequence variants

### 🔹 Graphs (`graph/`)
- BFS and DFS traversals
- Connected components
- Path existence check
- Bipartite check
- Cycle detection
- Hamiltonian path and cycle
- Knight's Tour on graph
- Minimum Spanning Tree (Prim's Algorithm)

### 🔹 Greedy Algorithms (`greedy/`)
- Fractional Knapsack
- Maximum non-adjacent sum
- Minimum cost painting problems

### 🔹 Star Patterns (`star-pattern/`)
- Various pattern printing exercises (20+ patterns)

## Getting Started

### Prerequisites
- **Java Development Kit (JDK)** 8 or higher
- Any text editor or IDE (IntelliJ IDEA, Eclipse, VS Code)

### Compilation & Execution

```bash
# Navigate to a specific directory
cd basics

# Compile a Java file
javac ArrayReverse.java

# Run the compiled program
java ArrayReverse
```

### Example

```bash
# Running a sorting algorithm
cd Sorting
javac MergeSort.java
java MergeSort
```

## How to Use

Each Java file is self-contained and includes:
- Input reading from standard input (Scanner/BufferedReader)
- Problem solution implementation
- Output to standard console

Most programs expect input in a specific format. Check individual files for input requirements.

### Sample Input Format
Many files follow this pattern:
```java
Scanner input = new Scanner(System.in);
int n = input.nextInt();  // Size of array/number of elements
// ... process input
```

## Contributing

Contributions are welcome! Feel free to:
1. Add new problem solutions
2. Improve existing implementations
3. Add better documentation or comments
4. Report issues or suggest improvements

## License

This repository is open source and available for educational purposes.

---

**Happy Coding!** 🚀

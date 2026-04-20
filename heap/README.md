# Heap (Priority Queue) Problems

This directory contains implementations of various **Heap** and **Priority Queue** problems in Java.

## 📋 Table of Contents

- [Overview](#overview)
- [Problem List](#problem-list)
- [Getting Started](#getting-started)
- [Usage](#usage)

---

## Overview

A **Heap** is a specialized tree-based data structure that satisfies the heap property:
- **Max Heap**: Parent node ≥ children nodes (root is maximum)
- **Min Heap**: Parent node ≤ children nodes (root is minimum)

Heaps are commonly used to implement Priority Queues and are essential for many algorithms including Dijkstra's shortest path, Prim's MST, and heap sort.

**Key Properties:**
- Complete binary tree (all levels filled except possibly last)
- Array representation: parent(i) = (i-1)/2, left(i) = 2i+1, right(i) = 2i+2
- Insert/Delete: O(log n)
- Get min/max: O(1)

---

## 📁 Problem List

### Heap Implementation

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 1 | `WriteAHeap.java` | Basic heap implementation with insert and remove operations | O(log n) | O(n) |
| 2 | `HeapDemo.java` | Demonstration of heap operations and properties | O(log n) | O(n) |
| 3 | `ComparableAndComparatorWithHeap.java` | Custom comparators for different heap ordering | O(log n) | O(n) |

### Heap Construction & Operations

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 4 | `EfficientHeapConstruction.java` | Build heap from array in O(n) time using heapify | O(n) | O(1) |
| 5 | `KLargestElement.java` | Find k largest elements using min-heap | O(n log k) | O(k) |

### Advanced Heap Applications

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 6 | `MedianOfAnArray.java` | Find running median using two heaps (max-heap + min-heap) | O(n log n) | O(n) |
| 7 | `MergeKSortedArrays.java` | Merge k sorted arrays using min-heap | O(nk log k) | O(k) |
| 8 | `SortKSortedArray.java` | Sort nearly sorted array where elements are at most k positions away | O(n log k) | O(k) |

**Legend:**
- n = total number of elements
- k = parameter (number of arrays, distance, etc.)

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Compilation
```bash
cd heap
javac *.java
```

### Running a Specific Problem
```bash
java WriteAHeap
```

---

## 💡 Usage

### Example - WriteAHeap
```
Input:
Insert: 50, 30, 40, 10, 20
Remove min/max

Output:
Heap after inserts: [10, 20, 40, 50, 30]
Removed: 10
Heap after removal: [20, 30, 40, 50]
```

### Example - KLargestElement
```
Input:
Array: [3, 10, 1000, -99, 4, 100]
k = 3

Output:
[100, 1000, 100] (or sorted: [100, 100, 1000])
```

### Example - MedianOfAnArray
```
Input:
Stream: [5, 15, 1, 3, 10, 8]

Output:
Running medians:
5 → 5.0
5,15 → 10.0
5,15,1 → 5.0
5,15,1,3 → 4.0
5,15,1,3,10 → 5.0
5,15,1,3,10,8 → 6.5
```

### Example - MergeKSortedArrays
```
Input:
Arrays: 
[1, 3, 5]
[2, 4, 6]
[0, 7, 8]

Output:
Merged: [0, 1, 2, 3, 4, 5, 6, 7, 8]
```

---

## 📊 Algorithm Details

### 1. Basic Heap Operations
**Insert (Up Heapify):**
1. Add element at end
2. Compare with parent, swap if needed
3. Continue until heap property satisfied

**Remove (Down Heapify):**
1. Replace root with last element
2. Compare with children, swap with smaller/larger
3. Continue until heap property satisfied

### 2. Efficient Heap Construction
**Heapify Approach:**
- Start from last non-leaf node: (n/2) - 1
- Apply down heapify on each node moving upward
- **Time: O(n)** not O(n log n)!

### 3. K Largest Elements
**Min-Heap Strategy:**
1. Create min-heap of size k
2. For each element:
   - If heap < k: insert
   - Else if element > heap.min: remove min, insert element
3. Result: k largest in heap

### 4. Running Median
**Two-Heap Approach:**
- **Max-Heap**: Stores smaller half of numbers
- **Min-Heap**: Stores larger half of numbers
- Balance heaps so size difference ≤ 1
- Median = average of roots (if equal size) or root of larger heap

### 5. Merge K Sorted Arrays
**Min-Heap Strategy:**
1. Add first element of each array to min-heap
2. Extract minimum, add to result
3. Insert next element from same array
4. Repeat until all elements processed

### 6. Sort K-Sorted Array
**Sliding Window Heap:**
1. Create min-heap of first k+1 elements
2. Extract min, place at beginning
3. Add next element from array
4. Continue until array exhausted
5. Empty remaining heap elements

---

## 🔗 Related Topics

- [Sorting](../Sorting/) - Heap sort and comparison
- [Graph](../graph/) - Dijkstra's and Prim's use heaps
- [Queue](../queue/) - Priority queue applications

---

## 📝 Notes

- Java's `PriorityQueue` is a min-heap by default
- Use `Collections.reverseOrder()` for max-heap
- Heap is optimal for dynamic min/max queries
- Building heap from array is O(n), not O(n log n)
- For k-way merge, heap gives O(n log k) vs O(nk) naive approach
- Space complexity typically O(k) for k-related problems

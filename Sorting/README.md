# Sorting Algorithms & Problems

This directory contains implementations of various sorting algorithms and related array manipulation problems in Java.

## 📋 Problem List

### Basic Sorting Algorithms

| File | Algorithm | Description | Time Complexity | Space Complexity |
|------|-----------|-------------|-----------------|------------------|
| `BubbleSort.java` | Bubble Sort | Repeatedly swaps adjacent elements if they are in wrong order | O(n²) | O(1) |
| `SelectionSort.java` | Selection Sort | Selects minimum element and places it at beginning | O(n²) | O(1) |
| `InsertionSort.java` | Insertion Sort | Builds sorted array by inserting elements one by one | O(n²) | O(1) |
| `MergeSort.java` | Merge Sort | Divide and conquer algorithm that merges sorted subarrays | O(n log n) | O(n) |
| `QuickSort.java` | Quick Sort | Divide and conquer using pivot-based partitioning | O(n log n) avg, O(n²) worst | O(log n) |
| `CountingSort.java` | Counting Sort | Non-comparison sort using frequency counting | O(n + k) | O(k) |
| `RadixSort.java` | Radix Sort | Sorts numbers digit by digit from least significant | O(d·n) | O(n + k) |

### Array Manipulation Problems

| File | Problem | Description | Time Complexity | Space Complexity |
|------|---------|-------------|-----------------|------------------|
| `MergeTwoSortedArrays.java` | Merge Two Sorted Arrays | Merges two sorted arrays into one sorted array | O(n + m) | O(n + m) |
| `PartitionAnArray.java` | Partition Array | Partitions array around a pivot (QuickSort partition) | O(n) | O(1) |
| `Sort01.java` | Sort 0s and 1s | Segregates 0s and 1s in an array | O(n) | O(1) |
| `Sort012.java` | Sort 0s, 1s, and 2s | Dutch National Flag problem - sorts three values | O(n) | O(1) |
| `FindMinOnSortedRotatedArray.java` | Find Minimum in Rotated Sorted Array | Finds minimum element in rotated sorted array using binary search | O(log n) | O(1) |
| `QuickSelect.java` | Quick Select | Finds kth smallest element using quickselect algorithm | O(n) avg, O(n²) worst | O(1) |
| `TargetSum.java` | Target Sum | Checks if any two elements sum to target value | O(n²) | O(1) |

### Advanced Sorting Problems

| File | Problem | Description | Time Complexity | Space Complexity |
|------|---------|-------------|-----------------|------------------|
| `SortTheDates.java` | Sort Dates | Sorts array of dates by year, month, day | O(n log n) | O(1) |

---

## 🔍 Detailed Problem Descriptions

### BubbleSort.java
**Problem Statement:** Sort an array using bubble sort algorithm with visualization of comparisons and swaps.

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements

**Output Format:**
- Prints comparison and swap operations
- Final sorted array (one element per line)

**Algorithm:**
- Compare adjacent elements and swap if in wrong order
- After each pass, largest element bubbles to the end
- Continue until no more swaps needed

---

### SelectionSort.java
**Problem Statement:** Sort an array using selection sort algorithm.

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements

**Output Format:**
- Prints swap operations
- Final sorted array

**Algorithm:**
- Find minimum element in unsorted portion
- Swap with first unsorted element
- Repeat for remaining unsorted portion

---

### InsertionSort.java
**Problem Statement:** Sort an array using insertion sort algorithm.

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements

**Output Format:**
- Prints comparison and swap operations
- Final sorted array

**Algorithm:**
- Build sorted portion from left to right
- Insert each element into correct position in sorted portion
- Shift elements as needed

---

### MergeSort.java
**Problem Statement:** Sort an array using merge sort algorithm.

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements

**Output Format:**
- Sorted array

**Algorithm:**
- Divide array into two halves
- Recursively sort both halves
- Merge the sorted halves

---

### QuickSort.java
**Problem Statement:** Sort an array using quick sort algorithm.

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements

**Output Format:**
- Prints partition operations
- Final sorted array

**Algorithm:**
- Choose pivot element
- Partition array around pivot
- Recursively sort subarrays

---

### CountingSort.java
**Problem Statement:** Sort an array using counting sort (non-comparison based).

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements (integers within a range)

**Output Format:**
- Sorted array

**Algorithm:**
- Count frequency of each element
- Compute cumulative frequencies
- Place elements in correct positions

---

### RadixSort.java
**Problem Statement:** Sort an array using radix sort algorithm.

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements (non-negative integers)

**Output Format:**
- Sorted array

**Algorithm:**
- Sort by each digit from least to most significant
- Use stable counting sort for each digit position

---

### MergeTwoSortedArrays.java
**Problem Statement:** Merge two sorted arrays into a single sorted array.

**Input Format:**
- Size and elements of first sorted array
- Size and elements of second sorted array

**Output Format:**
- Merged sorted array

**Algorithm:**
- Use two pointers approach
- Compare elements from both arrays
- Add smaller element to result

---

### PartitionAnArray.java
**Problem Statement:** Partition an array around a pivot element.

**Input Format:**
- Array size and elements
- Pivot index or value

**Output Format:**
- Partitioned array with elements less than pivot on left

**Algorithm:**
- Choose pivot (typically last element)
- Move smaller elements to left
- Return pivot's final position

---

### Sort01.java
**Problem Statement:** Sort an array containing only 0s and 1s.

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements (0 or 1)

**Output Format:**
- Sorted array with all 0s followed by all 1s

**Algorithm:**
- Two-pointer approach or counting method
- Single pass through array

---

### Sort012.java
**Problem Statement:** Sort an array containing only 0s, 1s, and 2s (Dutch National Flag problem).

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements (0, 1, or 2)

**Output Format:**
- Sorted array with 0s, then 1s, then 2s

**Algorithm:**
- Three-pointer approach (low, mid, high)
- Single pass through array
- Swap elements to appropriate sections

---

### FindMinOnSortedRotatedArray.java
**Problem Statement:** Find the minimum element in a sorted and rotated array.

**Input Format:**
- First line: `n` (size of array)
- Next `n` lines: array elements (sorted then rotated)

**Output Format:**
- Minimum element

**Algorithm:**
- Binary search approach
- Compare mid with high to determine which half contains minimum
- O(log n) time complexity

---

### QuickSelect.java
**Problem Statement:** Find the kth smallest element in an unsorted array.

**Input Format:**
- Array size and elements
- Value of k

**Output Format:**
- kth smallest element

**Algorithm:**
- Similar to quicksort partitioning
- Only recurse into the partition containing kth element
- Average O(n) time complexity

---

### TargetSum.java
**Problem Statement:** Check if any two elements in array sum to a target value.

**Input Format:**
- Array size and elements
- Target sum value

**Output Format:**
- Boolean result or pair of indices

**Algorithm:**
- Brute force: check all pairs
- Optimized: use hash set for O(n) solution

---

### SortTheDates.java
**Problem Statement:** Sort an array of dates chronologically.

**Input Format:**
- Number of dates
- Each date as day, month, year

**Output Format:**
- Sorted dates in chronological order

**Algorithm:**
- Custom comparator for dates
- Use built-in sort with comparator
- Compare year, then month, then day

---

## 💻 Usage Instructions

### Compilation
```bash
cd Sorting
javac *.java
```

### Running Individual Programs
```bash
# For Bubble Sort
java BubbleSort < input.txt

# For Quick Sort
java QuickSort < input.txt

# For Sort012
java Sort012 < input.txt
```

### Sample Input Format
Most programs expect:
```
5
3 1 4 1 5
```
Where first line is array size, followed by array elements.

---

## 📊 Complexity Comparison

| Algorithm | Best Case | Average Case | Worst Case | Stable | In-Place |
|-----------|-----------|--------------|------------|--------|----------|
| Bubble Sort | O(n) | O(n²) | O(n²) | Yes | Yes |
| Selection Sort | O(n²) | O(n²) | O(n²) | No | Yes |
| Insertion Sort | O(n) | O(n²) | O(n²) | Yes | Yes |
| Merge Sort | O(n log n) | O(n log n) | O(n log n) | Yes | No |
| Quick Sort | O(n log n) | O(n log n) | O(n²) | No | Yes |
| Counting Sort | O(n + k) | O(n + k) | O(n + k) | Yes | No |
| Radix Sort | O(d·n) | O(d·n) | O(d·n) | Yes | No |

---

## 🎯 Learning Objectives

After studying these implementations, you should understand:
1. How different sorting algorithms work
2. Time and space complexity trade-offs
3. When to use each sorting algorithm
4. Partitioning techniques
5. Two-pointer and multi-pointer approaches
6. Divide and conquer paradigm
7. Non-comparison based sorting

---

## 🔗 Related Topics
- [Arrays](../basics/README.md)
- [Binary Search](../binarySearch/README.md)
- [Divide and Conquer](../divideAndConquer/README.md)
- [Dynamic Programming](../dp/README.md)

# HashMap Problems

This directory contains implementations of various **HashMap** and hashing-based problems in Java.

## 📋 Table of Contents

- [Overview](#overview)
- [Problem List](#problem-list)
- [Getting Started](#getting-started)
- [Usage](#usage)

---

## Overview

A **HashMap** is a data structure that stores key-value pairs and provides average O(1) time complexity for insert, delete, and search operations. This directory covers both custom HashMap implementations and practical applications of hashing.

**Key Concepts:**
- **Hash Function**: Maps keys to array indices
- **Collision Resolution**: Handling multiple keys mapping to same index
- **Load Factor**: Ratio of entries to capacity (triggers rehashing)
- **Chaining**: Using linked lists at each bucket

---

## 📁 Problem List

### HashMap Implementation

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 1 | `ImplementHashMap.java` | Complete HashMap implementation with put, get, remove operations | O(1) avg | O(n) |

### Array Problems Using HashMap

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 2 | `FindCommonElementsII.java` | Find intersection of two arrays (with duplicates) | O(n + m) | O(min(n,m)) |
| 3 | `GetCommonElements.java` | Find common elements between two arrays | O(n + m) | O(min(n,m)) |
| 4 | `LongestConsecutiveSequenceOfElements.java` | Find length of longest consecutive sequence | O(n) | O(n) |

### String Problems Using HashMap

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 5 | `FindHighestFreqChar.java` | Find character with highest frequency in string | O(n) | O(1) |

**Legend:**
- n, m = sizes of input arrays/strings
- Space complexity assumes alphabet size is constant for character problems

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Compilation
```bash
cd hashmap
javac *.java
```

### Running a Specific Problem
```bash
java ImplementHashMap
```

---

## 💡 Usage

### Example - ImplementHashMap
```
Input:
put("A", 1)
put("B", 2)
put("C", 3)
get("B")
remove("B")
get("B")

Output:
2
null
```

### Example - FindCommonElementsII
```
Input:
Array1: [1, 2, 2, 1]
Array2: [2, 2]

Output:
[2, 2]
```

### Example - LongestConsecutiveSequence
```
Input:
Array: [100, 4, 200, 1, 3, 2]

Output:
Length: 4 (sequence: 1, 2, 3, 4)
```

### Example - FindHighestFreqChar
```
Input:
String: "aabbbccddddd"

Output:
Character: d
Frequency: 5
```

---

## 📊 Algorithm Details

### 1. Implement HashMap
**Features:**
- Custom hash function using hashCode()
- Collision handling with chaining (LinkedList at each bucket)
- Dynamic resizing when load factor exceeds threshold
- Operations: put, get, remove, containsKey, size

**Implementation Details:**
```java
// Node structure
class Node {
    K key;
    V value;
    Node next;
}

// Hash function
index = Math.abs(key.hashCode()) % bucketCount
```

### 2. Find Common Elements
**Approach:**
1. Store elements of smaller array in HashMap with frequencies
2. Iterate through larger array, check presence in HashMap
3. Decrement count when match found

### 3. Longest Consecutive Sequence
**Optimized Approach:**
1. Add all elements to HashSet
2. For each element, check if it's start of sequence (element-1 not in set)
3. If start, count consecutive elements forward
4. Track maximum length

**Why O(n)?** Each element visited at most twice

### 4. Find Highest Frequency Character
**Approach:**
1. Use HashMap or array (for ASCII) to count frequencies
2. Track maximum while counting
3. Return character with highest frequency

---

## 🔗 Related Topics

- [Heap](../heap/) - Alternative for finding top-k frequent elements
- [Sorting](../Sorting/) - Comparison-based approaches
- [String Algorithms](../basics/) - String processing fundamentals

---

## 📝 Notes

- HashMap provides average O(1) operations but worst case O(n)
- Load factor typically 0.75 for good performance
- Custom HashMap uses separate chaining for collision resolution
- For consecutive sequence problem, sorting would give O(n log n) solution
- HashSet is sufficient when only presence/absence matters (no frequencies needed)

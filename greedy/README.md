# Greedy Algorithms Problems

This directory contains implementations of various **Greedy Algorithm** problems in Java.

## 📋 Table of Contents

- [Overview](#overview)
- [Problem List](#problem-list)
- [Getting Started](#getting-started)
- [Usage](#usage)

---

## Overview

**Greedy algorithms** build up a solution piece by piece, always choosing the next piece that offers the most immediate benefit. While not optimal for all problems, greedy approaches work perfectly for problems with:
- **Greedy Choice Property**: Local optimum leads to global optimum
- **Optimal Substructure**: Optimal solution contains optimal solutions to subproblems

---

## 📁 Problem List

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 1 | `FractionalKnapSack.java` | Solve fractional knapsack problem (can take fractions of items) | O(n log n) | O(1) |
| 2 | `MaximumOfNonAdjacent.java` | Find maximum sum of non-adjacent elements | O(n) | O(1) |
| 3 | `MinCostToPaintTheHouse.java` | Paint houses with minimum cost (no two adjacent same color) | O(n) | O(1) |
| 4 | `MinimumCostOfPaintingKColorsOnHouse.java` | Paint houses with k colors, minimize cost with adjacency constraint | O(n × k) | O(1) |

**Legend:**
- n = number of items/houses
- k = number of colors

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Compilation
```bash
cd greedy
javac *.java
```

### Running a Specific Problem
```bash
java FractionalKnapSack
```

---

## 💡 Usage

### Example - FractionalKnapSack
```
Input:
Values: [60, 100, 120]
Weights: [10, 20, 30]
Capacity: 50

Output:
Maximum value: 240.0
```

### Example - MaximumOfNonAdjacent
```
Input:
Array: [5, 10, 10, 100, 5, 6]

Output:
Maximum sum: 116
```

### Example - MinCostToPaintTheHouse
```
Input:
Costs matrix (n x 3):
[[17, 2, 17],
 [16, 16, 5],
 [14, 3, 19]]

Output:
Minimum cost: 10
```

---

## 📊 Algorithm Details

### 1. Fractional Knapsack
**Greedy Strategy:** Pick items with highest value/weight ratio first
**Steps:**
1. Calculate value/weight ratio for each item
2. Sort by ratio in descending order
3. Take whole items while capacity allows
4. Take fraction of last item if needed

### 2. Maximum of Non-Adjacent Elements
**Approach:** Dynamic Programming with greedy choice
**Recurrence:**
- `incl = excl_prev + current`
- `excl = max(incl_prev, excl_prev)`
- Result: `max(incl, excl)`

### 3. Minimum Cost to Paint Houses
**Strategy:** For each house, pick minimum cost color different from previous
**Optimization:** Track two minimum costs to avoid O(k) search

### 4. Minimum Cost with K Colors
**Generalization:** Extend 3-color solution to k colors
**Optimization:** 
- Track smallest and second smallest costs
- If current picks same color as previous minimum, use second minimum

---

## 🔗 Related Topics

- [Dynamic Programming](../dp/) - Some greedy problems have DP solutions
- [Sorting](../Sorting/) - Used in fractional knapsack
- [Recursion Basics](../recursion-basics/) - Alternative recursive approaches

---

## 📝 Notes

- Greedy algorithms are efficient but don't work for all optimization problems
- Always verify greedy choice property before applying
- Time complexity often dominated by sorting step
- Space complexity is typically O(1) auxiliary space

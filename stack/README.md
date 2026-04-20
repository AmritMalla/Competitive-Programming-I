# Stack Problems

This directory contains comprehensive implementations of various **Stack** data structure problems and applications in Java.

## 📋 Table of Contents

- [Overview](#overview)
- [Problem List](#problem-list)
- [Getting Started](#getting-started)
- [Usage](#usage)

---

## Overview

A **Stack** is a linear data structure that follows the **LIFO (Last In First Out)** principle. Elements are added and removed from the same end called the "top". Stacks are fundamental to many algorithms including expression evaluation, backtracking, and monotonic patterns.

**Key Operations:**
- `push()`: Add element to top - O(1)
- `pop()`: Remove element from top - O(1)
- `peek()`: View top element - O(1)
- `isEmpty()`: Check if stack is empty - O(1)

---

## 📁 Problem List

### Stack Implementation

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 1 | `DesignAStack.java` | Basic stack implementation with standard operations | O(1) | O(n) |
| 2 | `DynamicSizeStack.java` | Stack with automatic resizing capability | O(1)* | O(n) |
| 3 | `TwoStackInAnArray.java` | Implement two stacks in single array efficiently | O(1) | O(n) |

### Specialized Stacks

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 4 | `MinStack.java` | Stack supporting getMin() in O(1) using auxiliary stack | O(1) | O(n) |
| 5 | `MinStackConstantSpace.java` | Min stack with O(1) extra space using encoding trick | O(1) | O(1)* |

### Expression Processing

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 6 | `BalancedBrackets.java` | Check if brackets/parentheses are balanced | O(n) | O(n) |
| 7 | `CheckDuplicateBrackets.java` | Detect duplicate/redundant brackets in expression | O(n) | O(n) |
| 8 | `InfixEvaluation.java` | Evaluate infix arithmetic expressions | O(n) | O(n) |
| 9 | `InfixConversion.java` | Convert infix to prefix and postfix notations | O(n) | O(n) |
| 10 | `PostfixEvaluation.java` | Evaluate postfix (Reverse Polish) expressions | O(n) | O(n) |
| 11 | `PrefixEvaluation.java` | Evaluate prefix (Polish) expressions | O(n) | O(n) |

### Monotonic Stack Problems

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 12 | `NextGreaterElement.java` | Find next greater element for each array element | O(n) | O(n) |
| 13 | `StockSpan.java` | Calculate stock span (days until price drop) | O(n) | O(n) |
| 14 | `LargestHistogramArea.java` | Find largest rectangle in histogram | O(n) | O(n) |
| 15 | `SlidingWindowMaximum.java` | Find max in each sliding window of size k | O(n) | O(k) |

### Pattern & Sequence Problems

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 16 | `SmallestNumberFollowingPatternOfficial.java` | Generate smallest number from I/D pattern | O(n) | O(n) |
| 17 | `CelebrityProblem.java` | Find celebrity in group (knows no one, known by all) | O(n) | O(1) |
| 18 | `MergeInterval.java` | Merge overlapping intervals | O(n log n) | O(n) |

### Stack-Based Queue Implementation

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 19 | `QueueFromStackAddEfficient.java` | Implement queue using stacks (add O(1)) | O(1)* | O(n) |
| 20 | `QueueFromStackRemoveEfficient.java` | Implement queue using stacks (remove O(1)) | O(1)* | O(n) |

**Legend:**
- n = number of elements
- *Amortized time complexity
- Extra space for MinStackConstantSpace is O(1) but total is O(n) for stack itself

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Compilation
```bash
cd stack
javac *.java
```

### Running a Specific Problem
```bash
java DesignAStack
```

---

## 💡 Usage

### Example - BalancedBrackets
```
Input: "([{}])"
Output: true

Input: "([)]"
Output: false
```

### Example - NextGreaterElement
```
Input: [5, 3, 8, 4, 2, 7]
Output: [8, 8, -1, 7, 7, -1]
```

### Example - StockSpan
```
Input: [100, 80, 60, 70, 60, 75, 85]
Output: [1, 1, 1, 2, 1, 4, 6]
```

### Example - MinStack
```
Operations: push(3), push(5), getMin(), push(2), push(1), getMin(), pop(), getMin()
Output: 3, 1, 2
```

---

## 📊 Algorithm Details

### 1. Min Stack
**Approach 1 (Auxiliary Stack):**
- Maintain second stack tracking minimums
- Push to minStack when value ≤ current min
- Pop from minStack when popping minimum

**Approach 2 (Constant Space):**
- Store encoded values: 2*val - min
- Use mathematical properties to recover values

### 2. Balanced Brackets
**Algorithm:**
1. Push opening brackets to stack
2. For closing bracket, check if matches top
3. Stack should be empty at end

### 3. Infix Evaluation
**Two-Stack Approach:**
- Operand stack: stores numbers
- Operator stack: stores operators
- Process based on precedence

### 4. Next Greater Element
**Monotonic Stack:**
- Maintain decreasing stack
- When current > stack.top, found NGE for top
- Continue popping while condition met

### 5. Largest Histogram Area
**Algorithm:**
1. For each bar, find left and right boundaries
2. Boundaries are first smaller bars on each side
3. Area = height × (right - left - 1)
4. Use monotonic stack to find boundaries in O(n)

### 6. Sliding Window Maximum
**Deque Approach:**
- Maintain deque of indices
- Remove indices outside window
- Remove smaller elements from back
- Front always has maximum index

### 7. Celebrity Problem
**Stack Approach:**
1. Push all people to stack
2. Pop two, eliminate one based on knows() relation
3. Push potential celebrity back
4. Verify final candidate

---

## 🔗 Related Topics

- [Queue](../queue/) - Complementary data structure
- [Recursion Basics](../recursion-basics/) - Stack is implicit in recursion
- [BinaryTree](../BinaryTree/) - Stack used in iterative traversals

---

## 📝 Notes

- Stack is fundamental to function call mechanism
- Monotonic stacks solve many "next greater/smaller" problems efficiently
- Two-stack queue gives amortized O(1) operations
- Space complexity often O(n) for storing elements
- Many problems have alternative solutions using recursion (implicit stack)

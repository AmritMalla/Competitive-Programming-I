# Queue Problems

This directory contains implementations of **Queue** data structure and related problems in Java.

## 📋 Table of Contents

- [Overview](#overview)
- [Problem List](#problem-list)
- [Getting Started](#getting-started)
- [Usage](#usage)

---

## Overview

A **Queue** is a linear data structure that follows the **FIFO (First In First Out)** principle. Elements are added at the rear (enqueue) and removed from the front (dequeue). Queues are essential for BFS, scheduling, and buffering applications.

**Key Operations:**
- `add()/enqueue()`: Add element to rear - O(1)
- `remove()/dequeue()`: Remove element from front - O(1)
- `peek()`: View front element - O(1)
- `isEmpty()`: Check if queue is empty - O(1)

---

## 📁 Problem List

### Queue Implementation

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 1 | `Queue.java` | Basic queue implementation using array | O(1) | O(n) |
| 2 | `DynamicQueue.java` | Queue with automatic resizing capability | O(1)* | O(n) |

### Stack Using Queue

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 3 | `StackFromQueuePopEfficient.java` | Implement stack using queues (pop O(1)) | O(1)* | O(n) |
| 4 | `StackFromQueuePushEfficient.java` | Implement stack using queues (push O(1)) | O(1)* | O(n) |

**Legend:**
- n = number of elements
- *Amortized time complexity

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Compilation
```bash
cd queue
javac *.java
```

### Running a Specific Problem
```bash
java Queue
```

---

## 💡 Usage

### Example - Basic Queue
```
Operations: add(1), add(2), add(3), peek(), remove(), peek()
Output:
Front: 1
Removed: 1
New Front: 2
```

### Example - DynamicQueue
```
Operations: add multiple elements beyond initial capacity
Output:
Queue automatically resizes and maintains all elements
```

### Example - Stack From Queue (Pop Efficient)
```
Operations: push(10), push(20), push(30), pop(), pop()
Output:
Popped: 30
Popped: 20
```

### Example - Stack From Queue (Push Efficient)
```
Operations: push(5), push(15), push(25), pop()
Output:
Popped: 25
```

---

## 📊 Algorithm Details

### 1. Basic Queue Implementation
**Array-Based Approach:**
- Use circular array to avoid shifting
- Track front and rear indices
- Handle wraparound using modulo operator

```java
// Circular queue logic
rear = (rear + 1) % capacity
front = (front + 1) % capacity
```

### 2. Dynamic Queue
**Resizing Strategy:**
- Double capacity when full
- Create new array and copy elements
- Reset front to 0, rear to size-1

**Amortized Analysis:**
- Most operations: O(1)
- Resize operation: O(n) but rare
- Amortized cost: O(1)

### 3. Stack Using Queue (Pop Efficient)
**Strategy:**
- Maintain two queues
- For push: O(n) - rotate elements to maintain order
- For pop: O(1) - simply dequeue

**Push Operation:**
1. Enqueue to q2
2. Move all elements from q1 to q2
3. Swap q1 and q2 references

### 4. Stack Using Queue (Push Efficient)
**Strategy:**
- Maintain two queues
- For push: O(1) - simply enqueue
- For pop: O(n) - move n-1 elements first

**Pop Operation:**
1. Move n-1 elements from q1 to q2
2. Dequeue last element from q1
3. Swap q1 and q2 references

---

## 🔗 Related Topics

- [Stack](../stack/) - Complementary LIFO structure
- [Graph](../graph/) - BFS uses queue
- [Heap](../heap/) - Priority queue variations

---

## 📝 Notes

- Queue is fundamental to BFS and level-order traversal
- Circular queue optimizes space usage in fixed-size implementation
- Two-queue stack gives O(1) for one operation, O(n) for other
- Java's `LinkedList` implements `Queue` interface
- `ArrayDeque` is often preferred over `LinkedList` for queue operations
- Space complexity is O(n) for storing n elements
- Dynamic resizing ensures no overflow but adds occasional O(n) cost
# Linked List

This directory contains implementations of various algorithms and operations on **Singly Linked Lists**, a fundamental linear data structure where each node points to the next node in the sequence.

## Table of Contents

| # | Problem | Description | Time Complexity | Space Complexity |
|---|---------|-------------|-----------------|------------------|
| 1 | [AddAtGivenIndex](#addatgivenindex) | Insert a node at a specific index | O(n) | O(1) |
| 2 | [AddAtHead](#addathead) | Insert a node at the beginning | O(1) | O(1) |
| 3 | [AddLinkedListData](#addlinkedlistdata) | Add data to linked list with multiple operations | O(n) | O(1) |
| 4 | [AddNode](#addnode) | Basic node addition implementation | O(1) | O(1) |
| 5 | [CheckPalindromeRecursive](#checkpalindromerecursive) | Check if list is palindrome using recursion | O(n) | O(n) |
| 6 | [DisplayLinkedList](#displaylinkedlist) | Display all elements in the list | O(n) | O(1) |
| 7 | [DisplayReverseRecursive](#displayreverserecursive) | Display list in reverse using recursion | O(n) | O(n) |
| 8 | [FindIntersectionPoint](#findintersectionpoint) | Find intersection point of two lists | O(n+m) | O(1) |
| 9 | [FoldLinkedList](#foldlinkedlist) | Fold the linked list from both ends | O(n) | O(n) |
| 10 | [GetValueInLinkedList](#getvalueinlinkedlist) | Get value at specific position | O(n) | O(1) |
| 11 | [KthElementInLinkedList](#kthelementinlinkedlist) | Find Kth element from end | O(n) | O(1) |
| 12 | [LinkedListToStackAdapter](#linkedlisttostackadapter) | Implement stack using linked list | O(1) | O(1) |
| 13 | [MergeLinkedList](#mergelinkedlist) | Merge two sorted linked lists | O(n+m) | O(1) |
| 14 | [MergeSortOnLinkedList](#mergesortonlinkedlist) | Sort linked list using merge sort | O(n log n) | O(log n) |
| 15 | [MidOfLinkedList](#midoflinkedlist) | Find middle element of list | O(n) | O(1) |
| 16 | [OddEvenList](#oddevenlist) | Segregate odd and even positioned nodes | O(n) | O(1) |
| 17 | [RemoveAtIndex](#removeatindex) | Remove node at specific index | O(n) | O(1) |
| 18 | [RemoveDuplicatesFromSortedList](#removeduplicatesfromsortedlist) | Remove duplicates from sorted list | O(n) | O(1) |
| 19 | [RemoveFirst](#removefirst) | Remove first node | O(1) | O(1) |
| 20 | [RemoveLast](#removelast) | Remove last node | O(n) | O(1) |
| 21 | [ReverseEachKSegment](#reverseeachksegment) | Reverse list in groups of k | O(n) | O(1) |
| 22 | [ReverseLinkedList](#reverselinkedlist) | Reverse the entire list (iterative) | O(n) | O(1) |
| 23 | [ReverseLinkedListChangingPointer](#reverselinkedlistchangingpointer) | Reverse using pointer manipulation | O(n) | O(1) |
| 24 | [ReverseLinkedListRecursive](#reverselinkedlistrecursive) | Reverse list using recursion | O(n) | O(n) |

**Legend:** n = number of nodes, m = length of second list

---

## Problem Details

### AddAtGivenIndex

**Problem Statement:**  
Insert a new node with given value at a specified index in the linked list.

**Description:**  
- If index is 0, add at head
- If index equals size, add at tail
- Otherwise, traverse to position and insert node
- Handles edge cases: empty list, invalid index

**Input Format:**
```
Commands:
addLast <val> - Add at end
addFirst <val> - Add at beginning
addAt <idx> <val> - Add at index
display - Show list
```

**Output Format:**  
Modified linked list displayed element by element

**Time Complexity:** O(n) - traversal to index  
**Space Complexity:** O(1)

---

### AddAtHead

**Problem Statement:**  
Insert a new node at the beginning of the linked list.

**Description:**  
- Creates new node with given value
- New node's next points to current head
- Updates head to new node
- If list was empty, tail also points to new node

**Input Format:**
```
Commands:
addLast <val>
addFirst <val>
display
```

**Output Format:**  
Linked list with new element at head

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

### AddLinkedListData

**Problem Statement:**  
Comprehensive linked list implementation with multiple add operations.

**Description:**  
Implements:
- `addLast(val)` - Add at end
- `addFirst(val)` - Add at beginning  
- `addAt(idx, val)` - Add at specific index
- Size tracking and display functionality

**Input Format:**
```
Multiple commands for adding and displaying
```

**Output Format:**  
Modified linked list after operations

**Time Complexity:** O(n) for addAt, O(1) for addFirst/addLast  
**Space Complexity:** O(1)

---

### AddNode

**Problem Statement:**  
Basic implementation of adding nodes to a linked list.

**Description:**  
Demonstrates fundamental node creation and linking. Tests list integrity by displaying all nodes and verifying size.

**Input Format:**
```
addLast <val>
quit
```

**Output Format:**  
All node values printed followed by size

**Time Complexity:** O(1) per addition  
**Space Complexity:** O(1)

---

### CheckPalindromeRecursive

**Problem Statement:**  
Check if a linked list is a palindrome using recursion.

**Description:**  
Uses recursive approach to compare elements from outside-in:
- Recursively reach the end
- Compare with left pointer moving forward
- Use class-level variable to track left position

**Input Format:**
```
n (number of elements)
arr (space-separated values)
```

**Output Format:**  
`true` or `false`

**Time Complexity:** O(n)  
**Space Complexity:** O(n) - recursion stack

---

### DisplayLinkedList

**Problem Statement:**  
Display all elements in the linked list.

**Description:**  
Traverses from head to tail, printing each node's data. Also implements size operation.

**Input Format:**
```
Commands:
addLast <val>
display
size
quit
```

**Output Format:**  
Space-separated values followed by newline

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### DisplayReverseRecursive

**Problem Statement:**  
Display linked list elements in reverse order using recursion.

**Description:**  
- Recursively traverse to end of list
- Print during return phase (post-order)
- Demonstrates reverse traversal without modifying list

**Input Format:**
```
n (number of elements)
arr (space-separated values)
```

**Output Format:**  
Elements printed in reverse order

**Time Complexity:** O(n)  
**Space Complexity:** O(n) - recursion stack

---

### FindIntersectionPoint

**Problem Statement:**  
Find the intersection point of two singly linked lists.

**Description:**  
Two approaches possible:
1. Length difference method: Find lengths, align pointers, then move together
2. Two-pointer cycle detection: Connect one list's tail to its head, detect cycle

**Input Format:**
```
n1 (size of list1)
arr1 (values of list1)
n2 (size of list2)
arr2 (values of list2)
intersection_index
```

**Output Format:**  
Value at intersection point or indication of no intersection

**Time Complexity:** O(n + m)  
**Space Complexity:** O(1)

---

### FoldLinkedList

**Problem Statement:**  
Fold a linked list by interleaving nodes from start and end.

**Description:**  
Folding pattern: 1st, last, 2nd, 2nd-last, 3rd, 3rd-last...
Uses recursion to access nodes from end while maintaining left pointer from start.

**Input Format:**
```
n (number of elements)
arr (space-separated values)
a (value to add at front after fold)
b (value to add at back after fold)
```

**Output Format:**  
Original list, folded list, and final list after additions

**Time Complexity:** O(n)  
**Space Complexity:** O(n) - recursion stack

---

### GetValueInLinkedList

**Problem Statement:**  
Retrieve value at a specific index in linked list.

**Description:**  
Implements getAt(index) with proper bounds checking:
- Returns -1 for empty list
- Returns -1 for invalid indices
- Traverses to position and returns data

**Input Format:**
```
Commands:
addLast <val>
getAt <idx>
display
quit
```

**Output Format:**  
Value at specified index or error message

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### KthElementInLinkedList

**Problem Statement:**  
Find the Kth element from the end of the linked list.

**Description:**  
Two approaches:
1. Two-pass: Find length, then find (length-k)th node
2. Two-pointer: Move fast pointer k steps ahead, then move both together

**Input Format:**
```
Commands including getting kth from end
```

**Output Format:**  
Value of kth element from end

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### LinkedListToStackAdapter

**Problem Statement:**  
Implement a stack data structure using Java's built-in LinkedList.

**Description:**  
Adapter pattern demonstrating:
- `push(val)` - addFirst operation
- `pop()` - removeFirst operation
- `top()` - getFirst operation
- `size()` - size operation

**Input Format:**
```
Commands:
push <val>
pop
top
size
quit
```

**Output Format:**  
Popped/top values or size as requested

**Time Complexity:** O(1) for all operations  
**Space Complexity:** O(1)

---

### MergeLinkedList

**Problem Statement:**  
Merge two sorted linked lists into one sorted list.

**Description:**  
Iteratively compares heads of both lists:
- Takes smaller element and adds to result
- Advances pointer of chosen list
- Continues until both lists exhausted

**Input Format:**
```
Two sorted linked lists
```

**Output Format:**  
Merged sorted linked list

**Time Complexity:** O(n + m)  
**Space Complexity:** O(1) - rearranging pointers

---

### MergeSortOnLinkedList

**Problem Statement:**  
Sort a linked list using merge sort algorithm.

**Description:**  
Divide and conquer approach:
1. Find middle using slow-fast pointer technique
2. Recursively sort both halves
3. Merge two sorted halves

**Input Format:**
```
n (number of elements)
arr (unsorted values)
```

**Output Format:**  
Sorted linked list

**Time Complexity:** O(n log n)  
**Space Complexity:** O(log n) - recursion stack

---

### MidOfLinkedList

**Problem Statement:**  
Find the middle element of a linked list.

**Description:**  
Uses Floyd's slow-fast pointer technique:
- Slow moves one step at a time
- Fast moves two steps at a time
- When fast reaches end, slow is at middle

**Input Format:**
```
n (number of elements)
arr (space-separated values)
```

**Output Format:**  
Middle element value

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### OddEvenList

**Problem Statement:**  
Segregate nodes at odd and even positions in a linked list.

**Description:**  
Rearranges list so all odd-positioned nodes come first, followed by even-positioned nodes:
- Maintains relative order within each group
- Done in-place without creating new nodes

**Input Format:**
```
n (number of elements)
arr (space-separated values)
```

**Output Format:**  
Rearranged linked list

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### RemoveAtIndex

**Problem Statement:**  
Remove a node at a specified index from the linked list.

**Description:**  
- Handles removal at head (index 0)
- Handles removal at tail (index = size-1)
- For middle nodes, updates previous node's next pointer
- Validates index bounds

**Input Format:**
```
Commands:
addLast <val>
removeAt <idx>
display
quit
```

**Output Format:**  
Modified list after removal

**Time Complexity:** O(n) - traversal to index  
**Space Complexity:** O(1)

---

### RemoveDuplicatesFromSortedList

**Problem Statement:**  
Remove duplicate elements from a sorted linked list.

**Description:**  
Since list is sorted, duplicates are adjacent:
- Traverse list comparing current and next nodes
- If duplicate found, skip the next node
- Continue until end of list

**Input Format:**
```
n (number of elements)
arr (sorted values with possible duplicates)
```

**Output Format:**  
List with duplicates removed

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### RemoveFirst

**Problem Statement:**  
Remove the first node from the linked list.

**Description:**  
- If list empty, print error message
- If single element, set both head and tail to null
- Otherwise, move head to next node
- Decrements size

**Input Format:**
```
Commands:
addLast <val>
removeFirst
display
quit
```

**Output Format:**  
Modified list or error message

**Time Complexity:** O(1)  
**Space Complexity:** O(1)

---

### RemoveLast

**Problem Statement:**  
Remove the last node from the linked list.

**Description:**  
- If list empty, print error message
- If single element, set both head and tail to null
- Otherwise, traverse to second-to-last node
- Update tail and set its next to null

**Input Format:**
```
Commands:
addLast <val>
removeLast
display
quit
```

**Output Format:**  
Modified list or error message

**Time Complexity:** O(n) - traversal to end  
**Space Complexity:** O(1)

---

### ReverseEachKSegment

**Problem Statement:**  
Reverse the linked list in groups of k nodes.

**Description:**  
- Process list in segments of k nodes
- Reverse each segment individually
- Connect reversed segments together
- Last segment may have fewer than k nodes (handled appropriately)

**Input Format:**
```
n (number of elements)
arr (space-separated values)
k (group size)
a (value to add at front)
b (value to add at back)
```

**Output Format:**  
List showing original, after k-reverse, and after additions

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### ReverseLinkedList

**Problem Statement:**  
Reverse the entire linked list iteratively.

**Description:**  
Three-pointer iterative approach:
- prev (initially null), curr (head), next (temp)
- For each node: save next, reverse link, move pointers forward
- Finally update head to prev

**Input Format:**
```
n (number of elements)
arr (space-separated values)
```

**Output Format:**  
Reversed linked list

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### ReverseLinkedListChangingPointer

**Problem Statement:**  
Reverse linked list by manipulating pointers.

**Description:**  
Alternative implementation of reversal focusing on explicit pointer manipulation. Demonstrates understanding of reference changes.

**Input Format:**
```
n (number of elements)
arr (space-separated values)
```

**Output Format:**  
Reversed linked list

**Time Complexity:** O(n)  
**Space Complexity:** O(1)

---

### ReverseLinkedListRecursive

**Problem Statement:**  
Reverse the linked list using recursion.

**Description:**  
Recursive approach:
- Base case: empty or single node
- Recursive case: reverse rest of list, then adjust current node's links
- Uses helper function with parameters for tracking

**Input Format:**
```
n (number of elements)
arr (space-separated values)
```

**Output Format:**  
Reversed linked list

**Time Complexity:** O(n)  
**Space Complexity:** O(n) - recursion stack

---

## Common Node Structure

All problems use a standard singly linked list node:

```java
public static class Node {
    int data;
    Node next;
}
```

## Common LinkedList Structure

Most implementations include:

```java
public static class LinkedList {
    Node head;
    Node tail;
    int size;
    
    void addLast(int val) { ... }
    void addFirst(int val) { ... }
    void display() { ... }
    int size() { ... }
    // ... other methods
}
```

## Usage

Compile and run any problem:
```bash
javac LinkedList/<ProblemName>.java
java -cp LinkedList Main < input.txt
```

Or run directly with input:
```bash
echo -e "5\n1 2 3 4 5" | java -cp LinkedList <ProblemName>
```

## Key Concepts Covered

- **Basic Operations**: Add, remove, display, search
- **Traversal**: Forward, reverse, recursive
- **Manipulation**: Reverse, fold, merge, sort
- **Patterns**: Two-pointer, slow-fast pointer, recursion
- **Adapters**: Stack implementation using linked list
- **Advanced**: Intersection detection, palindrome check, k-group reversal

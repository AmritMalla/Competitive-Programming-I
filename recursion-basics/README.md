# Recursion Basics - Fundamental Recursion Problems

This directory contains fundamental recursion problems that help build a strong foundation in recursive thinking and problem-solving.

## Problems

### Basic Recursion Patterns

#### 1. PrintDecreasing.java
**Problem:** Print numbers from N down to 1 using recursion.

**Description:**
- Simple head recursion example
- Print before making recursive call
- Base case: when n equals 0

**Input:** Single integer `n`
**Output:** Numbers from n to 1, each on a new line
**Time Complexity:** O(n)
**Space Complexity:** O(n) for recursion stack

---

#### 2. PrintIncreasing.java
**Problem:** Print numbers from 1 to N using recursion.

**Description:**
- Simple tail recursion example
- Make recursive call before printing
- Base case: when n equals 0

**Input:** Single integer `n`
**Output:** Numbers from 1 to n, each on a new line
**Time Complexity:** O(n)
**Space Complexity:** O(n) for recursion stack

---

#### 3. PrintDecreasingAndIncreasing.java
**Problem:** Print numbers in decreasing then increasing order (N to 1, then 1 to N).

**Description:**
- Print before and after recursive call
- Creates a pattern: N, N-1, ..., 1, 1, ..., N-1, N
- Base case: when n equals 0

**Input:** Single integer `n`
**Output:** Pattern showing decreasing then increasing sequence
**Time Complexity:** O(n)
**Space Complexity:** O(n) for recursion stack

---

#### 4. PrintZigZagNumber.java
**Problem:** Print numbers in zig-zag pattern (pre-in-post order).

**Description:**
- Three print statements around two recursive calls
- Pattern: pre(n), pre(n-1), in(n-1), post(n-1), in(n), post(n)
- Demonstrates multiple recursive calls per function

**Input:** Single integer `n`
**Output:** Zig-zag pattern of numbers
**Time Complexity:** O(2^n)
**Space Complexity:** O(n) for recursion stack

---

### Mathematical Recursion

#### 5. Factorial.java
**Problem:** Calculate factorial of a number using recursion.

**Description:**
- Classic recursion example: n! = n × (n-1)!
- Base case: 0! = 1 and 1! = 1
- Returns integer result

**Input:** Single integer `n`
**Output:** Factorial of n
**Time Complexity:** O(n)
**Space Complexity:** O(n) for recursion stack

---

#### 6. PowerOfNumber.java
**Problem:** Calculate x raised to power n using simple recursion.

**Description:**
- Linear approach: x^n = x × x^(n-1)
- Base case: x^0 = 1
- Simple but not optimal for large powers

**Input:** Two integers `x` and `n`
**Output:** x raised to power n
**Time Complexity:** O(n)
**Space Complexity:** O(n) for recursion stack

---

#### 7. LogarithmeticPower.java
**Problem:** Calculate x raised to power n using logarithmic approach.

**Description:**
- Optimized approach using divide and conquer
- x^n = (x^(n/2))² if n is even
- x^n = (x^(n/2))² × x if n is odd
- Base case: x^0 = 1

**Input:** Two integers `x` and `n`
**Output:** x raised to power n
**Time Complexity:** O(log n)
**Space Complexity:** O(log n) for recursion stack

---

### Array Operations with Recursion

#### 8. DisplayArrayRecursive.java
**Problem:** Display all elements of an array using recursion.

**Description:**
- Traverse array from index 0 to end
- Print current element then recurse for next index
- Base case: when index equals array length

**Input:** Array size `n`, followed by `n` integers
**Output:** All array elements, each on a new line
**Time Complexity:** O(n)
**Space Complexity:** O(n) for recursion stack

---

#### 9. MaxOfArray.java
**Problem:** Find maximum element in an array using recursion.

**Description:**
- Compare current element with max of remaining array
- Recursive relation: max(arr[idx], maxOfArray(idx+1))
- Base case: return -1 when index equals array length

**Input:** Array size `n`, followed by `n` integers
**Output:** Maximum value in the array
**Time Complexity:** O(n)
**Space Complexity:** O(n) for recursion stack

---

#### 10. FirstOccurrenceOfElement.java
**Problem:** Find first occurrence of an element in array using recursion.

**Description:**
- Search from left to right
- Return index when element is found
- Base case: return -1 if not found

**Input:** Array, target value `x`
**Output:** Index of first occurrence, or -1 if not found
**Time Complexity:** O(n)
**Space Complexity:** O(n) for recursion stack

---

#### 11. LastOccurrence.java
**Problem:** Find last occurrence of an element in array using recursion.

**Description:**
- Search entire array recursively first
- Check current element after recursive call returns
- Returns highest index where element is found

**Input:** Array, target value `x`
**Output:** Index of last occurrence, or -1 if not found
**Time Complexity:** O(n)
**Space Complexity:** O(n) for recursion stack

---

#### 12. AllIndicesOfElementInArray.java
**Problem:** Find all indices where an element occurs in array.

**Description:**
- Count occurrences while traversing
- Create result array of exact size needed
- Fill array during backtracking phase

**Input:** Array, target value `x`
**Output:** Array of all indices where x occurs
**Time Complexity:** O(n)
**Space Complexity:** O(k) where k is number of occurrences

---

### Path Finding Problems

#### 13. GetStairsPath.java / PrintStairsPath.java
**Problem:** Find all ways to climb stairs taking 1, 2, or 3 steps at a time.

**Description:**
- Can take 1, 2, or 3 steps in one move
- Returns/prints all possible combinations
- Example: For n=3, paths are "111", "12", "21", "3"

**Input:** Integer `n` (number of stairs)
**Output:** All possible paths as strings
**Time Complexity:** O(3^n)
**Space Complexity:** O(n) for recursion stack

---

#### 14. PrintAllMazePath.java / GetAllMazePathList.java
**Problem:** Find all paths from top-left to bottom-right in a maze.

**Description:**
- Move only right (horizontal) or down (vertical)
- No diagonal movement in basic version
- Each path represented as string of 'h' and 'v'

**Input:** Maze dimensions `n` (rows) and `m` (columns)
**Output:** All paths as strings (e.g., "hhvv", "hvhv", etc.)
**Time Complexity:** O(2^(n+m))
**Space Complexity:** O(n+m) for recursion stack

---

#### 15. AllMazePathWithJump.java / PrintAllMazePathWithJump.java
**Problem:** Find all paths in maze with variable jump lengths.

**Description:**
- Can move horizontally, vertically, or diagonally
- Jump length can be 1 or more cells
- Paths include jump distance (e.g., "h2v1d1")

**Input:** Maze dimensions `n` (rows) and `m` (columns)
**Output:** All paths with jump distances
**Time Complexity:** O(3^(n+m))
**Space Complexity:** O(n+m) for recursion stack

---

### String & Sequence Problems

#### 16. GetAllSubsequence.java
**Problem:** Generate all subsequences of a string.

**Description:**
- A subsequence maintains relative order of characters
- Each character can be included or excluded
- Total 2^n subsequences for string of length n

**Input:** String `s`
**Output:** List of all subsequences including empty string
**Time Complexity:** O(2^n)
**Space Complexity:** O(n) for recursion stack

---

#### 17. PrintAllPermutationOfString.java
**Problem:** Generate all permutations of a string.

**Description:**
- Fix each character at first position recursively
- Generate permutations of remaining characters
- Total n! permutations for string of length n

**Input:** String `str`
**Output:** All permutations, each on a new line
**Time Complexity:** O(n!)
**Space Complexity:** O(n) for recursion stack

---

#### 18. GetAllKeyPadCombination.java / PrintAllKeyPadCombination.java
**Problem:** Generate all possible letter combinations for a numeric string (like phone keypad).

**Description:**
- Keypad mapping: 0→".;", 1→"abc", 2→"def", etc.
- Each digit maps to multiple letters
- Generate all possible letter combinations

**Input:** Numeric string (e.g., "123")
**Output:** All letter combinations (e.g., ["ad", "ae", "af", "bd", ...])
**Time Complexity:** O(4^n) where n is string length
**Space Complexity:** O(n) for recursion stack

---

#### 19. DecodeString.java
**Problem:** Print all possible encodings of a numeric string (1→a, 2→b, ..., 26→z).

**Description:**
- Single digit (1-9) maps to a-i
- Two digits (10-26) map to j-z
- Cannot decode '0' as standalone
- Uses backtracking to explore all valid decodings

**Input:** Numeric string containing digits 0-9
**Output:** All possible letter encodings
**Time Complexity:** O(2^n)
**Space Complexity:** O(n) for recursion stack

---

### Classic Recursion Problem

#### 20. TowerOfHanoi.java
**Problem:** Solve Tower of Hanoi puzzle with n disks.

**Description:**
- Move n disks from source to destination using helper peg
- Rules: Only one disk at a time, larger disk cannot be on smaller
- Recursive solution: Move n-1 to helper, move largest, move n-1 to destination

**Input:** Number of disks `n`, source peg, destination peg, helper peg
**Output:** Sequence of moves (e.g., "1[1 -> 3]")
**Time Complexity:** O(2^n)
**Space Complexity:** O(n) for recursion stack

---

## Key Concepts Covered

1. **Base Cases:** Every recursive function needs proper termination conditions
2. **Recursion Tree:** Visualize how recursive calls branch out
3. **Head vs Tail Recursion:** When to perform operations relative to recursive call
4. **Backtracking:** Undo choices to explore alternative paths
5. **Divide and Conquer:** Break problems into smaller subproblems
6. **Memoization Potential:** Some problems can be optimized with dynamic programming

## Tips for Beginners

1. Start with simple problems like factorial and printing patterns
2. Always identify the base case first
3. Trust that the recursive call will work (inductive hypothesis)
4. Draw recursion trees to understand flow
5. Practice converting iterative solutions to recursive ones
6. Understand the difference between printing and returning values

## How to Run

```bash
# Compile any file
javac FileName.java

# Run with input
java FileName < input.txt

# Or run interactively
java FileName
# Then type your input
```

## Progression Path

1. Start with: PrintDecreasing, PrintIncreasing, Factorial
2. Move to: Array operations (DisplayArray, MaxOfArray)
3. Practice: Path finding (Stairs, Maze paths)
4. Advanced: Permutations, Subsequences, KeyPad combinations
5. Master: Tower of Hanoi, DecodeString

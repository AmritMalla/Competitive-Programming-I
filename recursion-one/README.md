# Recursion One - Advanced Backtracking Problems

This directory contains advanced recursion problems that use backtracking techniques to solve complex combinatorial problems.

## Problems

### 1. FloodFillPath.java
**Problem:** Find all possible paths from top-left corner (0,0) to bottom-right corner (n-1,m-1) in a maze.

**Description:**
- Given a 2D maze where 0 represents open cells and 1 represents blocked cells
- Find all paths from source to destination
- Movement allowed in 4 directions: top (t), left (l), down (d), right (r)
- Uses backtracking to explore all possible paths
- Marks visited cells and unmarks them during backtracking

**Input Format:**
```
n m  (dimensions of maze)
n rows with m integers each (0 or 1)
```

**Output:** All possible paths as strings of directions (e.g., "ddrr", "drdr", etc.)

**Time Complexity:** O(4^(n*m)) in worst case
**Space Complexity:** O(n*m) for recursion stack

---

### 2. KnightsTour.java
**Problem:** Find all possible tours of a knight on an n×n chessboard starting from a given position.

**Description:**
- A knight must visit every square on the chessboard exactly once
- Starting position is given as input (row, col)
- Knight moves in L-shape: 2 squares in one direction and 1 square perpendicular
- Total 8 possible moves from any position
- Uses backtracking to explore all valid tours
- Displays complete board configuration for each valid tour

**Input Format:**
```
n          (size of chessboard)
row col    (starting position of knight)
```

**Output:** Complete chessboard configurations showing move numbers (1 to n²)

**Time Complexity:** O(8^(n²)) in worst case
**Space Complexity:** O(n²) for board and recursion stack

---

### 3. PrintNQueens.java
**Problem:** Place N queens on an N×N chessboard such that no two queens attack each other.

**Description:**
- Classic backtracking problem
- Each queen must be placed in a different row and column
- No two queens can be on the same diagonal
- Checks three constraints before placing:
  - Vertical column check
  - Left diagonal check
  - Right diagonal check
- Prints all valid configurations

**Input Format:**
```
n  (number of queens and board size)
```

**Output:** All valid queen placements as coordinate pairs (e.g., "0-1, 1-3, 2-0, 3-2, .")

**Time Complexity:** O(N!) 
**Space Complexity:** O(N²) for board and O(N) for recursion stack

---

## Common Techniques Used

1. **Backtracking Template:**
   - Make a choice
   - Recurse
   - Undo the choice (backtrack)

2. **Base Cases:**
   - Check boundary conditions
   - Check if solution is complete

3. **Constraint Checking:**
   - Validate moves before recursing
   - Use helper functions for complex constraints

4. **State Management:**
   - Mark/unmark visited cells
   - Maintain path/string as you recurse

## How to Run

```bash
# Compile
javac FileName.java

# Run
java FileName < input.txt
```

## Tips for Solving Backtracking Problems

1. Draw the recursion tree to understand the problem
2. Identify the base case clearly
3. Make choices at each level
4. Remember to undo choices (backtrack)
5. Practice constraint checking logic

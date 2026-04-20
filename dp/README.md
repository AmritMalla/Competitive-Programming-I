# Dynamic Programming Problems

This directory contains implementations of various dynamic programming problems in Java, ranging from classic DP problems to advanced optimization challenges.

## 📋 Problem List

### Classic DP Problems

| File | Problem | Description | Time Complexity | Space Complexity |
|------|---------|-------------|-----------------|------------------|
| `01KnapsackProblem.java` | 0/1 Knapsack | Maximize value with weight constraint, each item once | O(n·W) | O(n·W) |
| `UnboundedKnapsack.java` | Unbounded Knapsack | Maximize value with unlimited item usage | O(n·W) | O(W) |
| `FibonacciMemoized.java` | Fibonacci (Memoized) | Calculate nth Fibonacci number with memoization | O(n) | O(n) |
| `StairClimbWays.java` | Climbing Stairs | Count ways to climb stairs with 1, 2, or 3 steps | O(n) | O(n) |
| `ClimbStairsWithVariableJump.java` | Variable Jump Stairs | Count ways with variable jump sizes at each step | O(n²) | O(n) |
| `MinimumStepsToReachTarget.java` | Min Steps to Target | Find minimum jumps to reach end of array | O(n²) | O(n) |

### Stock Buy/Sell Problems

| File | Problem | Description | Time Complexity | Space Complexity |
|------|---------|-------------|-----------------|------------------|
| `BuyAndSellStock-I.java` | Best Time to Buy/Sell Stock I | Single transaction maximum profit | O(n) | O(1) |
| `BuyAndSellStock-II.java` | Best Time to Buy/Sell Stock II | Unlimited transactions maximum profit | O(n) | O(1) |
| `BuyAndSellStock-III.java` | Best Time to Buy/Sell Stock III | At most 2 transactions | O(n) | O(n) |
| `BuyAndSellStock-IV.java` | Best Time to Buy/Sell Stock IV | At most k transactions | O(n·k) | O(n·k) |
| `BuyAndSellStock-V.java` | Best Time to Buy/Sell Stock V | With cooldown period after selling | O(n) | O(1) |
| `BuyAndSellStock-VI.java` | Best Time to Buy/Sell Stock VI | With transaction fee | O(n) | O(1) |

### Counting & Combinatorics

| File | Problem | Description | Time Complexity | Space Complexity |
|------|---------|-------------|-----------------|------------------|
| `CoinChangeCombination.java` | Coin Change (Combinations) | Count combinations to make amount | O(n·amt) | O(amt) |
| `CoinChangePermutation.java` | Coin Change (Permutations) | Count permutations to make amount | O(n·amt) | O(amt) |
| `CountEncodings.java` | Count Ways to Decode String | Count ways to decode numeric string to letters | O(n) | O(n) |
| `BinaryStringWithoutConsecutiveZeros.java` | Binary Strings Without Consecutive Zeros | Count valid binary strings of length n | O(n) | O(1) |
| `NumberOfWaysOfConstructingABuilding.java` | Building Construction Ways | Count ways to construct building with constraints | O(n) | O(1) |
| `NumberOfSubsequenceOfAbc.java` | Count Subsequences of "abc" | Count subsequences forming "abc" | O(n) | O(1) |
| `FriendsPairing.java` | Friends Pairing Problem | Count ways to pair up friends | O(n) | O(n) |
| `PaintFence.java` | Paint Fence | Count ways to paint fence with k colors | O(n) | O(1) |
| `PartitionIntoSubsets.java` | Partition into K Subsets | Count ways to partition n items into k subsets | O(n·k) | O(n·k) |
| `TilingWaysOfMx1.java` | Tiling M×1 with 1×M tiles | Count tiling ways for M×1 board | O(n) | O(n) |
| `WaysOfTiling2XN.java` | Tiling 2×N with 2×1 tiles | Count tiling ways for 2×N board | O(n) | O(1) |

### Path & Grid Problems

| File | Problem | Description | Time Complexity | Space Complexity |
|------|---------|-------------|-----------------|------------------|
| `MaximumGoldMine.java` | Maximum Gold in Mine | Collect maximum gold in grid with movement constraints | O(n·m) | O(n·m) |
| `MinimumCostMazeTraversal.java` | Minimum Cost Maze Traversal | Find minimum cost path in grid | O(n·m) | O(n·m) |
| `TargetSumSubset.java` | Target Sum Subset | Check if subset exists with target sum | O(n·target) | O(n·target) |

---

## 🔍 Detailed Problem Descriptions

### 01KnapsackProblem.java
**Problem Statement:** Given n items with values and weights, maximize total value without exceeding capacity W. Each item can be chosen at most once.

**Input Format:**
- First line: `n` (number of items)
- Next `n` lines: values of items
- Next `n` lines: weights of items  
- Last line: `capacity` (maximum weight)

**Output Format:**
- Maximum achievable value

**Algorithm:**
- Create DP table where `dp[i][j]` = max value using first i items with capacity j
- For each item, either include it or exclude it
- `dp[i][j] = max(dp[i-1][j], dp[i-1][j-weight[i]] + value[i])`

---

### UnboundedKnapsack.java
**Problem Statement:** Similar to 0/1 knapsack but items can be used multiple times.

**Input Format:**
- First line: `n` (number of items)
- Next `n` lines: values of items
- Next `n` lines: weights of items
- Last line: `capacity`

**Output Format:**
- Maximum achievable value

**Algorithm:**
- Use 1D DP array where `dp[j]` = max value for capacity j
- Iterate through items, then through capacities
- Can reuse same item multiple times

---

### FibonacciMemoized.java
**Problem Statement:** Calculate the nth Fibonacci number using memoization.

**Input Format:**
- Single integer `n`

**Output Format:**
- nth Fibonacci number

**Algorithm:**
- Store computed values in array to avoid recomputation
- `fib(n) = fib(n-1) + fib(n-2)`
- Base cases: fib(0) = 0, fib(1) = 1

---

### StairClimbWays.java
**Problem Statement:** Count the number of ways to climb n stairs taking 1, 2, or 3 steps at a time.

**Input Format:**
- Single integer `n` (number of stairs)

**Output Format:**
- Total number of ways to climb

**Algorithm:**
- `ways(n) = ways(n-1) + ways(n-2) + ways(n-3)`
- Use memoization or iterative approach
- Base cases: ways(0) = 1, ways(1) = 1, ways(2) = 2

---

### ClimbStairsWithVariableJump.java
**Problem Statement:** Count ways to climb stairs where each stair has a maximum jump value.

**Input Format:**
- First line: `n` (number of stairs)
- Next `n` lines: maximum jump from each stair

**Output Format:**
- Total number of ways to reach top

**Algorithm:**
- For each position, try all possible jumps
- Sum up ways from all reachable positions
- `dp[i] = sum(dp[i+j])` for all valid j

---

### MinimumStepsToReachTarget.java
**Problem Statement:** Find minimum number of jumps to reach end of array where each element represents maximum jump length.

**Input Format:**
- First line: `n` (array size)
- Next `n` lines: array elements (max jump from each position)

**Output Format:**
- Minimum number of jumps needed

**Algorithm:**
- Use DP where `dp[i]` = minimum jumps to reach position i
- For each position, update all reachable positions
- `dp[i+j] = min(dp[i+j], dp[i] + 1)`

---

### BuyAndSellStock-I.java
**Problem Statement:** Find maximum profit from single buy-sell transaction given stock prices.

**Input Format:**
- First line: `n` (number of days)
- Next `n` lines: stock prices for each day

**Output Format:**
- Maximum profit achievable

**Algorithm:**
- Track minimum price seen so far
- Calculate profit if sold at current price
- Keep maximum profit

---

### BuyAndSellStock-II.java
**Problem Statement:** Find maximum profit with unlimited transactions (can buy and sell multiple times).

**Input Format:**
- First line: `n` (number of days)
- Next `n` lines: stock prices

**Output Format:**
- Maximum profit achievable

**Algorithm:**
- Add all positive price differences between consecutive days
- Buy before every increase, sell at peak

---

### BuyAndSellStock-III.java
**Problem Statement:** Find maximum profit with at most 2 transactions.

**Input Format:**
- First line: `n` (number of days)
- Next `n` lines: stock prices
- Last line: transaction fee (if applicable)

**Output Format:**
- Maximum profit with at most 2 transactions

**Algorithm:**
- Calculate max profit from left (first transaction)
- Calculate max profit from right (second transaction)
- Combine both profits at each split point

---

### BuyAndSellStock-IV.java
**Problem Statement:** Find maximum profit with at most k transactions.

**Input Format:**
- First line: `n` (number of days)
- Next `n` lines: stock prices
- Last line: `k` (maximum transactions)

**Output Format:**
- Maximum profit with at most k transactions

**Algorithm:**
- Use 2D DP: `dp[t][d]` = max profit with t transactions up to day d
- Optimize to avoid O(n³) complexity

---

### BuyAndSellStock-V.java
**Problem Statement:** Find maximum profit with cooldown period (cannot buy day after selling).

**Input Format:**
- First line: `n` (number of days)
- Next `n` lines: stock prices

**Output Format:**
- Maximum profit with cooldown

**Algorithm:**
- Maintain three states: bought, sold, cooldown
- Transition between states based on actions
- Cannot buy immediately after selling

---

### BuyAndSellStock-VI.java
**Problem Statement:** Find maximum profit with transaction fee for each complete transaction.

**Input Format:**
- First line: `n` (number of days)
- Next `n` lines: stock prices
- Last line: transaction fee

**Output Format:**
- Maximum profit after deducting fees

**Algorithm:**
- Track bought and sold states
- Subtract fee when completing transaction
- `sold = max(sold, bought + price - fee)`

---

### CoinChangeCombination.java
**Problem Statement:** Count number of combinations of coins that make up a target amount (order doesn't matter).

**Input Format:**
- First line: `n` (number of coin types)
- Next `n` lines: coin denominations
- Last line: target amount

**Output Format:**
- Number of combinations

**Algorithm:**
- Outer loop: iterate through coins
- Inner loop: iterate through amounts
- Ensures each combination counted once

---

### CoinChangePermutation.java
**Problem Statement:** Count number of permutations of coins that make up target amount (order matters).

**Input Format:**
- First line: `n` (number of coin types)
- Next `n` lines: coin denominations
- Last line: target amount

**Output Format:**
- Number of permutations

**Algorithm:**
- Outer loop: iterate through amounts
- Inner loop: iterate through coins
- Different orders counted separately

---

### CountEncodings.java
**Problem Statement:** Count ways to decode a numeric string where 'A'=1, 'B'=2, ..., 'Z'=26.

**Input Format:**
- Single string of digits

**Output Format:**
- Number of valid decodings

**Algorithm:**
- Check single digit (1-9) and two-digit (10-26) possibilities
- Handle edge cases like leading zeros
- `dp[i] = dp[i-1]` (if valid single digit) + `dp[i-2]` (if valid two digits)

---

### BinaryStringWithoutConsecutiveZeros.java
**Problem Statement:** Count binary strings of length n without consecutive zeros.

**Input Format:**
- Single integer `n` (length of string)

**Output Format:**
- Number of valid binary strings

**Algorithm:**
- Track strings ending with 0 and strings ending with 1
- Can only add 0 after 1, can add 1 after either
- Result is square of total valid strings

---

### NumberOfWaysOfConstructingABuilding.java
**Problem Statement:** Count ways to construct a building with sections, where no two consecutive sections are empty.

**Input Format:**
- Single integer `n` (number of sections)

**Output Format:**
- Total number of valid constructions

**Algorithm:**
- Similar to binary string problem
- Track occupied and empty sections
- Apply constraints on consecutive empty sections

---

### NumberOfSubsequenceOfAbc.java
**Problem Statement:** Count subsequences that form "abc" in a given string.

**Input Format:**
- Single string containing 'a', 'b', 'c' characters

**Output Format:**
- Number of "abc" subsequences

**Algorithm:**
- Track count of 'a', 'ab', and 'abc' subsequences
- Update counts as we process each character
- `c = c*2 + b`, `b = b*2 + a`, `a = a*2 + 1`

---

### FriendsPairing.java
**Problem Statement:** Count ways to pair up n friends where each friend remains single or pairs with exactly one other friend.

**Input Format:**
- Single integer `n` (number of friends)

**Output Format:**
- Number of ways to pair friends

**Algorithm:**
- Either keep nth friend single: `dp[n-1]`
- Or pair nth friend with any of (n-1) friends: `(n-1) * dp[n-2]`
- `dp[n] = dp[n-1] + (n-1) * dp[n-2]`

---

### PaintFence.java
**Problem Statement:** Count ways to paint n fence posts with k colors such that no more than two adjacent posts have same color.

**Input Format:**
- Two integers: `n` (posts), `k` (colors)

**Output Format:**
- Number of valid painting ways

**Algorithm:**
- Track same color and different color configurations
- `same[i] = diff[i-1]`
- `diff[i] = total[i-1] * (k-1)`
- `total[i] = same[i] + diff[i]`

---

### PartitionIntoSubsets.java
**Problem Statement:** Count ways to partition n distinct items into k non-empty subsets.

**Input Format:**
- Two integers: `n` (items), `k` (subsets)

**Output Format:**
- Number of partitions (Stirling numbers of second kind)

**Algorithm:**
- Use recurrence: `S(n,k) = k*S(n-1,k) + S(n-1,k-1)`
- Either add nth item to existing subset or create new subset

---

### TilingWaysOfMx1.java
**Problem Statement:** Count ways to tile an n×1 board with 1×m tiles.

**Input Format:**
- Two integers: `n` (board length), `m` (tile length)

**Output Format:**
- Number of tiling ways

**Algorithm:**
- If n < m: only 1 way (no placement)
- If n == m: 2 ways (place or don't place)
- Otherwise: `dp[n] = dp[n-1] + dp[n-m]`

---

### WaysOfTiling2XN.java
**Problem Statement:** Count ways to tile a 2×n board with 2×1 dominoes.

**Input Format:**
- Single integer `n` (board width)

**Output Format:**
- Number of tiling ways

**Algorithm:**
- Place domino vertically: reduces to 2×(n-1)
- Place two dominoes horizontally: reduces to 2×(n-2)
- `ways(n) = ways(n-1) + ways(n-2)` (Fibonacci sequence)

---

### MaximumGoldMine.java
**Problem Statement:** Find maximum gold collected in n×m grid starting from any cell in first column, moving right/up-right/down-right.

**Input Format:**
- Two integers: `n` (rows), `m` (columns)
- Next n×m values: grid with gold amounts

**Output Format:**
- Maximum gold collected

**Algorithm:**
- Process column by column from left to right
- For each cell, consider three possible previous positions
- `dp[i][j] = max(dp[i-1][j-1], dp[i][j-1], dp[i+1][j-1]) + gold[i][j]`

---

### MinimumCostMazeTraversal.java
**Problem Statement:** Find minimum cost to travel from top-left to bottom-right in grid, moving only right or down.

**Input Format:**
- Two integers: `n` (rows), `m` (columns)
- Next n×m values: cost matrix

**Output Format:**
- Minimum traversal cost

**Algorithm:**
- Initialize first row and column with cumulative sums
- For each cell: `dp[i][j] = min(dp[i-1][j], dp[i][j-1]) + cost[i][j]`

---

### TargetSumSubset.java
**Problem Statement:** Determine if there exists a subset of array elements that sums to target value.

**Input Format:**
- First line: `n` (array size)
- Next `n` lines: array elements
- Last line: target sum

**Output Format:**
- Boolean (true/false) indicating if subset exists

**Algorithm:**
- Create DP table where `dp[i][j]` = true if sum j achievable with first i elements
- For each element, either include or exclude it
- `dp[i][j] = dp[i-1][j] OR dp[i-1][j-arr[i]]`

---

## 💻 Usage Instructions

### Compilation
```bash
cd dp
javac *.java
```

### Running Individual Programs
```bash
# For 0/1 Knapsack
java 01KnapsackProblem < input.txt

# For Fibonacci
java FibonacciMemoized < input.txt

# For Stock problems
java BuyAndSellStock-I < input.txt
```

### Sample Input Format (0/1 Knapsack)
```
4
10 20 30 40
1 2 3 4
5
```
Where:
- First line: number of items
- Next n lines: values
- Next n lines: weights
- Last line: capacity

---

## 📊 DP Pattern Classification

### 1. Linear DP
- Fibonacci, Climbing Stairs
- Single dimension state progression

### 2. Knapsack Patterns
- 0/1 Knapsack, Unbounded Knapsack
- Choice-based decisions

### 3. Interval DP
- Stock buy/sell problems
- Decisions over ranges

### 4. Grid/Path DP
- Gold Mine, Maze Traversal
- 2D state space

### 5. Counting DP
- Coin change, Tiling, Pairing
- Combinatorial counting

### 6. String DP
- Encoding, Subsequence counting
- Character-by-character processing

---

## 🎯 Learning Objectives

After studying these implementations, you should understand:
1. How to identify overlapping subproblems
2. When to use memoization vs tabulation
3. State definition and transition formulation
4. Optimization techniques (space reduction)
5. Common DP patterns and their variations
6. How to approach new DP problems systematically

---

## 🔗 Related Topics
- [Recursion](../recursion/README.md)
- [Backtracking](../backtracking/README.md)
- [Greedy Algorithms](../greedy/README.md)
- [Sorting](../Sorting/README.md)

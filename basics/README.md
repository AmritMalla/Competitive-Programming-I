# Basics - Fundamental Programming Problems

This directory contains fundamental programming problems covering number systems, arrays, matrices, strings, and basic algorithms. These problems build essential problem-solving skills.

## Problems

### Number System & Arithmetic

#### 1. ReverseANumber.java
**Problem:** Reverse the digits of a number and print each digit.

**Description:**
- Extract digits using modulo and division
- Print digits in reverse order
- Basic number manipulation

**Input:** Integer `n`
**Output:** Each digit of reversed number on separate line
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 2. RotateNumber.java
**Problem:** Rotate a number by k positions.

**Description:**
- Positive k: rotate right
- Negative k: rotate left
- Handle rotation larger than number of digits

**Input:** Number `n`, rotation count `k`
**Output:** Rotated number
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 3. CountDigit.java
**Problem:** Count the number of digits in an integer.

**Description:**
- Simple division by 10 until number becomes 0
- Count iterations

**Input:** Integer `n`
**Output:** Count of digits
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 4. DigitFrequency.java
**Problem:** Find frequency of a specific digit in a number.

**Description:**
- Extract each digit
- Count occurrences of target digit

**Input:** Number `n`, digit `d`
**Output:** Frequency of digit d in n
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 5. GcdAndLcm.java
**Problem:** Calculate GCD and LCM of two numbers.

**Description:**
- Use Euclidean algorithm for GCD
- LCM = (n1 × n2) / GCD

**Input:** Two integers `n1`, `n2`
**Output:** GCD and LCM
**Time Complexity:** O(log(min(n1, n2)))
**Space Complexity:** O(1)

---

#### 6. IsNumberPrime.java
**Problem:** Check if a number is prime.

**Description:**
- Check divisibility from 2 to √n
- Handle edge cases (1, 2, even numbers)

**Input:** Integer `n`
**Output:** "prime" or "not prime"
**Time Complexity:** O(√n)
**Space Complexity:** O(1)

---

#### 7. PrintAllPrimeUptoN.java
**Problem:** Print all prime numbers in a given range.

**Description:**
- Iterate through range
- Check primality for each number

**Input:** Range `[low, high]`
**Output:** All prime numbers in range
**Time Complexity:** O((high-low) × √high)
**Space Complexity:** O(1)

---

#### 8. PrimeFactorOfNumber.java
**Problem:** Print all prime factors of a number.

**Description:**
- Divide by smallest prime factors first
- Continue until number becomes 1

**Input:** Integer `n`
**Output:** All prime factors
**Time Complexity:** O(√n)
**Space Complexity:** O(1)

---

#### 9. PrintFibUptoN.java
**Problem:** Print first N Fibonacci numbers.

**Description:**
- F(0) = 0, F(1) = 1
- F(n) = F(n-1) + F(n-2)

**Input:** Integer `n`
**Output:** First n Fibonacci numbers
**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

#### 10. BenjaminBulbs.java
**Problem:** Find perfect squares up to n (bulbs that remain on).

**Description:**
- Based on toggling bulbs pattern
- Only perfect squares remain on

**Input:** Integer `n`
**Output:** All perfect squares ≤ n
**Time Complexity:** O(√n)
**Space Complexity:** O(1)

---

### Base Conversion

#### 11. AnyBaseToDecimal.java
**Problem:** Convert a number from any base to decimal.

**Description:**
- Multiply each digit by appropriate power of base
- Sum all values

**Input:** Number `n`, base `b`
**Output:** Decimal equivalent
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 12. DecimalToAnyBaseNumber.java
**Problem:** Convert decimal number to any base.

**Description:**
- Repeatedly divide by base
- Collect remainders in reverse order

**Input:** Decimal number `n`, target base `b`
**Output:** Number in base b
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 13. AnyBaseToAnyBase.java
**Problem:** Convert number from any base to any other base.

**Description:**
- First convert to decimal (intermediate)
- Then convert decimal to destination base

**Input:** Number `n`, source base, destination base
**Output:** Number in destination base
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 14. AnyBaseAddition.java
**Problem:** Add two numbers in any base.

**Description:**
- Add digit by digit from right to left
- Handle carry according to base

**Input:** Base `b`, two numbers `n1`, `n2`
**Output:** Sum in base b
**Time Complexity:** O(max(log n1, log n2))
**Space Complexity:** O(1)

---

#### 15. AnyBaseSubtraction.java
**Problem:** Subtract two numbers in any base.

**Description:**
- Subtract digit by digit from right to left
- Handle borrow according to base

**Input:** Base `b`, two numbers `n1`, `n2` (n2 > n1)
**Output:** Difference in base b
**Time Complexity:** O(max(log n1, log n2))
**Space Complexity:** O(1)

---

#### 16. AnyBaseMultiplication.java
**Problem:** Multiply two numbers in any base.

**Description:**
- Multiply like decimal multiplication
- Use base-specific addition for carrying

**Input:** Base `b`, two numbers `n1`, `n2`
**Output:** Product in base b
**Time Complexity:** O(log n1 × log n2)
**Space Complexity:** O(1)

---

### Array Problems

#### 17. ArrayReverse.java
**Problem:** Reverse an array in place.

**Description:**
- Two pointer approach
- Swap elements from ends moving inward

**Input:** Array of size n
**Output:** Reversed array
**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

#### 18. SpanOfArray.java
**Problem:** Find difference between max and min element.

**Description:**
- Single pass to find both max and min
- Return their difference

**Input:** Array of integers
**Output:** max - min
**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

#### 19. InverseOfArray.java
**Problem:** Find inverse of array where arr[i] represents position of i.

**Description:**
- If arr[i] = j, then inverse[j] = i
- Valid only for permutation arrays

**Input:** Permutation array
**Output:** Inverse array
**Time Complexity:** O(n)
**Space Complexity:** O(n)

---

#### 20. RotateArray.java
**Problem:** Rotate array by k positions.

**Description:**
- Three reversals method:
  1. Reverse first part
  2. Reverse second part
  3. Reverse entire array

**Input:** Array, rotation count k
**Output:** Rotated array
**Time Complexity:** O(n)
**Space Complexity:** O(1)

---

#### 21. InverseOfNumber.java
**Problem:** Find inverse of a number based on digit positions.

**Description:**
- Position-based digit rearrangement
- Similar concept to array inverse

**Input:** Number n
**Output:** Inverse number
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 22. SubArrayProblem.java
**Problem:** Print all subarrays of an array.

**Description:**
- Three nested loops
- Outer two define start and end
- Inner loop prints elements

**Input:** Array of size n
**Output:** All possible subarrays
**Time Complexity:** O(n³)
**Space Complexity:** O(1)

---

#### 23. ArraySubsets.java
**Problem:** Print all subsets of an array.

**Description:**
- 2^n total subsets
- Use binary representation to include/exclude elements

**Input:** Array of size n
**Output:** All subsets (2^n)
**Time Complexity:** O(n × 2^n)
**Space Complexity:** O(1)

---

#### 24. SumOfSubsets.java
**Problem:** Find subsets with target sum.

**Description:**
- Backtracking approach
- Include or exclude each element

**Input:** Array, target sum
**Output:** All subsets with target sum
**Time Complexity:** O(2^n)
**Space Complexity:** O(n)

---

#### 25. SumOfTwoArrays.java
**Problem:** Add two arrays representing large numbers.

**Description:**
- Add from right to left
- Handle different sizes
- Manage carry

**Input:** Two arrays representing numbers
**Output:** Array representing sum
**Time Complexity:** O(max(n1, n2))
**Space Complexity:** O(max(n1, n2))

---

#### 26. DifferenceOfTwoArrays.java
**Problem:** Subtract two arrays (larger - smaller).

**Description:**
- Subtract from right to left
- Handle borrow
- Skip leading zeros

**Input:** Two arrays (first represents larger number)
**Output:** Array representing difference
**Time Complexity:** O(max(n1, n2))
**Space Complexity:** O(max(n1, n2))

---

#### 27. RemoveAllPrimeFromArrayList.java
**Problem:** Remove all prime numbers from ArrayList.

**Description:**
- Iterate backwards to avoid index issues
- Check primality before removal

**Input:** ArrayList of integers
**Output:** ArrayList with primes removed
**Time Complexity:** O(n × √m) where m is max value
**Space Complexity:** O(1)

---

#### 28. BarChart.java
**Problem:** Create histogram/bar chart from array.

**Description:**
- Find maximum value
- Print rows from max to 1
- Use '*' for values >= current row

**Input:** Array of heights
**Output:** Visual bar chart
**Time Complexity:** O(n × max)
**Space Complexity:** O(1)

---

#### 29. BrokenEconomy.java
**Problem:** Find floor and ceiling in sorted rotated array.

**Description:**
- Modified binary search
- Handle rotated sorted array
- Return closest values around target

**Input:** Sorted rotated array, target value
**Output:** Floor and ceiling values
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 30. FirstAndLastIndex.java
**Problem:** Find first and last occurrence of element in sorted array.

**Description:**
- Binary search variant
- For first: continue searching left after finding
- For last: continue searching right after finding

**Input:** Sorted array, target value
**Output:** First and last indices
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

#### 31. PythagoreanTriplet.java
**Problem:** Check if three numbers form a Pythagorean triplet.

**Description:**
- Check a² + b² = c² (in any order)
- Verify all three combinations

**Input:** Three integers
**Output:** true/false
**Time Complexity:** O(1)
**Space Complexity:** O(1)

---

### Matrix Problems

#### 32. ExitPointOfMatrix.java
**Problem:** Find exit point when traversing matrix with direction changes.

**Description:**
- Start from (0,0) facing east
- Turn right (90°) when encountering 1
- Continue straight for 0
- Stop when leaving matrix

**Input:** Binary matrix
**Output:** Exit coordinates
**Time Complexity:** O(n + m)
**Space Complexity:** O(1)

---

#### 33. SpiralArrayTraverse.java
**Problem:** Traverse matrix in spiral pattern (column-wise zigzag).

**Description:**
- Alternate direction for each column
- Even columns: top to bottom
- Odd columns: bottom to top

**Input:** Matrix
**Output:** Elements in spiral order
**Time Complexity:** O(n × m)
**Space Complexity:** O(1)

---

#### 34. DiagonalTraverse.java
**Problem:** Print all diagonals of a square matrix.

**Description:**
- Start from top-left corner
- Move diagonally (i+1, j+1)
- Cover all diagonals starting from first row

**Input:** Square matrix
**Output:** All diagonal elements
**Time Complexity:** O(n²)
**Space Complexity:** O(1)

---

#### 35. SearchInSorted2DArray.java
**Problem:** Search for element in row-wise and column-wise sorted matrix.

**Description:**
- Start from top-right corner
- Move left if current > target
- Move down if current < target

**Input:** Sorted 2D matrix, target
**Output:** Position or "Not Found"
**Time Complexity:** O(n + m)
**Space Complexity:** O(1)

---

#### 36. SaddlePoint.java
**Problem:** Find saddle point in matrix (min in row, max in column).

**Description:**
- For each row, find minimum
- Check if it's maximum in its column
- Return if found

**Input:** Square matrix
**Output:** Saddle point value or "Invalid input"
**Time Complexity:** O(n²)
**Space Complexity:** O(1)

---

#### 37. MatrixMultiplication.java
**Problem:** Multiply two matrices.

**Description:**
- Check compatibility (cols1 == rows2)
- Standard O(n³) multiplication
- Result[i][j] = Σ(row1[i][k] × row2[k][j])

**Input:** Two matrices
**Output:** Product matrix or "Invalid input"
**Time Complexity:** O(n1 × m1 × m2)
**Space Complexity:** O(n1 × m2)

---

#### 38. RotateArrayBy90.java
**Problem:** Rotate square matrix 90 degrees clockwise.

**Description:**
- Step 1: Transpose matrix
- Step 2: Reverse each row

**Input:** Square matrix
**Output:** Rotated matrix
**Time Complexity:** O(n²)
**Space Complexity:** O(1)

---

#### 39. TwoDArrayShellRotate.java
**Problem:** Rotate a specific shell of matrix by r positions.

**Description:**
- Extract shell as 1D array
- Rotate 1D array
- Fill back into matrix

**Input:** Matrix, shell number s, rotation r
**Output:** Matrix with rotated shell
**Time Complexity:** O(n + m)
**Space Complexity:** O(n + m)

---

#### 40. ZigzagMatrixTravel.java
**Problem:** Traverse matrix in zigzag pattern.

**Description:**
- Diagonal traversal
- Alternate direction for each diagonal

**Input:** Matrix
**Output:** Elements in zigzag order
**Time Complexity:** O(n × m)
**Space Complexity:** O(1)

---

### String Problems

#### 41. StringCompression.java
**Problem:** Compress string by removing consecutive duplicates.

**Description:**
- Keep first character of consecutive group
- Remove subsequent duplicates

**Input:** String
**Output:** Compressed string
**Time Complexity:** O(n)
**Space Complexity:** O(n)

---

#### 42. PrintAllPermutations.java
**Problem:** Generate all permutations of a string.

**Description:**
- Use factorial number system
- Map each number to unique permutation

**Input:** String
**Output:** All permutations
**Time Complexity:** O(n!)
**Space Complexity:** O(n)

---

#### 43. PrintAllPalindromicSubstring.java
**Problem:** Print all palindromic substrings.

**Description:**
- Check each substring
- Verify palindrome property

**Input:** String
**Output:** All palindromic substrings
**Time Complexity:** O(n³)
**Space Complexity:** O(1)

---

### Other Utilities

#### 44. DigitsOfNumber.java
**Problem:** Print each digit of a number separately.

**Description:**
- Count digits first
- Extract from left to right using divisor

**Input:** Integer n
**Output:** Each digit on separate line
**Time Complexity:** O(log n)
**Space Complexity:** O(1)

---

## Key Concepts Covered

1. **Number Systems:** Base conversion, arithmetic operations
2. **Array Manipulation:** Rotation, reversal, searching
3. **Matrix Operations:** Traversal, rotation, multiplication
4. **Mathematical Algorithms:** GCD, LCM, prime checking, Fibonacci
5. **String Processing:** Compression, permutation generation
6. **Binary Search:** Variants for different use cases
7. **Two Pointer Technique:** Efficient array processing

## How to Run

```bash
# Compile
javac FileName.java

# Run with input file
java FileName < input.txt

# Or run interactively
java FileName
# Type input when prompted
```

## Tips

1. Start with number system problems to build confidence
2. Practice array problems to master indexing
3. Matrix problems require careful boundary checking
4. Always consider edge cases (empty input, single element, etc.)
5. Time complexity matters for large inputs
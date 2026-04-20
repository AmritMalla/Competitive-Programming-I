# Star Pattern Problems

This directory contains implementations of various **star pattern printing** problems in Java. These problems help build strong logic building skills and understanding of nested loops.

## 📋 Table of Contents

- [Overview](#overview)
- [Problem List](#problem-list)
- [Getting Started](#getting-started)
- [Pattern Categories](#pattern-categories)

---

## Overview

Star pattern problems are excellent exercises for mastering:
- **Nested loops** (rows and columns)
- **Conditional logic** for spacing and star placement
- **Mathematical relationships** between row/column numbers
- **Symmetry and visualization** skills

These patterns form the foundation for understanding 2D arrays, matrix operations, and coordinate geometry in programming.

---

## 📁 Problem List

| # | File Name | Pattern Type | Difficulty | Key Concepts |
|---|-----------|--------------|------------|--------------|
| 1 | `StarPattern1.java` | Right-angled triangle (left-aligned) | Easy | Basic nested loops |
| 2 | `StarPattern2.java` | Inverted right-angled triangle | Easy | Decreasing loop |
| 3 | `StarPattern3.java` | Right-angled triangle (right-aligned) | Easy | Spaces + stars |
| 4 | `StarPattern4.java` | Pyramid pattern | Easy | Odd number sequence |
| 5 | `StarPattern5.java` | Inverted pyramid | Easy | Reverse iteration |
| 6 | `StarPattern6.java` | Diamond pattern | Medium | Two pyramids combined |
| 7 | `StarPattern7.java` | Hollow square | Medium | Boundary conditions |
| 8 | `StarPattern8.java` | Hollow rectangle | Medium | Variable dimensions |
| 9 | `StarPattern9.java` | Hollow pyramid | Medium | Edge detection |
| 10 | `StarPattern10.java` | Hollow diamond | Medium | Multiple conditions |
| 11 | `StarPattern11.java` | Number pattern (sequential) | Medium | Counter variables |
| 12 | `StarPattern12.java` | Floyd's triangle | Easy | Row-wise numbering |
| 13 | `StarPattern13.java` | Pascal's triangle | Hard | Binomial coefficients |
| 14 | `StarPattern14.java` | Butterfly pattern | Medium | Symmetry logic |
| 15 | `StarPattern15.java` | Hourglass pattern | Medium | Two triangles |
| 16 | `StarPattern16.java` | Rhombus pattern | Easy | Offset spaces |
| 17 | `StarPattern17.java` | Parallelogram pattern | Easy | Increasing offset |
| 18 | `StarPattern18.java` | X pattern (cross) | Medium | Diagonal logic |
| 19 | `StarPattern19.java` | Plus pattern (cross) | Medium | Center alignment |
| 20 | `StarPattern20.java` | Arrow pattern | Hard | Complex conditions |

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal
- Understanding of for loops and conditional statements

### Compilation
```bash
cd star-pattern
javac *.java
```

### Running a Specific Pattern
```bash
java StarPattern1
```

---

## 💡 Usage

### Example - StarPattern1 (Right Triangle)
```
Input: n = 5

Output:
*
**
***
****
*****
```

### Example - StarPattern4 (Pyramid)
```
Input: n = 5

Output:
    *
   ***
  *****
 *******
*********
```

### Example - StarPattern6 (Diamond)
```
Input: n = 5

Output:
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
```

### Example - StarPattern7 (Hollow Square)
```
Input: n = 5

Output:
*****
*   *
*   *
*   *
*****
```

### Example - StarPattern12 (Floyd's Triangle)
```
Input: n = 5

Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
```

---

## 📊 Pattern Categories

### 1. Triangle Patterns (Patterns 1-5)
**Characteristics:**
- Simple incrementing/decrementing loops
- May include leading spaces
- Foundation for complex patterns

**Key Formula:**
- Stars in row i: typically `i` or `2*i - 1`
- Spaces before stars: `n - i`

### 2. Hollow Patterns (Patterns 7-10)
**Characteristics:**
- Print stars only on boundaries
- Check first/last row and column
- More conditional logic required

**Condition Template:**
```java
if (row == 1 || row == n || col == 1 || col == n) {
    print("*");
} else {
    print(" ");
}
```

### 3. Symmetric Patterns (Patterns 6, 14-15)
**Characteristics:**
- Combine two or more patterns
- Upper half mirrors lower half
- Requires splitting into sections

**Approach:**
1. Print upper half (increasing)
2. Print lower half (decreasing)

### 4. Number Patterns (Patterns 11-13)
**Characteristics:**
- Use counters instead of stars
- Mathematical sequences
- Track position carefully

### 5. Special Patterns (Patterns 16-20)
**Characteristics:**
- Unique shapes (X, +, arrow, etc.)
- Complex mathematical relationships
- Often use diagonal properties

**Diagonal Logic:**
- Main diagonal: `row == col`
- Anti-diagonal: `row + col == n + 1`

---

## 🔗 Related Topics

- [Basics](../basics/) - Fundamental programming concepts
- [Recursion Basics](../recursion-basics/) - Alternative recursive approaches
- [Matrix Problems](../basics/) - 2D array manipulation

---

## 📝 Tips for Solving Pattern Problems

1. **Draw the pattern** on paper first
2. **Identify the relationship** between row number and:
   - Number of spaces
   - Number of stars/characters
3. **Break complex patterns** into simpler parts
4. **Use 1-indexed rows** for easier math
5. **Test with small values** (n=3, 4) before larger ones
6. **Look for symmetry** to reduce code duplication

### General Approach:
```java
for (int row = 1; row <= n; row++) {
    // Print spaces
    for (int space = 1; space <= spaces_needed; space++) {
        System.out.print(" ");
    }
    
    // Print stars/numbers
    for (int col = 1; col <= stars_needed; col++) {
        System.out.print("*");
    }
    
    // Move to next line
    System.out.println();
}
```

---

## 🎯 Learning Outcomes

After practicing these patterns, you'll master:
- ✅ Nested loop control
- ✅ Conditional printing logic
- ✅ Mathematical pattern recognition
- ✅ Spatial reasoning in code
- ✅ Debugging multi-loop programs
- ✅ Code optimization techniques

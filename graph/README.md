# Graph Problems

This directory contains comprehensive implementations of various **Graph** algorithms and problems in Java.

## 📋 Table of Contents

- [Overview](#overview)
- [Problem List](#problem-list)
- [Getting Started](#getting-started)
- [Usage](#usage)

---

## Overview

A **Graph** is a non-linear data structure consisting of vertices (nodes) and edges (connections). This directory covers both directed and undirected graphs with various traversal and optimization algorithms.

**Key Concepts:**
- **Vertices (V)**: Nodes in the graph
- **Edges (E)**: Connections between nodes
- **Adjacency List**: Space-efficient representation O(V + E)
- **DFS/BFS**: Fundamental traversal algorithms

---

## 📁 Problem List

### Graph Representation & Basic Operations

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 1 | `RepresentationOfGraph.java` | Create and display graph using adjacency list | O(V + E) | O(V + E) |
| 2 | `HasPath.java` | Check if path exists between two vertices | O(V + E) | O(V) |
| 3 | `GetConnectedComponents.java` | Find all connected components in graph | O(V + E) | O(V) |
| 4 | `IsGraphConnected.java` | Check if entire graph is connected | O(V + E) | O(V) |
| 5 | `IsGraphCyclic.java` | Detect cycle in undirected/directed graph | O(V + E) | O(V) |
| 6 | `IsGraphBipartite.java` | Check if graph is bipartite (2-colorable) | O(V + E) | O(V) |

### Graph Traversal

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 7 | `BFSonGraph.java` | Breadth-First Search traversal | O(V + E) | O(V) |
| 8 | `IterativeDFS.java` | Depth-First Search using iteration | O(V + E) | O(V) |

### Path Finding Problems

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 9 | `PrintAllPaths.java` | Print all paths from source to destination | O(2^V) | O(V) |
| 10 | `PrintMaxMinCeilFloorKthLargestPath.java` | Find max, min, ceil, floor, kth largest path costs | O(2^V) | O(V) |
| 11 | `ShortestPathInWeightsDijkstra.java` | Find shortest path using Dijkstra's algorithm | O(E log V) | O(V) |
| 12 | `OrderOfCompilationTopologicalSort.java` | Topological sort for dependency resolution | O(V + E) | O(V) |

### Advanced Graph Algorithms

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 13 | `HamiltonianPathAndCycle.java` | Find Hamiltonian path/cycle (visits each vertex once) | O(V!) | O(V) |
| 14 | `KnightsTour.java` | Solve Knight's Tour problem on chessboard | O(8^(V²)) | O(V²) |
| 15 | `MinimumWireCostPrims.java` | Find Minimum Spanning Tree using Prim's algorithm | O(E log V) | O(V) |
| 16 | `SpreadOfInfection.java` | Simulate infection spread in graph (multi-source BFS) | O(V + E) | O(V) |
| 17 | `PerfectFriends.java` | Count ways to pair friends (matching problem) | O((V-1)!!) | O(V) |

### Grid-Based Problems

| # | File Name | Description | Time Complexity | Space Complexity |
|---|-----------|-------------|-----------------|------------------|
| 18 | `NumberOfIslands.java` | Count connected components in 2D grid | O(m × n) | O(m × n) |

**Legend:**
- V = number of vertices
- E = number of edges
- m × n = grid dimensions
- !! = double factorial

---

## 🚀 Getting Started

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line terminal

### Compilation
```bash
cd graph
javac *.java
```

### Running a Specific Problem
```bash
java RepresentationOfGraph
```

---

## 💡 Usage

### Input Format - Adjacency List
Most graph problems accept input as edge list:
```
n (number of vertices)
m (number of edges)
v1 v2 w (edge from v1 to v2 with weight w, if weighted)
...
```

### Example - RepresentationOfGraph
```
Input:
8 (vertices)
11 (edges)
0 1 10
1 2 20
...

Output:
Adjacency list representation
```

### Example - HasPath
```
Input:
Vertices, Edges
Edge list
src, dest

Output:
true/false
```

### Example - BFSonGraph
```
Input:
Vertices, Edges
Edge list
Starting vertex

Output:
BFS traversal order
```

---

## 📊 Algorithm Details

### 1. Graph Representation
**Approach:**
- Use ArrayList of Edge objects
- Store vertex, neighbor, and weight
- Support both directed and undirected graphs

### 2. DFS/BFS Traversal
**DFS:** Use recursion or stack, explore depth-first
**BFS:** Use queue, explore level by level

### 3. Connected Components
**Algorithm:**
- Run DFS/BFS from unvisited nodes
- Each traversal finds one component
- Count total traversals

### 4. Cycle Detection
**Undirected:** Track parent to avoid false positives
**Directed:** Use recursion stack tracking

### 5. Bipartite Check
**Approach:**
- 2-coloring using BFS/DFS
- Adjacent nodes must have different colors
- If conflict found, not bipartite

### 6. Dijkstra's Algorithm
**Steps:**
1. Initialize distances to infinity
2. Use priority queue for minimum distance
3. Relax edges and update distances
4. Repeat until all vertices processed

### 7. Topological Sort
**Use Case:** Task scheduling, compilation order
**Algorithm:** DFS-based with finish time ordering

### 8. Prim's MST
**Approach:**
- Greedy algorithm
- Start from arbitrary vertex
- Always add minimum weight edge to tree

### 9. Hamiltonian Path/Cycle
**Backtracking:** Try all permutations, check validity
**Complexity:** Exponential - NP-complete problem

### 10. Knight's Tour
**Warnsdorff's Heuristic:** Prefer moves with fewer onward moves
**Backtracking:** Try all 8 possible knight moves

---

## 🔗 Related Topics

- [Recursion Basics](../recursion-basics/) - Fundamental recursion for DFS
- [Queue](../queue/) - Used in BFS implementation
- [Stack](../stack/) - Used in DFS implementation
- [Heap](../heap/) - Used in Dijkstra's and Prim's algorithms

---

## 📝 Notes

- All algorithms assume 0-indexed vertices unless specified
- Time complexity varies based on graph density
- For dense graphs: E ≈ V²
- For sparse graphs: E ≈ V
- Space complexity includes visited array and recursion stack

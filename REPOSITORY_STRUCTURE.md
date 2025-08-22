# 📁 Repository Structure Guide

This document provides a comprehensive overview of the DSA Journey repository structure, making it easy to navigate and understand the organization of topics, files, and learning resources.

## 🏗️ Overall Architecture

```
DSA-Journey-Notes-and-Programs/
│
├── 📚 Core Fundamentals/          # Java and programming basics
├── 🗄️ Data Structures/            # All data structure implementations  
├── 🔍 Algorithms/                 # Algorithm implementations and patterns
├── 📖 Documentation/              # Notes and learning materials
├── ⚙️ Configuration/              # Development setup and GitHub configs
└── 📋 Project Files/              # License, README, and project metadata
```

## 📚 Core Fundamentals

### Basic Java Concepts
| Folder | Purpose | Key Files | Learning Level |
|--------|---------|-----------|----------------|
| `Basic/` | Java fundamentals, I/O operations | `Main.java`, `dataTypes.java` | Beginner |
| `Conditionals/` | If-else, switch statements | `ifElse.java`, `switchCase.java` | Beginner |
| `Loops/` | For, while, do-while loops | `forLoop.java`, `whileLoop.java` | Beginner |
| `Oops/` | Object-Oriented Programming | `inheritance.java`, `polymorphism.java` | Intermediate |
| `Pattern_Printing/` | Various pattern programs | `trianglePattern.java`, `starPattern.java` | Beginner |

## 🗄️ Data Structures

### Linear Data Structures
| Folder | Description | LeetCode Problems | Complexity Focus |
|--------|-------------|-------------------|------------------|
| `arrays/` | 1D arrays, basic operations | Q1, Q26, Q53, Q121, Q189 | O(n) traversal, O(1) access |
| `TwoDimensionalArray/` | 2D arrays, matrix operations | Matrix traversal, searching | O(n²) operations |
| `TwoDArrayList/` | Dynamic 2D array implementations | Resizable matrices | Dynamic sizing |
| `Strings/` | String manipulation, algorithms | Pattern matching, parsing | String operations |
| `Linked_List/` | Singly, doubly, circular lists | Reversal, cycle detection | O(n) traversal |

### Stack-Based Structures  
| Folder | Description | LeetCode Problems | Key Concepts |
|--------|-------------|-------------------|--------------|
| `Stacks/` | Stack implementations, problems | Balanced parentheses, monotonic stack | LIFO, O(1) push/pop |
| `Queue/` | Queue, deque, priority queue | Level order, sliding window | FIFO, O(1) enqueue/dequeue |

### Tree Structures
| Folder | Description | LeetCode Problems | Traversal Methods |
|--------|-------------|-------------------|-------------------|
| `Trees/` | Binary trees, general trees | DFS, BFS, level order | In/Pre/Post-order |
| `Binary_Search_Trees/` | BST operations, validations | Search, insert, delete | O(log n) operations |
| `Heaps/` | Min/max heaps, priority queues | Top K problems, median | O(log n) insert/delete |

### Hash-Based & Graph Structures
| Folder | Description | LeetCode Problems | Key Operations |
|--------|-------------|-------------------|----------------|
| `Hashmaps/` | HashMap, HashSet, TreeMap usage | Two sum, frequency counting | O(1) average lookup |
| `Graph/` | Graph algorithms, theory | DFS, BFS, shortest path | Various traversals |

## 🔍 Algorithms

### Sorting Algorithms
| Folder | Description | Algorithms Covered | Time Complexity |
|--------|-------------|-------------------|-----------------|
| `basicSorting/` | Simple sorting algorithms | Bubble, Selection, Insertion | O(n²) average |
| `AdvanceSorting/` | Efficient sorting | Merge sort, Quick sort | O(n log n) average |
| `CyclicSort/` | Cyclic sort pattern | Missing numbers, duplicates | O(n) for specific cases |

### Search & Optimization
| Folder | Description | Problem Types | Complexity |
|--------|-------------|---------------|------------|
| `BinarySearch/` | Binary search variations | Search in rotated array | O(log n) |
| `Recursion/` | Recursive problem solving | Tree traversal, combinations | Varies |
| `Backtracking/` | Constraint satisfaction | N-Queens, Sudoku, permutations | Exponential |

### Dynamic & Greedy
| Folder | Description | Problem Categories | Approach |
|--------|-------------|-------------------|----------|
| `DynamicProgramming/` | DP patterns, optimization | Fibonacci, knapsack, LCS | Memoization/Tabulation |
| `Greedy/` | Greedy algorithm problems | Activity selection, intervals | Local optimization |

### Specialized Techniques
| Folder | Description | Use Cases | Complexity |
|--------|-------------|-----------|------------|
| `SlidingWindows/` | Sliding window technique | Subarray problems | O(n) typically |
| `PrefixSum/` | Prefix sum applications | Range queries | O(1) query |
| `BitManipulation/` | Bit operations, tricks | XOR problems, power of 2 | O(1) operations |

## 📖 Documentation Structure

```
Notes/
├── 📊 Core Concepts/
│   ├── Core Concepts Notes.pdf
│   ├── Methods.pdf
│   └── primitive datatype and type casting.pdf
│
├── 🗄️ Data Structure Notes/
│   ├── Arrays And ArrayList.pdf
│   ├── Arrays Notes.pdf
│   ├── Linked List Notes.pdf
│   ├── Stacks Notes.pdf
│   ├── Queue Notes.pdf
│   ├── Binary Trees Notes.pdf
│   ├── Binary Search Tree Notes.pdf
│   ├── Heaps Notes.pdf
│   └── HashMaps And Sets Notes.pdf
│
├── 🔍 Algorithm Notes/
│   ├── Advance Sorting.pdf
│   ├── basic sorting and custom comparable.pdf
│   ├── Binary Search Notes And Questions.pdf
│   ├── Cycle Sort Notes.pdf
│   ├── Recursion Notes.pdf
│   ├── Dp Notes and Questions.pdf
│   └── Greedy Notes & Questions.pdf
│
└── 🎯 Problem-Specific Notes/
    ├── Stack LeetCode Questions.pdf
    ├── Queue LeetCode Questions.pdf
    ├── Binary Tree LeetCode Questions.pdf
    ├── HashMap And Sets LeetCode Questions.pdf
    └── Heaps LeetCode Questions.pdf
```

## ⚙️ Configuration & Setup

### Development Environment
```
.vscode/                    # VS Code specific settings
├── settings.json          # Editor preferences
├── launch.json            # Debug configurations
└── tasks.json             # Build tasks

.github/                    # GitHub integration
├── ISSUE_TEMPLATE/        # Issue templates
│   ├── bug_report.md     # Bug report template
│   └── feature_request.md # Feature request template
├── pull_request_template.md # PR template
└── workflows/             # GitHub Actions (future)
```

## 📋 File Naming Conventions

### LeetCode Solutions
- **Primary solution**: `leetCodeQ{number}.java`
  - Example: `leetCodeQ1.java` (Two Sum)
- **Alternative approach**: `leetCodeQ{number}M2.java`
  - Example: `leetCodeQ1M2.java` (Two Sum - Hash Map approach)
- **Optimized version**: `leetCodeQ{number}Opt.java`
  - Example: `leetCodeQ53Opt.java` (Maximum Subarray - Kadane's algorithm)
- **Specific variation**: `leetCodeQ{number}{Variation}.java`
  - Example: `leetCodeQ53MostOpt.java` (Most optimized Maximum Subarray)

### Practice Problems
- **General practice**: `practice{Description}.java`
- **Homework problems**: `hw{number}.java`
- **Algorithm implementation**: `{algorithmName}Algo.java`
  - Example: `quickSortAlgo.java`

### Topic-Specific Files
- **Basic concepts**: `basic{Concept}.java`
- **Implementation patterns**: `{concept}Implementation.java`
- **Utility files**: `{purpose}.java` (e.g., `comparatorVSComparable.java`)

## 🎯 Learning Path Integration

### Beginner Path (Weeks 1-4)
```
Start Here → Basic/ → Conditionals/ → Loops/ → arrays/ → Strings/ → Pattern_Printing/
```

### Intermediate Path (Weeks 5-12)
```
→ basicSorting/ → Linked_List/ → Stacks/ → Queue/ → Trees/ → Recursion/ → Backtracking/
```

### Advanced Path (Weeks 13-20)
```
→ AdvanceSorting/ → Binary_Search_Trees/ → DynamicProgramming/ → Graph/ → Heaps/ → Greedy/
```

## 📊 Content Statistics

| Category | Folders | Java Files | PDF Notes | LeetCode Problems |
|----------|---------|------------|-----------|-------------------|
| **Fundamentals** | 5 | 25+ | 3 | 0 |
| **Data Structures** | 8 | 120+ | 15 | 80+ |
| **Algorithms** | 8 | 75+ | 12 | 120+ |
| **Documentation** | 1 | 0 | 35+ | N/A |
| **Total** | **22** | **220+** | **65+** | **200+** |

## 🔍 Quick Navigation Guide

### By Difficulty Level
- **🟢 Beginner**: Basic/, arrays/, basicSorting/, Pattern_Printing/
- **🟡 Intermediate**: Linked_List/, Trees/, Recursion/, BinarySearch/
- **🔴 Advanced**: Graph/, DynamicProgramming/, AdvanceSorting/, Heaps/

### By Problem Type
- **Interview Prep**: arrays/, DynamicProgramming/, Trees/, Graph/
- **Competitive Programming**: BitManipulation/, SlidingWindows/, PrefixSum/
- **Academic Learning**: All folders with comprehensive notes

### By Time Commitment
- **Quick Review (< 1 hour)**: Individual LeetCode solutions
- **Topic Deep Dive (2-4 hours)**: Folder + corresponding notes
- **Complete Mastery (1-2 weeks)**: Full topic with all variations

## 🤝 Contributing to Structure

When adding new content:

1. **Follow naming conventions** outlined above
2. **Maintain folder organization** - don't create unnecessary subfolders
3. **Update this document** when adding new major sections
4. **Include both code and notes** for comprehensive coverage
5. **Tag difficulty levels** in file comments

## 🔄 Future Structure Plans

Planned additions:
- `SystemDesign/` - System design problems
- `CompetitiveProgramming/` - Contest-style problems  
- `InterviewQuestions/` - Company-specific questions
- `ProjectsShowcase/` - Complete mini-projects using DSA

---

*This structure guide is regularly updated. For the most current information, check the main repository.*
# DSA Journey: Notes and Programs
[![Ask DeepWiki](https://devin.ai/assets/askdeepwiki.png)](https://deepwiki.com/Chandrakant-Mane/DSA-Journey-Notes-and-Programs)

This repository is a comprehensive collection of my personal handwritten notes and Java programs created during my Data Structures and Algorithms (DSA) learning journey. It covers a wide range of topics, from fundamental programming concepts to advanced algorithms, and includes solutions to over 150 LeetCode problems.

## What's Inside?

This repository is structured by topic, making it easy to navigate and find code related to specific concepts.

### Core Concepts Covered:

*   **Fundamentals**:
    *   `Basic`: Core Java concepts like data types, operators, and input/output.
    *   `Oops`: Object-Oriented Programming principles including inheritance, polymorphism, and encapsulation.
    *   `Strings`: Operations and problems related to string manipulation.
    *   `BitManipulation`: Techniques for manipulating individual bits of a number.

*   **Data Structures**:
    *   `arrays` & `TwoDimensionalArray`: Implementation and problems on single and multi-dimensional arrays.
    *   `Linked_List`: Singly, Doubly, and Circular Linked Lists with various operations.
    *   `Stacks`: Array and Linked List implementations, along with classic stack-based problems.
    *   `Queue`: Array, Linked List, and Circular Queue implementations.
    *   `Heaps`: Min-Heap and Max-Heap implementations and priority queue problems.
    *   `Hashmaps`: Usage of `HashMap`, `HashSet`, and `TreeMap` for various problems.
    *   `Trees`: Binary Trees, traversals, and related problems.
    *   `Binary_Search_Trees`: BST operations, validation, and common problems.
    *   `Graph`: Graph theory concepts including BFS, DFS, Dijkstra's, Bellman-Ford, DSU, Prim's, and topological sort.

*   **Algorithms**:
    *   `basicSorting` & `AdvanceSorting`: Implementations of Bubble, Selection, Insertion, Merge, and Quick Sort.
    *   `CyclicSort`: The cyclic sort pattern and its applications.
    *   `BinarySearch`: Standard binary search and its application on the answer space.
    *   `Recursion` & `Backtracking`: Solutions to problems like N-Queens, Sudoku Solver, and permutations.
    *   `DynamicProgramming`: A large collection of DP problems solved using memoization and tabulation.
    *   `Greedy`: Classic greedy algorithm problems.
    *   `SlidingWindows` & `PrefixSum`: Techniques for efficiently solving array/string problems.

*   **Pattern Printing**:
    *   `Pattern_Printing`: A collection of programs to print various shapes and patterns using loops.

### LeetCode Solutions

A significant portion of this repository consists of solutions to LeetCode problems. These files are typically named `leetCodeQ[problem_number].java`, making it easy to find a solution for a specific problem.


## HandWritten Notes Example :- 

### Recursion (Calls And Euler's Tree) :

![repo example_1](https://github.com/user-attachments/assets/5cd2cea7-0393-4519-8497-7e964f350814)
![repo example_2](https://github.com/user-attachments/assets/2d7dc9c9-b3a6-4f4c-9113-2e608f592d11)

### MergeSort Visualization :

![repo example_3](https://github.com/user-attachments/assets/cd0a69e5-79a3-403e-8328-b4f6bbc6aa75)
![repo example_4](https://github.com/user-attachments/assets/080e8873-4834-466b-8f83-3d9a0f99cecd)

### Dynamic Programming Visualization (Tabulation) :

![repo example_5](https://github.com/user-attachments/assets/be13ae6b-0418-4631-a13e-d401911a5e98)


Complete HandWritten Notes of all Concepts in DSA . This is just and example of few topic . Explore the Repo Everytopic and EveryConcept is there . 
Enjoy .

## Code Example

Here is an example of the Quick Sort algorithm implementation found in the `AdvanceSorting` directory.

```java
package AdvanceSorting;

public class quickSortAlgo {
    public static void swap(int[] arr , int i , int j ){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
    public static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele + " ");
        }
        System.out.println();
    }
    public static int partition(int[] arr , int lo , int hi){
        int pivot = arr[lo] , pivotIdx = lo ;
        int smallerCount = 0 ;
        for (int i = lo+1; i <= hi; i++) {
            if(arr[i] <= pivot) smallerCount++ ;  
        }
        int correctIdx = pivotIdx + smallerCount ;
        swap(arr ,pivotIdx , correctIdx ) ;
        // Partition 
        int i = lo , j = hi ;
        while(i<correctIdx && j>correctIdx){
            if(arr[i] <= pivot) i++ ;
            else if(arr[j] > pivot ) j-- ;
            else if(arr[i] > pivot && arr[j] <= pivot){
                swap(arr,i,j);
            }
        }
        return correctIdx ;
    }
    public static void quickSort(int[] arr , int lo , int hi){
        if(lo>=hi) return ;
        // pivot (arr[lo]) ko sahi jagha rekho ..
        // And left part me <= pivot 
        int idx = partition(arr,lo,hi);
        quickSort(arr, lo, idx-1);
        quickSort(arr, idx+1, hi);
    }
    public static void main(String[] args) {
        int[] arr = {3,2,1,5,6,4 } ;
        print(arr);
        int n = arr.length ;
        quickSort(arr, 0 , n-1);
        print(arr);
    }
} 
```
To Understand the code , go to notes section open advanceSorting pdf understand the logic and then mote to code part . 
## Repository Structure :- 
<img width="2232" height="2506" alt="Repo Structure _- - visual selection" src="https://github.com/user-attachments/assets/e1dcd875-235b-469d-8f2d-129f1bc45bd1" />




## How to Use This Repository

Feel free to clone, fork, or download the code. You can explore the directories based on the topic you are interested in. The code is well-commented and serves as a practical reference for implementing various data structures and algorithms in Java.

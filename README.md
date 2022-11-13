# algorithms

## References

- [Tech Interview Handbook](https://www.techinterviewhandbook.org/)
- [Basecs](https://medium.com/basecs)
- [Leetcode Learn](https://leetcode.com/explore/learn/)

## Topics

- [Basics](#basics)
- [Arrays](#arrays)
- [String](#string)
- [Stack](#stack)
- [Queue](#queue)
- [LinkedList](#linkedlist)
- [Hash Table](#hash-table)
- [Tree](#tree)
- [Graph](#graph)
- [Heap](#heap)

### Basics

### Arrays

**Resources**

- [Arrays 1](https://www.geeksforgeeks.org/arrays-in-java/)
- [Arrays 2](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html)

An array is a collection of items of same data type stored at contiguous memory locations.

```java
public class Array {
    
    public static void main(String... args) {
        int[] a = new int[5];
        int[] b = new int[]{};
        int[] c = new int[]{1, 2, 3};
        
        a[2] = 5;
    }
}
```

**Time Complexity**

| Operation             | Big O     | Note                                                                             |
|-----------------------|-----------|----------------------------------------------------------------------------------|
| Access                | O(1)      |                                                                                  |
| Search                | O(n)      |                                                                                  |
| Search (sorted array) | O(log(n)) |                                                                                  |
| Insert                | O(n)      | Insertion would require shifting all the subsequent elements to the right by one |
| Insert (at the end)   | O(1)      |                                                                                  |
| Remove                | O(n)      | Removal would require shifting all the subsequent elements to the left by one    |
| Remove (at the end    | O(1)      |                                                                                  |

### String

A string is a sequence of characters. 

**Time Complexity**

| Operation                                        | Big O  | Note                                 |
|--------------------------------------------------|--------|--------------------------------------|
| Access                                           | O(1)   |                                      |
| Search                                           | O(n)   |                                      |
| Insert                                           | O(n)   |                                      |
| Remove                                           | O(n)   |                                      |
| Find substring                                   | O(n.m) | Assuming other string is of length m |
| Concatenating strings                            | O(n+m) | Assuming other string is of length m |
| Strip (removing leading and trailing characters) | O(n)   |                                      |

### Stack

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|

**Pointers for Interview**
- A

### Queue

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|

**Pointers for Interview**
- A

### LinkedList

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|

**Pointers for Interview**
- A

### Hash Table

A hash table is a data structure that can map keys to values. A hash table uses a hash function on an element to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found. During lookup, the key is hashed and the resulting hash indicates where the corresponding value is stored.

Instead of linearly searching an array every time to determine if an element is present, which takes O(n) time, we can traverse the array once and hash all the elements into a hash table.

Collisions occur whenever a hash table's hashing function generates the same index for more than one key.

**What makes a good Hash Table?**

- It should be easy to compute. Hard to compute hash functions mean that we lose any advantage for quick and efficient lookup time.
- It should avoid collision. Collisions are unavoidable but the more the collisions, the harder it is to come up with a fast, efficient algorithm for resolving them.
- It should use all the input data, and always return the same key for the same hash bucket per value.

**Time Complexity**

| Operation | Big O | Note                                                    |
|-----------|-------|---------------------------------------------------------|
| Access    | N/A   | Accessing is not possible as the hash code is not known |
| Search    | O(1)  |                                                         |
| Insert    | O(1)  |                                                         |
| Remove    | O(1)  |                                                         |

**Pointers for Interview**
- A

### Tree

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|

**Pointers for Interview**
- A

#### Binary Tree

#### Binary Search Tree

### Graph

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|

**Pointers for Interview**
- A

### Heap

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|

**Pointers for Interview**
- A

## Techniques

- [Binary Search](#binary-search)
- [Merge Sort](#merge-sort)
- [Two Pointer](#two-pointer)
- [Sliding Window](#sliding-window)
- [Recursion](#recursion)
- [Dynamic Programming](#dynamic-programming)
- [Backtracking](#backtracking)
- [Bit Manipulation](#bit-manipulation)

### Binary Search

### Merge Sort

### Two Pointer

**Resources**

- [Two Pointer Technique](https://www.codingninjas.com/codestudio/library/what-is-a-two-pointer-technique)
- [Two Pointer Technique 2](https://afteracademy.com/blog/what-is-the-two-pointer-technique)

**Two Pointer** is a technique in which two pointers iterate across the data structure until one or both of them satisfy the necessary condition. It is the use of two different pointers (usually to keep track of array or string indices) to solve a problem.

**Problem Types**

- One slow-runner and the other fast-runner.
- One pointer starts from the beginning while the other pointer starts from the end.

**Example 1: Reversing a String with two pointer technique**

```java
public class ReverseString {
    
    private void reverse(char[] str) {
        int i = 0, j = str.length - 1;
        while (i < j) {
            swap(str, i, j);
            i++;
            j--;
        }
    }
    
}
```

**Example 2: Given a sorted array A and an integer target, find if there exists `A[i]` and `A[j]` such that `A[i] + A[j] = target`, where `i != j`**

- Set pointer 1 to index `0` and pointer 2 to `len(A) - 1`, they represent the smallest and the largest integers as the array is sorted
- Compute the sum of the two numbers pointed to at each step
- If the sum is greater than the target, we need to reduce the right pointer value. If the sum is smaller than the target, we need to increase the left pointer value

```java
public class TwoSumSortedArray {
    
    private int isPairSum(int[] A,  int target) {
        
        int p1 = 0;
        int p2 = A.length - 1;
        
        while (p1 < p2) {
            if (A[p1] + A[p2] == target) return 1;
            else if (A[p1] + A[p2] < target) p1++;
            else p2--;
        }
        
        return 0;
    }
    
}
```

### Sliding Window

**Resources**

- [Sliding Window Technique](https://stackoverflow.com/a/64111403/5331198)
- [Sliding Window Technique 2](https://www.youtube.com/watch?v=MK-NZ4hN7rs)

The **Sliding Window** technique aims to reduce the time complexity of a problem by reducing use of nested loop and replace it with a single loop.

**Recognizing Sliding Window problems**

- Contiguous sequence of elements
- String, Arrays, LinkedList
- Finding minimum, maximum, longest, shortest, contained within a subset

**How to use Sliding Window technique**

- Find the size of the window
- Compute result of 1st window
- Use a loop to slide the window by 1, and keep computing the result window by window

**Example 1: Given an array of integers, calculate the sum of `k` consecutive elements in the array**

- We compute the sum of the first `k` elements out of `n` terms using a linear loop and store it as `windowSum`
- Then slide over the array by 1 element at a time, keeping track of the `maximumSum`
- To get the current `windowSum` of k elements we subtract the first element from the previous window and add the last element of the current window

```java
public class SumOfKConsecutiveElements {
    
    private int kSum(int[] arr, int k) {
        
        int len = arr.length;
        
        if (len < k) return -1;
        
        //compute sum of first window
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += arr[i];
        }

      /**
       * compute sum of remaining windows 
       * by removing the first element of previous window
       * and adding the last element of the current window
       */
      int windowSum = maxSum;
      for (int i = k; i < len; i++) {
          windowSum += arr[i] - arr[i - k];
          maxSum = Math.max(maxSum, windowSum);
      }
      
      return maxSum;
    }
}
```

### Recursion

### Dynamic Programming

### Backtracking

### Bit Manipulation

## General Tips

- Time yourself while solving problems.
- Don't jump into the problem immediately. Try to understand it and formulate a solution with the data you have.
- Ask clarifying questions about the problem or anything that you don't understand.
  - Input/Output
  - Edge cases
  - How is the input stored?
  - Ask about range of input and negative cases.
  - Can you use more memory? Or need to do it in-place?
  - Ask about duplicates, `null`, negative numbers, overflow, underflow.
- Talk out loud. Have a conversation with the interviewer.
- Write comments.
- Write compilable code. Don't use short forms.
- Test the code.
- Talk about time complexity.
- Are there any optimizations that can be done?
- Coding
  - Use `Integer.compare`, `Double.compare` for comparison.
  - Be mindful about slicing or concatenating arrays. Typically, slicing and concatenating arrays would take O(n) time. Use `start` and `end` indices to demarcate a subarray/range where possible.
  - 

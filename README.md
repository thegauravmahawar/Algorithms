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
- [Hashing](#hashing)
- [Tree](#tree)
- [Graph](#graph)
- [Heap](#heap)

### Basics

### Arrays

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|

**Pointers for Interview**
- A

### String

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|

**Pointers for Interview**
- A

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

### Hashing

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|

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

**Recognizing Sliding Window problems**

- Contiguous sequence of elements
- String, Arrays, LinkedList
- Finding minimum, maximum, longest, shortest, contained within a subset

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

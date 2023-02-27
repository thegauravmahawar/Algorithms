# algorithms

## References

- [Tech Interview Handbook](https://www.techinterviewhandbook.org/)
- [Big-O Cheatsheet](https://www.bigocheatsheet.com)
- [Basecs](https://medium.com/basecs)
- [Leetcode Learn](https://leetcode.com/explore/learn/)

## Topics

- [Basics](#basics)
- [Recursion](#recursion)
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

**Algorithms**

An algorithm is a series of contained steps, which you follow in order to achieve some goal, or to produce some output.

**Time Complexity**

**Space Complexity**

It is the memory required by an algorithm to execute a program and produce output.

For any algorithm memory is required for the following purposes:

- To store program instructions.
- To store constant values.
- To store variable values.
- Function calls, jumping statements.

Auxiliary space - It is the temporary space (excluding input size) allocated by our algorithm to solve the problem, with respect to input size.

Space complexity includes both Auxiliary space and space used by the input.

```text
//Considering n1 and n2 as Integers
//n1 = 4 bytes
//n2 = 4 bytes
//sum = 4 bytes
//Auxiliary space = 4 bytes
//Total = 16 bytes
//No matter the values of n1 and n2, the total will be 16 bytes
//This can be considered as a constant space algorithm or O(1)
function int add(n1, n2) {
    sum = n1 + n2
    return sum
} 
```

```text
//arr = N x 4 bytes
//sum = 4 bytes
//i = 4 bytes
//Auxiliary space = 4 bytes
//Total = 4N + 12 bytes = 4N + C = O(N)
function int sumOfNumbers(arr[], N) {
    sum = 0
    for (i = 0 to N) {
        sum = sum + arr[i]
    }
    return sum
}
```

```text
//fact = 4 bytes
//n = 4 bytes
//i = 4 bytes
//Auxiliary space = 4 bytes
//Note: Here we are calculating the Space complexity and not the Time complexity 
//so the loop does not count as N iterations as we are updating the same variable.
int factorial(n) {
    fact = 1;
    for (i = 1 to N) {
        fact *= i
    }
    return fact;
}
```

Recursive functions take more space as the number of recursive calls depend on the input N, and the call stack keeps increasing due to this. A single call stack will hold memory required by 1 function call.

### Recursion

**Resources**

- [Solving Recursion Problems](https://www.youtube.com/watch?v=ngCos392W4w)

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

A stack is an abstract data type that supports the operations **push** (insert a new element on the top of the stack) and **pop** (remove and return the most recently added element, the element at the top of the stack).

This behavior is commonly called LIFO (last in, first out). The name "stack" for this type of structure comes from the analogy to a set of physical items stacked on top of each other.

```java
class Stack {
    static final int MAX = 1000;
    int top;
    int a[] = new int[MAX];
    
    Stack() {
        top = -1;
    }
    
    boolean isEmpty() {
        return top < 0;
    }
    
    boolean push(int n) {
        if (top >= (MAX - 1)) {
            System.out.println("Stack Overflow");
            return false;
        } else {
            a[++top] = n;
            return true;
        }
    }
    
    int pop() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top--];
        }
    }
    
    int peek() {
        if (top < 0) {
            System.out.println("Stack Underflow");
            return 0;
        } else {
            return a[top];
        }
    }
}
```

**Time Complexity**

| Operation | Big O | Note |
|-----------|-------|------|
| Top/Peek  | O(1)  |      |
| Push      | O(1)  |      |
| Pop       | O(1)  |      |
| isEmpty   | O(1)  |      |
| Search    | O(1)  |      |

### Queue

A queue is a linear collection of elements that are maintained in a sequence and can be modified by the addition of elements at one end of the sequence (**enqueue** operation) and the removal of elements from the other end (**dequeue** operation).

**Time Complexity**

| Operation     | Big O | Note |
|---------------|-------|------|
| Enqueue/Offer | O(1)  |      | 
| Dequeue/Poll  | O(1)  |      |
| Front         | O(1)  |      |
| Back          | O(1)  |      |
| isEmpty       | O(1)  |      |

### LinkedList

Like arrays, a linked list is used to represent sequential data. It is a linear collection of data elements whose order is not given by their physical placement in memory, as opposed to arrays. Instead, each element contains an address of the next element. 

In its most basic form, each node contains: data, and a reference (in other words, a link) to the next node in the sequence.

**Time Complexity**

| Operation | Big O | Note                                                 |
|-----------|-------|------------------------------------------------------|
| Access    | O(n)  |                                                      |
| Search    | O(n)  |                                                      |
| Insert    | O(1)  | Assumes you have traversed to the insertion position | 
| Remove    | O(1)  | Assumes you have traversed to the node to be removed |

**Detect loop in a Linked List**

- Traverse linked list using two pointers
- Move one pointer by one and another pointer by two
- If these pointers meet at the same node then there is a loop

```java
class LinkedList {
    
    boolean hasCycle() {
        
        Node slow = head, fast = head;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
```

**Reverse a LinkedList**

- Initialize 3 pointers - **prev** as `null`, **curr** as `head`, and **next** as `null`
- Iterate through the linked list. In the loop, do the following:
  - Before changing the **next** to **curr**, store the **next** node
    - **next** = **curr** -> **next**
  - Now update the **next** pointer of **curr** to the **prev**
    - **curr** -> next = prev
  - Update **prev** as **curr** and **curr** as **next**
    - **prev** = **curr**
    - **curr** = **next**

```java
class LinkedList{
    
    void reverse() {
        Node prev = null;
        Node current = node;
        Node next = null;
        
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
}
```

### Hash Table

A hash table is a data structure that can map keys to values. A hash table uses a hash function on an element to compute
an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found. During
lookup, the key is hashed and the resulting hash indicates where the corresponding value is stored.

Instead of linearly searching an array every time to determine if an element is present, which takes O(n) time, we can
traverse the array once and hash all the elements into a hash table.

Collisions occur whenever a hash table's hashing function generates the same index for more than one key.

**What makes a good Hash Table?**

- It should be easy to compute. Hard to compute hash functions mean that we lose any advantage for quick and efficient
  lookup time.
- It should avoid collision. Collisions are unavoidable but the more the collisions, the harder it is to come up with a
  fast, efficient algorithm for resolving them.
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

A tree is an abstract data type that represents a hierarchical structure with a set of connected nodes. Each node in a
tree can be connected to many children, but must be connected to exactly one parent, except the root node, which has no
parent.

**Common terms**

- **Neighbor** - Parent or child of a node
- **Ancestor** - A node reachable by traversing its parent chain
- **Descendant** - A node in the node's subtree
- **Degree** - Number of children of a node
- **Distance** - Number of edges along the shortest path between two nodes
- **Level/Depth** - Number of edges along the unique path between a node and the root node
- **Width** - Number of nodes in a level

#### Binary Tree

Binary means two, so nodes in a binary tree have a maximum of two children.

**Binary Tree terms**

- Complete binary tree - Every level except possibly the last, completely filled, and all nodes in the last level are as
  far left as possible.
- Balance binary tree - A binary tree structure in which the left and the right subtrees of every node differ in height
  by no more than 1.

**Traversals**

- In-order traversal - Left -> Root -> Right
- Pre-order traversal - Root -> Left -> Right
- Post-order traversal - Left -> Right -> Root

#### Binary Search Tree

In a Binary Search Tree, all the nodes to the left of the root node must be less than the value of the root node. All
the nodes to the right of the root node must be greater than the value of the root node.

All the subtrees to the left of the node will always be smaller in value than the subtrees to the right of a node, this
applies not just to the main overarching tree structure, but to every single nested subtree as well.

**Time Complexity**

| Operation | Big O     | Note |
|-----------|-----------|------|
| Access    | O(log(n)) |      |
| Search    | O(log(n)) |      |
| Insert    | O(log(n)) |      |
| Remove    | O(log(n)) |      |

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
- [Breadth First Search](#breadth-first-search)
- [Depth First Search](#depth-first-search)
- [Merge Sort](#merge-sort)
- [Two Pointer](#two-pointer)
- [Sliding Window](#sliding-window)
- [Recursion](#recursion)
- [Dynamic Programming](#dynamic-programming)
- [Backtracking](#backtracking)
- [Bit Manipulation](#bit-manipulation)

### Binary Search

### Breadth First Search

![Level Order Traversal](assets/level_order_traversal.png)

```text
Output

1
2 3
4 5
```

```java
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {
    Node root;

    public BinarySearch() {
        root = null;
    }

    void printLevelOrder() {
        int h = height(root);
        for (int i = 1; i <= h; i++) {
            printCurrentLevel(root, i);
        }
    }

    int height(Node root) {
        if (root == null) {
            return 0;
        } else {
            int leftHeight = height(root.left);
            int rightHeight = height(root.right);

            if (leftHeight > rightHeight) {
                return leftHeight + 1;
            } else {
                return rightHeight + 1;
            }
        }
    }

    void printCurrentLevel(Node root, int level) {
        if (root == null) return;

        if (level == 1) {
            System.out.println(root.data + " ");
        } else if (level > 1) {
            printCurrentLevel(root.left, level - 1);
            printCurrentLevel(root.right, level - 1);
        }
    }
}
```

### Depth First Search

**Inorder Traversal**

- Traverse the left subtree
- Visit the root
- Traverse the right subtree

```java
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void printInOrder(Node node) {

        if (node == null) return;

        printInOrder(node.left);
        System.out.println(node.data + " ");
        printInOrder(node.right);
    }

    void printInOrder() {
        printInOrder(root);
    }
}
```

```text
Output

4 2 5 1 3
```

**Preorder Traversal**

- Visit the root
- Traverse the left subtree
- Traverse the right subtree

```java
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void printPreOrder(Node node) {

        if (node == null) return;

        System.out.println(node.data + " ");
        printInOrder(node.left);
        printInOrder(node.right);
    }

    void printPreOrder() {
        printPreOrder(root);
    }
}
```

```text
Output

1 2 4 5 3
```

**Postorder Traversal**

- Traverse the left subtree
- Traverse the right subtree
- Visit the root

```java
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree {

    Node root;

    BinaryTree() {
        root = null;
    }

    void printPostOrder(Node node) {

        if (node == null) return;

        printInOrder(node.left);
        printInOrder(node.right);
        System.out.println(node.data + " ");
    }

    void printPostOrder() {
        printPostOrder(root);
    }
}
```

```text
Output

4 5 2 1 3
```

### Merge Sort

```java
void sort(int arr[], int low, int high) {
    if (low < high) {
        int mid = low + (high - low) / 2;
        sort(arr, low, mid);
        sort(arr, mid + 1, high);
        
        merge(arr, low, mid, high);
    }    
}

void merge(int arr[], int low, int mid, int high) {
    // size of two sub arrays
    int s1 = mid - 1 + 1;
    int s2 = high - mid;
    
    // create temp arrays
    int[] L = new int[s1];
    int[] R = new int[s2];
    
    for (int i = 0; i < s1; i++) L[i] = arr[low + 1];
    for (int j = 0; j < s2; j++) R[i] = arr[mid + 1 + j];
    
    // merge the temp arrays
    int i = 0, j = 0; // initial indexes of first and second sub arrays
    int k = low;
    
    while (i < s1 && j < s2) {
        if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
        } else {
            arr[k] = R[j];
            j++;
        }
        k++;
    }
    
    // copy remaining elements of L[] if any
    while (i < s1) {
        arr[k] = L[i];
        i++;
        k++;
    }
    
    // copy remaining elements of R[] if any
    while (j < s2) {
        arr[k] = R[j];
        j++;
        k++;
    }
}
```

### Two Pointer

**Resources**

- [Two Pointer Technique](https://www.codingninjas.com/codestudio/library/what-is-a-two-pointer-technique)
- [Two Pointer Technique 2](https://afteracademy.com/blog/what-is-the-two-pointer-technique)

**Two Pointer** is a technique in which two pointers iterate across the data structure until one or both of them satisfy
the necessary condition. It is the use of two different pointers (usually to keep track of array or string indices) to
solve a problem.

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

**Example 2: Given a sorted array A and an integer target, find if there exists `A[i]` and `A[j]` such
that `A[i] + A[j] = target`, where `i != j`**

- Set pointer 1 to index `0` and pointer 2 to `len(A) - 1`, they represent the smallest and the largest integers as the
  array is sorted
- Compute the sum of the two numbers pointed to at each step
- If the sum is greater than the target, we need to reduce the right pointer value. If the sum is smaller than the
  target, we need to increase the left pointer value

```java
public class TwoSumSortedArray {

    private int isPairSum(int[] A, int target) {

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

The **Sliding Window** technique aims to reduce the time complexity of a problem by reducing use of nested loop and
replace it with a single loop.

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
- To get the current `windowSum` of k elements we subtract the first element from the previous window and add the last
  element of the current window

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

Dynamic programming is an approach to solving complex problems by breaking them down into smaller parts, and storing the result of these subproblems so that they only need to be computed once.

```java
//Recursive Approach
static int fib(int n) {
    if (n <= 1) {
        return n;    
    }
    return fib(n - 1) + fib(n - 2);
}
```

There are two different ways to store values:

- Memoization (Top-Down Approach)
- Tabulation (Bottom-Up Approach)

```java
//Memoization (Top-Down Approach)
public class Fibonacci {
    
    final int MAX = 100;
    final int NIL = -1;
    
    int[] lookup = new int[MAX];
    
    void initialize() {
        for (int i = 0; i < MAX; i++) {
            lookup[i] = NIL;
        }
    }
    
    int fib(int n) {
        if (lookup[n] == NIL) {
            if (n <= 1) {
                lookup[n] = n;
            } else {
                lookup[n] = fib[n - 1] + fib[n - 2];
            }
        }
        return lookup[n];
    }
}
```

```java
//Tabulation (Bottom-Up Approach)
public class Fibonacci {
    
    int fib(int n) {
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }
        return f[n];
    }
}
```

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
    - Be mindful about slicing or concatenating arrays. Typically, slicing and concatenating arrays would take O(n)
      time. Use `start` and `end` indices to demarcate a subarray/range where possible.

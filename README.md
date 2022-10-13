# algorithms

## Topics

- [Arrays](#arrays)
- [String](#string)
- [LinkedList](#linkedlist)
- [Tree](#tree)

### Arrays

Arrays hold value of the same type at contiguous memory locations. In an array, we're usually concerned about two things - the position/index of an element and the element itself.

#### Advantages

- Accessing elements is fast as long as you have the index.

#### Disadvantages

- Addition and removal of elements into/from the middle of an array is because the remaining elements need to be shifted to accommodate the new/missing element.
- For certain languages where the array size is fixed, we cannot alter its size after initialization.

#### Time complexity

| Operation | Big O | Note |
| Access | O(1) |  |
| Search | O(n) |  |
| Search sorted array | O(log(n)) |  |
| Insert | O(n) | Insertion would require all the subsequent elements to the right by one and that takes O(n) |
| Insert at the end | O(1) |  |
| Remove | O(n) | Removal would require shifting all subsequent elements to the left by one and that takes O(n) |

#### Things to look out for during interview

- Clarify if there are duplicate values. Would the presence of duplicate values affect the answer?
- While iterating through the array elements using an index, be careful not to go out of bounds.

#### Corner cases

- Empty array
- Sequence with 1 or 2 elements
- Sequence with repeated elements
- Duplicated values in the sequence

#### Techniques

- Sliding Window
- Two Pointers
- Traversing from the right
- Sorting the array
- Traversing the array more than once

### String



### LinkedList



### Tree


# Sorting Algorithms
There are two type of sorting algorithm.
+ Comparison-Based
+ Non-Comparison-Based
# Comparison-Based Sorting Algorithms:
## Bubble Sort:
   Compares adjacent elements and swaps them if they are in the wrong order.
   Continues until no more swaps are needed.
   Time Complexity: O(n^2) in the worst and average cases.
## Selection Sort:
   Finds the minimum element from the unsorted part and places it at the beginning.
   Repeats this process for the remaining unsorted portion.
   Time Complexity: O(n^2) in all cases.
## Insertion Sort:
   Builds the final sorted array one element at a time.
   Takes one element from the unsorted part and inserts it into its correct position in the sorted part.
   Time Complexity: O(n^2) in the worst case but efficient for small datasets.
## Merge Sort:
   Divides the array into smaller parts until each part contains one element.
   Merges these smaller parts back together in a sorted manner.
   Time Complexity: O(n log n) in all cases. Efficient for large datasets.
## Quick Sort:
   Picks an element as a pivot and partitions the array around the pivot.
   Recursively sorts the partitions until the entire array is sorted.
   Time Complexity: O(n log n) on average, O(n^2) in the worst case (rare).
## Heap Sort:
   Builds a heap from the input data and repeatedly extracts the maximum element from the heap.
   Places it at the end of the array.
   Time Complexity: O(n log n) in all cases. Efficient for sorting in-place.
# Non-Comparison-Based Sorting Algorithm:
## Counting Sort:
   Suitable for sorting integers within a specific range.
   Counts the frequency of each element and places them in the correct position based on their count.
   Time Complexity: O(n + k) where k is the range of input.
## Radix Sort:
   Sorts numbers by processing individual digits.
   Sorts the elements based on each significant digit or radix.
   Time Complexity: O(nk) where k is the average number of digits.
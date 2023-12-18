# Prefix Sum Algorithm
> Prefix sum algorithm is like keeping track of running totals as you go through a list of numbers. This helps quickly find the total of numbers between any two positions in the list without adding them up every time.
> 
# Explanation
> The below given table shows, how the prefixSum array can be created using the given array.

```java
        Input : arr[] = {2, 4, 7, 5}
        Output : prefixSum[] = {2, 6, 13, 18}
        
        | Index  | Item | prefixSum | total |
        | -----  | ---- | --------- | ----- |
        | 0      | 2    | 2         | 2     |
        | 1      | 4    | 2+4       | 6     |
        | 2      | 7    | 2+4+7     | 13    |
        | 3      | 5    | 2+4+7+5   | 18    |
```
# Pseudocode of the Prefix Sum Algorithm:
```java
        Initialization:
            Create an auxiliary array prefixSum[] of the same length as the input array arr[].
        
        Computing Prefix Sums:
            prefixSum[0] = arr[0]
            Traverse the input array arr[] from left to right.
            At each index i, calculate the prefix sum up to that index by summing all elements from index 0 to i.
            Store the cumulative sum at index i in the prefixSum[] array.
```
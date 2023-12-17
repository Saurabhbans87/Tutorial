# Kadane’s Algorithm
> [!NOTE]
> Kadane’s Algorithm is used to solve the maximum subarray problem.
> The maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional array of numbers that has the largest sum.

```java
Initialize:
    max_sum = INT_MIN
    max_sum_at_index = 0

Loop for each element of the array

  (a) max_sum_at_index = max_sum_at_index + a[i]
  (b) if(max_sum < max_sum_at_index)
        max_sum = max_sum_at_index
  (c) if(max_sum_at_index < 0)
        max_sum_at_index = 0
return max_sum
```
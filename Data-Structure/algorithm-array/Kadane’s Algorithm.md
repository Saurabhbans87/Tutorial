# Kadane’s Algorithm
> [!NOTE]
> Kadane’s Algorithm is used to solve the maximum subarray problem.
> The maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional array of numbers that has the largest sum.

```markdown
Here's a simplified explanation of Kadane's Algorithm:

Initialize two variables: max_so_far and max_ending_here to 0 or the first element of the array (if all elements are negative, this would be the maximum).

Iterate through the array:

For each element, update max_ending_here by adding the current element to it.
If max_ending_here becomes negative, reset it to 0 because a negative sum will not contribute to the maximum subarray sum.
Update max_so_far if max_ending_here is greater than max_so_far.
At the end of the iteration, max_so_far will contain the maximum subarray sum.


```

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
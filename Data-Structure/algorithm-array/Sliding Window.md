# Sliding Window
> [!NOTE]
> The sliding window technique is a powerful algorithmic approach used to solve problems where you need to perform 
> operations on a specific range or window within an array, string, or sequence.

```markdown
Sliding window algorithm is a problem solving technique that transforms two nested loops into one loop. 
It can reduce the time complexity to O(n).
```
> [!TIP]
> The sliding window algorithm is a technique for finding sub arrays or subsequences that fulfill a certain condition within array or sequence.
> 
> It involves creating a window of a fixed size and moving that window through the array step by step, updating it according to certain rules or conditions.

There are different types of sliding window algorithms based on the specific problem they aim to solve.
    + Fixed Size Window
    + Variable Size Window
    + Two Pointers or Dual Sliding Windows
    + Optimized Sliding Windows

# Pseudo-Code
```java
function slidingWindowAlgorithm(Array arr, Integer windowSize):
    maxSum = 0

    // Calculate the sum of the first window
    for i from 0 to windowSize-1:
        maxSum += arr[i]

    currentSum = maxSum

    // Iterate through the array to find the maximum sum
    for i from windowSize to arr.length-1:
        currentSum = currentSum - arr[i - windowSize] + arr[i]
        maxSum = max(maxSum, currentSum)

    return maxSum

```


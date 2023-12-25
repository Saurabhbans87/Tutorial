# Sliding Window
> [!NOTE]
> The sliding window technique is a powerful algorithmic approach used to solve problems where you need to perform 
> operations on a specific range or window within an array, string, or sequence.

```markdown
Sliding window algorithm is a problem solving technique that transforms two nested loops into one loop. 
It can reduce the time complexity to O(n).
```
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


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

    // first in first Calculate the window sum of the first window
    for i from 0 to windowSize-1:
        windowSum += arr[i]

    currentSum = windowSum

    // Iterate through the array to find the new window Sum
    for i from windowSize to arr.length-1:
        currentSum = currentSum - arr[i - windowSize] + arr[i]
        maxSum = max(windowSum, currentSum)

    return windowSum

```


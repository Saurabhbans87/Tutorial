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

# Sliding Window Type
There are different types of sliding window algorithms based on the specific problem they aim to solve.
+ Fixed Size Window
+ Dynamic Sliding Window or Variable Size Window
+ Two Pointers or Dual Sliding Windows
+ Optimized Sliding Windows

## Fixed Size Window
    The window size remains constant throughout the process. 
    It slides through the array or string, and computations are performed within this fixed-size window.
## Variable Size Window
    Here, the window size can change based on certain conditions or requirements. 
    The window expands or contracts dynamically based on the problem's constraints.
## Two Pointers or Dual Sliding Windows
    In certain cases, two pointers or windows are used simultaneously to traverse the array or string. 
    These pointers may move at different speeds or in different directions based on the problem.
## Optimized Sliding Windows
    Techniques that involve optimizing the sliding window approach by reducing unnecessary calculations or iterations.

# Pseudo-Code:Fixed Size Window
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
# Pseudo-Code:Variable Size Window
```java
variableSizeSlidingWindow(arr, target):
    n = length of arr
    left = 0
    windowSum = 0
    minLength = Integer.MAX_VALUE
    for right from 0 to n-1:
        // Expand the window by including the element at right
        windowSum += arr[right]
        // Shrink the window as small as possible until the sum is less than or equal to target
        while windowSum >= target:
            minLength = min(minLength, right - left + 1)
            windowSum -= arr[left]
            left++
    // If no subarray found, return 0; otherwise, return the minLength
    return minLength == Integer.MAX_VALUE ? 0 : minLength;
```
# Pseudo-Code:Two Pointers or Dual Sliding Windows
```java
twoPointersAlgorithm(arr, target):
    left = 0
    right = length of arr - 1
    while (left < right)
        currentSum = arr[left] + arr[right]
        if currentSum equals target:
            // Pair found, return or perform necessary operations
        if currentSum < target:
            // Move the left pointer to increase the sum
            left++
        else:
            // Move the right pointer to decrease the sum
            right--
    // If no pair found, return appropriate result
```

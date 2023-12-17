# Kadane’s Algorithm
> [!NOTE]
> Kadane’s Algorithm is used to solve the maximum subarray problem.
> The maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional array of numbers that has the largest sum.

# Pseudocode:
```java
Initialize:
    max_sum = INT_MIN
    max_sum_at_index = 0
        
Iterate through the array
  (a) max_sum_at_index = max_sum_at_index + a[i]
  (b) if(max_sum < max_sum_at_index)
        max_sum = max_sum_at_index
  (c) if(max_sum_at_index < 0)
        max_sum_at_index = 0
        
return max_sum
```
# Explanataion:
```java
Here's a simplified explanation of Kadane's Algorithm:

Initialize two variables: max_sum and max_sum_at_index to 0 or the first element of the array.

Iterate through the array:

        (a) For each element, update max_ending_here by adding the current element to it.
        (b) Update max_sum if max_sum_at_index is greater than max_sum.
        (c) If max_sum_at_index becomes negative, reset it to 0 because a negative sum will not contribute to the maximum subarray sum.
        
At the end of the iteration, max_sum will contain the maximum subarray sum.


```
# Kadane’s Algorithm Implementation in Java
```java
public class Kadane {
    public static void main(String[] args) {
        int[] arr = {-3, 2, -1, 6, 3, -6, 2, -1, -3};
        int maximumSubarraySum = maxSubArrayProblem(arr);
        System.out.println("Kadane’s Algorithm maximum sum of a subarray is: " + maximumSubarraySum);
    }

    private static int maxSubArrayProblem(int[] arr) {
        int max_sum = 0;
        int max_sum_at_index = 0;
        for (int i = 0; i < arr.length; i++){
            max_sum_at_index = max_sum_at_index + arr[i];
            if(max_sum < max_sum_at_index){
                max_sum = max_sum_at_index;
            }
            if(max_sum_at_index < 0){
                max_sum_at_index = 0;
            }
        }
        return max_sum;
    }
}
```
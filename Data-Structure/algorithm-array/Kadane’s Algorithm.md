# Kadane’s Algorithm
> [!NOTE]
> Kadane’s Algorithm is used to solve the maximum subarray problem.
> 
> The maximum subarray problem is the task of finding the contiguous subarray within a one-dimensional array of numbers that has the largest sum.

# Pseudocode:
```java
Initialize:
    max_sum = arr[0]
    max_sum_at_index = arr[0]
        
Iterate through the array 
        max_sum_at_index = Math.max(arr[i], max_sum_at_index + arr[i]);
        max_sum = Math.max(max_sum, maxEndingHere);
return max_sum
```

# Implementation in Java
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
            max_sum_at_index = Math.max(arr[i], max_sum_at_index + arr[i]);
            max_sum = Math.max(max_sum,max_sum_at_index);
        }
        return max_sum;
    }
}
```
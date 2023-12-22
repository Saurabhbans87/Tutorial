# Counting Zeros and Ones:
> [!NOTE]
> Count the number of 0s and 1s in the array.
> 
> Replace the first count number of elements with 0s and the rest with 1s.
```java
private static int[] countingZerosAndOnes(int[] array) {
        int length = array.length;
        int zeroCount = 0;
        for(int i=0; i <length; i++){
            if(array[i] == 0){
                zeroCount++;
            }
        }
        for (int i=0 ; i<zeroCount ;i++){
            array[i] = 0;
        }
        for(int i = zeroCount ; i<length ;i++){
            array[i] = 1;
        }
        return array;
    }
```
# Two-Traversal Approach
> [!NOTE]
> Count the number of 0s (count) in the array.
> 
```java
private static int[] segregateTwoTraversalApproach(int[] array) {
        int zeroCount=0;
        for(int i=0;i< array.length;i++){
            if(array[i]==0){
                zeroCount++;;
            }
        }
        for(int i =0 ;i< array.length ;i++){
            if(zeroCount>0){
                array[i]=0;
                zeroCount--;
            }else {
                array[i]=1;
            }
        }
        return array;
    }
```
> Traverse the array and replace the first count elements with 0s and the rest with 1s.
# Dutch National Flag Algorithm
> [!NOTE]
> Dutch National Flag Algorithm, also known as the 3-way Partitioning.
> 
> This is used for sorting arrays containing only three unique elements (colors, digits, etc.). 
> 
> It partitions the array into three parts based on a pivot element and sorts them.
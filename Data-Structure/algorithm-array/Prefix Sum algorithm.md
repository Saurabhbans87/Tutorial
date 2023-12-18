# Prefix Sum Algorithm
> Prefix sum algorithm is like keeping track of running totals as you go through a list of numbers. This helps quickly find the total of numbers between any two positions in the list without adding them up every time.
> 

```markdown
Input : a[] = {2, 4, 7, 5}
        Output : prefixSum[] = {2, 6, 13, 18}
        Explanation : The below given table shows, how the prefixSum array can be created using the given array.
        
        | i  | Item | prefixSum | total |
        | -- | ---- | --------- | ----- |
        | 0  | 2    | 2         | 2     |
        | 1  | 4    | 2+4       | 6     |
        | 2  | 7    | 2+4+7     | 13    |
        | 3  | 5    | 2+4+7+5   | 18    |
```
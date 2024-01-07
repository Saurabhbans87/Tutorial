# Monotonic Stack
A monotonic stack is a variation of a stack that maintains a specific order of elements, either strictly increasing or strictly decreasing, as elements are pushed onto it. 
The main idea is to preserve this order to efficiently find the next greater or smaller element for each element in an array.

# Key Features
+ Increasing Monotonic Stack
    + Elements are pushed onto the stack while maintaining a strictly increasing order. When a smaller element is encountered, it pops elements from the stack until the condition of increasing order is satisfied.
    + Useful for finding the next greater element to the right/left for each element in an array.
+ Decreasing Monotonic Stack
    + Elements are pushed onto the stack while maintaining a strictly decreasing order. When a larger element is encountered, it pops elements from the stack until the condition of decreasing order is satisfied.
    + Useful for finding the next smaller element to the right/left for each element in an array.
# Applications
+ Finding Next Greater/Smaller Elements
  + Efficiently find the next greater or smaller element for each element in an array using monotonic stacks.
+ Histogram Area Calculation
  + Calculate the largest rectangular area in a histogram using a decreasing monotonic stack.
+ Stock Span Problem
  + Solve the stock span problem, where the task is to find the span (number of consecutive days) for which the stock price was less than or equal to the current day's price.
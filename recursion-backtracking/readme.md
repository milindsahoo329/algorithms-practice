# Recursion & Backtracking

## Basics

A recursive function should have the following properties so that it does not result in an infinite loop -

1. A simple base case (or cases) — a terminating scenario that does not use recursion to produce an answer.
2. A set of rules, also known as recurrence relation that reduces all other cases towards the base case

### Tasks done

```java
Recursively print reverse of a string
Recursively reverse a character array without extra memory
Recursively find out result of a number raised to certain power
Recursive code for merging two linked lists
Recursive code for finding unique binary trees
```

## Recurrence Relations

There are two important things that one needs to figure out before implementing a recursive function -

1. Recurrence relation: the relationship between the result of a problem and the result of its subproblems.
2. Base case: the case where one can compute the answer directly without any further recursion calls. 

Once we figure out the above two elements, to implement a recursive function we simply call the function itself according to the recurrence relation until we reach the base case.

### Tasks done

```java
Recursively print pascals triangle
Iteratively print pascals triangle
Recursive code for Kth Grammmar
```

## Memoization
To eliminate the duplicate calculation in the above case, as many of you would have figured out, one of the ideas would be to store the intermediate results in the cache so that we could reuse them later without re-calculation.
This idea is also known as memoization, which is a technique that is frequently used together with recursion.

```java
Recursively find Fibonacci Number
Climbing Stairs Problem With Memoization
```

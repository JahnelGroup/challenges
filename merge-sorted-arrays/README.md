# Merge Sorted Arrays Challenge

Write a program that merges two sorted arrays.

The function will take 3 parameters:

* **int[] src1** - The first sorted array of int's (smallest to largest)
* **int[] src2** - The second sorted array of int's (smallest to largest)
* **int[] dest** - The destination for the merged sorted results. The destination array is guaranteed to have enough space to store the results. The resulting array must retain sorting from smallest to largest.

Duplicates numbers are allowed and should be positioned next to each into the array.

For example: [1, 4, 4, 6, 7, 7] is a perfectly sorted array.

## Example Output

Given these two arrays:

```java
int[]{0, 2, 2, 6, 8, 8, 11}
int[]{0, 3, 6, 7, 10, 11}
```

The resulting int[] dest array should be

```java
[0, 0, 2, 2, 3, 6, 6, 7, 8, 8, 10, 11, 11]
```

## Run the J-Unit 

You can test your answer by running the J-Unit with gradle:

```bash
$ gradle test -i
```

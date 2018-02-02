package com.jahnelgroup.challenges.mergesortedarrays;

import java.util.Arrays;

/**
 * Merge Sorted Arrays Challenge
 *
 * Write a program that merges two sorted arrays.
 *
 * You function will take 3 parameters:
 *
 *      src1 - The first sorted array of int's (smallest to largest)
 *
 *      src2 - The second sorted array of int's (smallest to largest)
 *
 *      dest - The destination for the merged sorted results. The destination array
 *             is guaranteed to have enough space to store the results. The resulting
 *             array must retain sorting from smallest to largest.
 *
 * Duplicates numbers are allowed and should be positioned next to each into the array.
 *
 * For example: [1, 4, 4, 6, 7, 7] is a perfectly sorted array.
 *
 */
public class MergeSortedArraysChallenge {

    public static void main(String[] args) {
        System.out.println("======================================");
        System.out.println("Merge Sorted Arrays Challenge");
        System.out.println("======================================");

        int[] src1 = new int[]{0, 2, 2, 6, 8, 8, 11};
        int[] src2 = new int[]{0, 3, 6, 7, 10, 11};
        int[] dest = new int[src1.length + src2.length];

        new MergeSortedArraysChallenge().mergeSortedArrays(src1, src2, dest);

        System.out.println("Result: " + Arrays.toString(dest));

        // dest should be [0, 0, 2, 2, 3, 6, 6, 7, 8, 8, 10, 11, 11]
    }

    void mergeSortedArrays(int[] src1, int[] src2, int[] dest){

        // write your logic here

    }

}

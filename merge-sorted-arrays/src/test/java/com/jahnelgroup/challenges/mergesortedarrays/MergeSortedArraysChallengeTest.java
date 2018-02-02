package com.jahnelgroup.challenges.mergesortedarrays;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;

@RunWith(BlockJUnit4ClassRunner.class)
public class MergeSortedArraysChallengeTest {

    MergeSortedArraysChallenge challenge = new MergeSortedArraysChallenge();

    @Test
    public void test(){
        int[] src1 = new int[]{0, 2, 2, 6, 8, 8, 11};
        int[] src2 = new int[]{ 0 ,3 ,6 ,7 ,10 ,11     };
        int[] dest = new int[src1.length + src2.length];

        challenge.mergeSortedArrays(src1, src2, dest);

        assertThat(dest).containsExactly(0, 0, 2, 2, 3, 6, 6, 7, 8, 8, 10, 11, 11);
    }


}

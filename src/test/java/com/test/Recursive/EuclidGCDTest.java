package com.test.Recursive;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class EuclidGCDTest {

    @Test
    public void getGCD() {
        int a = 8, b = 6;
        assertThat(EuclidGCD.getGCD(a,b)).isEqualTo(2);
        assertThat(EuclidGCD.getGCD(b,a)).isEqualTo(2);
        assertThat(EuclidGCD.getGCD(3,7)).isEqualTo(1);
    }

    @Test
    public void getArrayGCD(){
        int[] arr = {6,8,22,4,14};
        int[] arr2 = {3,6,9,33};
        int[] arr3 = {6,8,22,4,14,3,6,9,33};
        assertThat(EuclidGCD.getArrayGCD(arr)).isEqualTo(2);
        assertThat(EuclidGCD.getArrayGCD(arr2)).isEqualTo(3);
        assertThat(EuclidGCD.getArrayGCD(arr3)).isEqualTo(1);
    }
}
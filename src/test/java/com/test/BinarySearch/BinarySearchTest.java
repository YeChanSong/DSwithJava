package com.test.BinarySearch;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void binarySearch() {
        int[] arr1 = new int[20];

        for(int i=0;i<20;i++){
            arr1[i] = i;
        }
        int target = 8;
        assertThat(target).isEqualTo(BinarySearch.binarySearch(arr1,target));
        assertThat(0).isEqualTo(BinarySearch.binarySearch(arr1,0));
        assertThat(19).isEqualTo(BinarySearch.binarySearch(arr1,19));
    }
}
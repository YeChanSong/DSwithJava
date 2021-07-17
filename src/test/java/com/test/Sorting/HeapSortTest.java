package com.test.Sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class HeapSortTest {

    @Test
    public void heapSort() {
        Random rand = new Random(System.currentTimeMillis());
        int[] arr = new int[20];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<20;i++){
            arr[i] = rand.nextInt(100);
            sb.append(arr[i]).append(' ');
        }
        int[] comp = arr.clone();
        Arrays.sort(comp);
        System.out.println(sb.toString());
        sb = new StringBuilder();
        for(int i=0;i<20;i++){
            sb.append(comp[i]).append(' ');
        }
        System.out.println(sb.toString());
        sb = new StringBuilder();
        arr = HeapSort.heapSort(arr);
        for(int i=0;i<20;i++){
            sb.append(arr[i]).append(' ');
            assertThat(comp[i]).isEqualTo(arr[i]);
        }
        System.out.println(sb.toString());
    }
}
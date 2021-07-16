package com.test.Sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class InsertionSortTest {

    @Test
    public void insertionSort() {
        int[] arr = new int[20];
        Random rand = new Random(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<20;i++){
            arr[i] = rand.nextInt(100);
            sb.append(arr[i]).append(" ");
        }
        sb.append('\n');
        System.out.println(sb.toString());
        int[] res = InsertionSort.insertionSort(arr.clone());
        Arrays.sort(arr);
        sb = new StringBuilder();
        for(int i=0;i<20;i++){
            sb.append(res[i]).append(' ');
        }
        sb.append('\n');
        System.out.println(sb.toString());
        sb = new StringBuilder();
        for(int i=0;i<20;i++)
            sb.append(arr[i]).append(" ");
        sb.append('\n');
        System.out.println(sb.toString());
        for(int i=0;i<20;i++){
            assertThat(arr[i]).isEqualTo(res[i]);
        }
    }
}
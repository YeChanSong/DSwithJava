package com.test.Sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class CountingSortTest {

    @Test
    public void countingSort() {
        Random rand = new Random(System.currentTimeMillis());
        int[] arr = new int[20];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++) {
            arr[i] = rand.nextInt(100);
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb.toString());
        int[] cmp = arr.clone();
        sb = new StringBuilder();
        Arrays.sort(cmp);
        for(int i:cmp)
            sb.append(i).append(' ');
        System.out.println(sb.toString());
        arr = CountingSort.countingSort(arr, Arrays.stream(arr).max().getAsInt());
        sb = new StringBuilder();
        for(int i=0;i<20;i++) {
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb.toString());
        for(int i=0;i<20;i++)
            assertThat(arr[i]).isEqualTo(cmp[i]);
    }
}
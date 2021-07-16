package com.test.Sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;
import static org.assertj.core.api.Assertions.assertThat;

public class QuickSortTest {

    @Test
    public void quickSort() {
        Random rand = new Random(System.currentTimeMillis());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[20];
        for(int i=0;i<20;i++){
            arr[i] = rand.nextInt(100);
            sb.append(arr[i]).append(' ');
        }
        System.out.println(sb.toString());
        int[] comp = arr.clone();
        Arrays.sort(comp);
        QuickSort.quickSort(arr,0,arr.length-1);
        sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0;i<20;i++){
            sb.append(arr[i]).append(" ");
            sb2.append(comp[i]).append(" ");
        }
        System.out.println(sb.toString());
        System.out.println(sb.toString());
        for(int i=0;i<20;i++){
            assertThat(arr[i]).isEqualTo(comp[i]);
        }


    }
}
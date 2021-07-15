package com.test.Sorting;

import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class SelectionSortTest {

    @Test
    public void selectionSort() {
        Random rand = new Random(System.currentTimeMillis());
        int[] arr = new int[20];
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<20;i++){
            arr[i] = rand.nextInt(100);
            sb.append(arr[i]).append(' ');
        }
        String original = sb.toString().strip();
        System.out.println(original);
        int[] arr2 = SelectionSort.selectionSort(arr);
        sb = new StringBuffer();
        for(int i=0;i<20;i++)
            sb.append(arr2[i]).append(' ');
        System.out.println(sb.toString().strip());
        Arrays.sort(arr);
        assertThat(arr).isEqualTo(arr2);

    }
}
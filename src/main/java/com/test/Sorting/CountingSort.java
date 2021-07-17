package com.test.Sorting;

public class CountingSort {

    public static int[] countingSort(int[] arr, int max){
        int[] counter = new int[max+1];
        int[] ret = new int[arr.length];

        for(int i: arr)
            counter[i]++;
        for(int i=0;i<max;i++)
            counter[i+1] += counter[i];
        for(int i=arr.length-1;i>-1;i--){
            ret[(counter[arr[i]]--)-1] = arr[i];
        }
        return ret;
    }


}

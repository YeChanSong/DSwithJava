package com.test.Sorting;

public class QuickSort {

    public static void quickSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        int part = partition(arr,start,end);
        quickSort(arr,start,part-1);
        quickSort(arr,part+1,end);
    }

    public static int partition(int[] arr, int start, int end){
        int left = start, right = end, tmp;
        int pivot = arr[start];
        while(left<right){
            while(arr[right]>pivot)
                right--;
            while(arr[left]<=pivot && left<right)
                left++;
            if(left<=right){
                tmp = arr[left];
                arr[left] = arr[right];
                arr[right] = tmp;
            }
        }
        arr[start] = arr[left];
        arr[left] = pivot;
        return left;
    }
}

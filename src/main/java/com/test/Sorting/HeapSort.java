package com.test.Sorting;

public class HeapSort {

    public static int[] heapSort(int[] arr){
        int n = arr.length/2-1, tmp;
        for(int i=n; i>-1;i--){
            heapify(arr,i,arr.length);
        }
        for(int i=arr.length-1;i>0;i--){
            tmp = arr[i];
            arr[i] = arr[0];
            arr[0] = tmp;
            heapify(arr,0,i);
        }
        return arr;
    }
    public static void heapify(int[] arr, int idx, int hsize){
        int lchild = idx*2+1, rchild = idx*2+2, max=idx,tmp;
        
        if(lchild<hsize && arr[max]<arr[lchild])
            max = lchild;
        if(rchild<hsize &&arr[max]<arr[rchild])
            max = rchild;
        if(idx != max) {
            tmp = arr[idx];
            arr[idx] = arr[max];
            arr[max] = tmp;
            heapify(arr,max,hsize);
        }
    }
}

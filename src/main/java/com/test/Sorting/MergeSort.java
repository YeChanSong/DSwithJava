package com.test.Sorting;

public class MergeSort {

    public static int[] mergeSort(int[] arr,int start, int end){
        if(start==end){
            return new int[] {arr[start]};
        }
        int mid = (start+end)/2;
        return merge(
                mergeSort(arr,start,mid),
                mergeSort(arr,mid+1,end)
        );
    }
    public static int[] merge(int[] left, int[] right){
        int l=0, r=0, cnt=0;
        int[] ret = new int[left.length+right.length];
        while(l<left.length && r<right.length){
            if(left[l]<=right[r]){
                ret[cnt] = left[l];
                cnt++; l++;
            }
            else{
                ret[cnt] = right[r];
                cnt++; r++;
            }
        }
        while(l<left.length){
            ret[cnt] = left[l];
            cnt++;l++;
        }
        while(r<right.length){
            ret[cnt] = right[r];
            cnt++;r++;
        }
        return ret;
    }

}

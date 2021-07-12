package com.test.BinarySearch;

import org.junit.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

public class ClassBinarySearchTest {

    @Test
    public void classBinTest_VISION_ORDER(){
        String[] names = {"이나령","유지훈","김한결","홍준기","전서현","이호연","이수민"};
        int[] heights = {162,168,169,171,173,174,175};
        double[] visions = {0.3,0.4,0.8,1.5,0.7,1.2,2.0};
        ClassBinarySearch.PhyscData[] arr = new ClassBinarySearch.PhyscData[7];
        for(int i=0;i<7;i++){
            arr[i] = new ClassBinarySearch.PhyscData(names[i],heights[i],visions[i]);
        }
        Arrays.sort(arr, ClassBinarySearch.PhyscData.VISION_ORDER);
        int idx = Arrays.binarySearch(
                arr,
                new ClassBinarySearch.PhyscData("",0,0.7),
                ClassBinarySearch.PhyscData.VISION_ORDER);

        assertThat(2).isEqualTo(idx);
    }

    @Test
    public void classBinTest_HEIGHT_ORDER(){
        String[] names = {"이나령","유지훈","김한결","홍준기","전서현","이호연","이수민"};
        int[] heights = {162,168,169,171,173,174,175};
        double[] visions = {0.3,0.4,0.8,1.5,0.7,1.2,2.0};
        ClassBinarySearch.PhyscData[] arr = new ClassBinarySearch.PhyscData[7];
        for(int i=0;i<7;i++){
            arr[i] = new ClassBinarySearch.PhyscData(names[i],heights[i],visions[i]);
        }
        Arrays.sort(arr, ClassBinarySearch.PhyscData.HEIGHT_ORDER);
        int idx = Arrays.binarySearch(
                arr,
                new ClassBinarySearch.PhyscData("",175,0.0),
                ClassBinarySearch.PhyscData.HEIGHT_ORDER);

        assertThat(6).isEqualTo(idx);
    }

}
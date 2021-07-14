package com.test.Recursive;

public class EuclidGCD {

    public static int getGCD(int a, int b){
        if(b == 0)
            return a;
        else
            return getGCD(b,a%b);
    }

    public static int getArrayGCD(int[] arr){
        int gcd =arr[0];
        for(int i =1;i<arr.length;i++){
            gcd = getGCD(gcd,arr[i]);
        }
        return gcd;
    }
}

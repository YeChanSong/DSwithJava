package com.test.Recursive;

public class EuclidGCD {

    public static int getGCD(int a, int b){
        if(b == 0){
            return a;
        }
        else{
            return getGCD(b,a%b);
        }
    }
}

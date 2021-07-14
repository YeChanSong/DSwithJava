package com.test.Recursive;

import org.junit.Test;
import static org.assertj.core.api.Assertions.*;

public class EuclidGCDTest {

    @Test
    public void getGCD() {
        int a = 8, b = 6;
        assertThat(EuclidGCD.getGCD(a,b)).isEqualTo(2);
        assertThat(EuclidGCD.getGCD(b,a)).isEqualTo(2);
        assertThat(EuclidGCD.getGCD(3,7)).isEqualTo(1);
    }
}
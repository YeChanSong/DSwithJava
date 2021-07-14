package com.test.Recursive;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class NQueenTest {

    @Test
    public void nQueen() {
            for(int t=1;t<15;t++) {
                NQueen nq = new NQueen(t);
                nq.setN(t);
                for (int i = 0; i < t; i++)
                    nq.nQueen(0, i);

                if (t == 1)
                    assertThat(nq.getAnswer()).isEqualTo(1);
                else if (t == 2)
                    assertThat(nq.getAnswer()).isEqualTo(0);
                else if (t == 3)
                    assertThat(nq.getAnswer()).isEqualTo(0);
                else if (t == 4)
                    assertThat(nq.getAnswer()).isEqualTo(2);
                else if (t == 5)
                    assertThat(nq.getAnswer()).isEqualTo(10);
                else if (t == 6)
                    assertThat(nq.getAnswer()).isEqualTo(4);
                else if (t == 7)
                    assertThat(nq.getAnswer()).isEqualTo(40);
                else if (t == 8)
                    assertThat(nq.getAnswer()).isEqualTo(92);
                else if (t == 9)
                    assertThat(nq.getAnswer()).isEqualTo(352);
                else if (t == 10)
                    assertThat(nq.getAnswer()).isEqualTo(724);
                else if (t == 11)
                    assertThat(nq.getAnswer()).isEqualTo(2680);
                else if (t == 12)
                    assertThat(nq.getAnswer()).isEqualTo(14200);
                else if (t == 13)
                    assertThat(nq.getAnswer()).isEqualTo(73712);
                else
                    assertThat(nq.getAnswer()).isEqualTo(365596);
            }

    }
}
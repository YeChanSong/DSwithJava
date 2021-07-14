package com.test.Recursive;

public class NQueen {
    // nQueen Problem
    int[] pos; // ypos: index, xpos: pos[index]
    int cnt = 0;
    int N;
    public NQueen(int N){
        this.N = N;
        pos = new int[N];
    }

    public void nQueen(int y, int x){
        // check another queens position
        for(int i=0;i<y;i++){
            if((pos[i] == x) || (i+pos[i] == y+x) || (i-pos[i] == y-x)){
                // xpos || ll->ur diagonal || ul->lr diagonal overlap
                return;
            }
        }
        if(y==N-1){
            cnt++;
            return;
        }
        pos[y] = x;
        for(int i=0;i<N;i++){
            nQueen(y+1,i);
        }
    }
    public int getAnswer(){
        return cnt;
    }
    public void setN(int n){
        N = n;
    }

}

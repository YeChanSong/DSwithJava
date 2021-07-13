package com.test.StackQueue;

import org.junit.Test;


import static org.assertj.core.api.Assertions.*;

public class StackTest {

    Stack<Integer> stack = new Stack<>(5);

    @Test
    public void push() {
        for(int i=0;i<5;i++){
            assertThat(stack.push(i)).isEqualTo(i);
        }
    }

    @Test
    public void pop() {
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        for(int i=0;i<5;i++){
            assertThat(stack.pop()).isEqualTo(4-i);
        }
    }

    @Test
    public void peek(){
        for(int i=0;i<5;i++)
            stack.push(i);
        for(int i=0;i<5;i++){
            assertThat(stack.peek()).isEqualTo(4-i);
            stack.pop();
        }
    }

    @Test
    public void indexOf(){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        for(int i=0;i<5;i++){
            assertThat(stack.indexOf(i)).isEqualTo(i);
        }
        assertThat(stack.indexOf(100)).isEqualTo(-1);
    }

    @Test
    public void clear(){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
        stack.clear();
        for(int i=0;i<5;i++){
            assertThat(stack.indexOf(i)).isEqualTo(-1);
        }
    }

    @Test
    public void capacity(){
        for(int i=0;i<5;i++){
            stack.push(i);
            assertThat(stack.capacity()).isEqualTo(5);
        }
    }

    @Test
    public void size(){
        for(int i=0;i<5;i++){
            stack.push(i);
            assertThat(stack.size()).isEqualTo(i+1);
        }
    }

    @Test
    public void isEmpty(){
        assertThat(stack.isEmpty()).isEqualTo(true);
        for(int i=0;i<5;i++){
            stack.push(i);
            assertThat(stack.isEmpty()).isEqualTo(false);
        }
    }

    @Test
    public void isFull(){
        assertThat(stack.isFull()).isEqualTo(false);
        for(int i=0;i<4;i++){
            stack.push(i);
            assertThat(stack.isFull()).isEqualTo(false);
        }
        stack.push(-1);
        assertThat(stack.isFull()).isEqualTo(true);
    }

    @Test
    public void dump(){
        StringBuilder sb = new StringBuilder();
        Stack<String> stk = new Stack<>(5);
        for(int i=0;i<5;i++){
            stk.push("s");
            sb.append("stk[").append(i).append("]: ").append("s").append('\n');
        }
        assertThat(stk.dump()).isEqualTo(sb.toString());
    }

}
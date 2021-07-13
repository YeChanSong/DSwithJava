package com.test.StackQueue;

import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class QueueTest {
    Queue<Integer> q = new Queue<>(5);

    @Test
    public void enqueue(){
        for(int i=0;i<5;i++){
            assertThat(q.enque(i)).isEqualTo(i);
        }
    }

    @Test
    public void deque(){
        for(int i=0;i<5;i++){
            q.enque(i);
        }
        for(int i=0;i<5;i++){
            assertThat(i).isEqualTo(q.deque());
        }
    }

    @Test
    public void peek(){
        for(int i=0;i<5;i++){
            q.enque(i);
        }
        for(int i=0;i<5;i++){
            assertThat(i).isEqualTo(q.peek());
            q.deque();
        }
    }

    @Test
    public void indexOf(){
        for(int i=0;i<5;i++){
            q.enque(i);
        }
        for(int i=0;i<5;i++){
            assertThat(q.indexOf(i)).isEqualTo(i);
        }
        assertThat(q.indexOf(1000)).isEqualTo(-1);
    }

    @Test
    public void clear(){
        for(int i=0;i<5;i++){
            q.enque(i);
        }
        q.clear();
        for(int i=0;i<5;i++)
            assertThat(-1).isEqualTo(q.indexOf(i));
    }

    @Test
    public void capacity(){
        assertThat(5).isEqualTo(q.capacity());
        for(int i=0;i<5;i++){
            q.enque(i);
            assertThat(5).isEqualTo(q.capacity());
        }
    }

    @Test
    public void size(){
        assertThat(0).isEqualTo(q.size());
        for(int i=0;i<5;i++){
            q.enque(i);
            assertThat(i+1).isEqualTo(q.size());
        }
    }

    @Test
    public void isEmpty(){
        assertThat(true).isEqualTo(q.isEmpty());
        for(int i=0;i<5;i++){
            q.enque(i);
            assertThat(false).isEqualTo(q.isEmpty());
        }
    }

    @Test
    public void isFull(){
        assertThat(false).isEqualTo(q.isFull());
        for(int i=0;i<4;i++){
            q.enque(i);
            assertThat(false).isEqualTo(q.isFull());
        }
        q.enque(-1);
        assertThat(true).isEqualTo(q.isFull());
    }

    @Test
    public void dump(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<5;i++){
            q.enque(i);
            sb.append("que[").append(i).append("]: ").append(i).append("\n");
        }
        assertThat(sb.toString()).isEqualTo(q.dump());
    }
}
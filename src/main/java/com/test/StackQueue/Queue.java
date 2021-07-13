package com.test.StackQueue;

public class Queue<E> {
    private int max;
    private int front;
    private int rear;
    private int num; // number of data
    private E[] q;

    public Queue(int capacity){
        this.max = capacity;
        this.front = 0;
        this.rear = 0;
        this.num = 0;
        this.q = (E[]) new Object[max];
    }

    public static class EmptyQueueException extends RuntimeException{
        public EmptyQueueException(){}
    }

    public static class OverflowQueueException extends RuntimeException{
        public OverflowQueueException() {}
    }

    public E enque(E itm) throws OverflowQueueException{
        if(this.num == this.max){
            throw new OverflowQueueException();
        }
        this.q[this.rear++%this.max] = itm;
        this.num++;
        return this.q[(this.rear-1)%this.max];
    }

    public E deque() throws EmptyQueueException{
        if(this.num == 0){
            throw new EmptyQueueException();
        }
        this.num--;
        return this.q[this.front++%this.max];
    }

    public E peek() throws EmptyQueueException{
        if(num==0){
            throw new EmptyQueueException();
        }
        return this.q[this.front%this.max];
    }

    public int indexOf(E itm){
        for(int i=this.front;i<this.rear;i++){
            if(this.q[i%this.max] == itm){
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        this.front = 0;
        this.rear = 0;
        this.num = 0;
    }

    public int capacity(){
        return this.max;
    }

    public int size(){
        return this.num;
    }

    public boolean isEmpty(){
        return this.num == 0;
    }

    public boolean isFull(){
        return this.num == max;
    }

    public String dump(){
        StringBuilder sb = new StringBuilder();
        for(int i=this.front; i<this.rear; i++){
            sb.append("que[").append(i%this.max).append("]: ").append(q[i%this.max]).append("\n");
        }
        return sb.toString();
    }
}

package com.test.StackQueue;


public class Stack<E> {
    private int max;
    private int ptr;
    private E[] stk;

    public static class EmptyStackException extends RuntimeException{
        public EmptyStackException(){}
    }

    public static class OverflowStackException extends RuntimeException{
        public OverflowStackException(){}
    }

    public Stack(int capacity){
        this.ptr = -1;
        this.max = capacity;
        try{
            this.stk = (E[]) new Object[max];
        } catch (OutOfMemoryError e){
            max = 0;
        }
    }

    public E push(E itm) throws OverflowStackException{
        if(this.ptr == max-1){
            throw new OverflowStackException();
        }
        this.stk[++this.ptr] = itm;
        return this.stk[this.ptr];
    }

    public E pop() throws EmptyStackException{
        if(this.ptr == -1){
            throw new EmptyStackException();
        }
        return this.stk[this.ptr--];
    }

    public E peek() throws EmptyStackException{
        if(this.ptr == -1){
            throw new EmptyStackException();
        }
        return this.stk[this.ptr];
    }

    public int indexOf(E itm){
        for(int i=ptr;i>-1;i--){
            if(stk[i] == itm){
                return i;
            }
        }
        return -1;
    }

    public void clear(){
        this.ptr = -1;
    }

    public int capacity(){
        return this.max;
    }

    public int size(){
        return this.ptr+1;
    }

    public boolean isEmpty(){
        return ptr == -1;
    }

    public boolean isFull(){
        return ptr == max-1;
    }

    public String dump(){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ptr+1;i++){
            sb.append("stk[").append(i).append("]: ").append(this.stk[i]).append('\n');
        }
        return sb.toString();
    }
}

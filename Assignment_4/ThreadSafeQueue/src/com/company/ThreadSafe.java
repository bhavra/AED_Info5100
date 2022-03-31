package com.company;
import java.util.*;

public class ThreadSafe <T> {
    Queue<T> queue;
    public Object objLock = new Object();
    public ThreadSafe(){
        queue = new LinkedList<>();
    }
    public void add(T data){
        synchronized (objLock){
            queue.add(data);
            System.out.println("Add : " +data);
        }
    }
    public T remove(){
        synchronized (objLock){
            return queue.remove();
        }
    }
    public T peek() {
        synchronized (objLock) {
        return queue.peek();

        }
    }
    public boolean isEmpty(){
        synchronized (objLock){
            return queue.isEmpty();
        }
    }
}

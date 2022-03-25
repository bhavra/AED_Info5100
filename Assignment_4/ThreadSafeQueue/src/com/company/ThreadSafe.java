package com.company;
import java.util.*;

public class ThreadSafe<T> {
    Queue<T> queue;
    public Object objLock = new Object();

    public ThreadSafe(){
        queue = new LinkedList<>();
    }

    public void add(T data){
        synchronized (objLock){
            queue.add(data);
        }
    }

    public T remove(){

    }

    public T peek(){}

    public boolean isEmpty(){}
}

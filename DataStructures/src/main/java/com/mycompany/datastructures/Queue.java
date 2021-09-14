/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructures;

/**
 *
 * @author sethp
 */
public class Queue {
    public int queue[];
    public int index;
    private int head;
    private int tail;
    private int elems;
    
    public Queue(int size){
        this.queue = new int[size];
        index = 0;
    }
    
    public void append(int value){
        if(isFull()){
            throw new QueueException("Queue is full");
        }
        queue[tail] = value;
        tail = (tail + 1) % queue.length;
        elems++;
    }
    
    public int get(){
        if(isEmpty()){
            throw new QueueException("Queue is empty");
        }
        int getValue = queue[head];
        head = (head + 1) % queue.length;
        elems--;
        return getValue; 
    }
    
    public boolean isFull(){
        return elems == queue.length;
    }
    
    public boolean isEmpty(){
        if(elems==0){
            throw new QueueException("Queue is empty"); 
        }
        return elems == 0;
    }
    
    public int peek(){
        return queue[head];
    }
    
    
}

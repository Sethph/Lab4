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
    
    public Queue(int size){
        this.queue = new int[size];
        index = 0;
    }
    
    public void append(int value){
        if(isFull()){
            throw new QueueException("Queue is full");
        }
        queue[index] = value;
        index++;
    }
    
    public int get(){
        if(isEmpty()){
            throw new QueueException("Queue is empty");
        }
        index--;
        int getValue = queue[0];
        System.arraycopy(queue, 1, queue, 0, index);
        return getValue; 
    }
    
    public boolean isFull(){
        return index == queue.length;
    }
    
    public boolean isEmpty(){
        return index == 0;
    }
    
    
}

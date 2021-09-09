/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.datastructures;

import java.util.Scanner;

/**
 *
 * @author sethp
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue(5);
        int val = sc.nextInt();
        while(val != 0){
            queue.append(val);
            val = sc.nextInt();
        }
        
        while(!queue.ifEmpty()){
            System.out.printf("Got: %d%n", queue.get());
        }
    }
}

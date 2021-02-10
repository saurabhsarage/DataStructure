/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.stackpkg;

/**
 *
 * @author User
 */
public class Stack {

    int[] stack = new int[5];
    int top = 0;
    public void push(int i) {
        stack[top] = i;
        top++;
    }
    
    public int pop(){
        int data = stack[--top];
        stack[top] = 0;
        
        return data;
    }
    public void show(){
        for (int i : stack) {
            System.out.print(i + " ");
        }
    }
}

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
public class Runner {
    public static void main(String[] args) {
        Stack num = new Stack();
        
        num.push(15);
        num.push(20);
        num.push(30);
        int data = num.pop();
        System.out.println("POP :- "+data);
        
        num.show();
    }
}

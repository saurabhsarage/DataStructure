/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructure.linkedlistpkg;

/**
 *
 * @author User
 */
public class Runner {
    public static void main(String[] args) {
        LinkedList1 list = new LinkedList1();
        list.insert(17);
        list.insert(20);
        list.insert(26);
        list.insertAtStart(19);
        list.inserAt(0, 8);
        list.deleteAt(0);
        list.show();
    }
}

package org.cydeo.coding;

import java.util.LinkedList;

public class ReverseLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList= new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        System.out.println(reverseLink(linkedList));
    }
    public static LinkedList<Integer> reverseLink(LinkedList<Integer> num){
        LinkedList<Integer>linkedList= new LinkedList<>();
        num.descendingIterator().forEachRemaining(linkedList::add);
        return linkedList;
    }
}

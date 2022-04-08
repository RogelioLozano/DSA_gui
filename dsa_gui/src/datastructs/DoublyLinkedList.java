package datastructs;

import datastructs.dsexceptions.*;

public class DoublyLinkedList {

    private Node head; // 8 bytes in heap
    private Node tail; // 8 bytes in heap

    public void insertHead(float word) {
        Node newNode = new Node(word); // 20 bytes in heap object, newNode reference 8 bytes in stack
        if (isEmpty()) {
            tail = newNode;
        }
        else{
            head.previous = newNode;
        }
        newNode.next = head;
        head = newNode;
    }

    public void insertTail(float word) {
        Node newNode = new Node(word);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
    }

    public boolean isEmpty() {
        return (head == null);
    }

    public Node deleteFirst() throws EmptyDoublyLinkedListExcepition{

        if (isEmpty()){
            throw new EmptyDoublyLinkedListExcepition();
        }
        Node deletedNode = head;

        if (head.next==null){// if only one Node
            tail=null;
        }
        else{
            head.next.previous = null;
        }
        head = head.next;
        return deletedNode;
    }

    public Node deleteLast() throws EmptyDoublyLinkedListExcepition{
        if (isEmpty()){
            throw new EmptyDoublyLinkedListExcepition();
        }
        Node deletedNode = tail;
        if (head.next==null){//if only 1 Node
            head=null;
        }
        else{
            tail.previous.next=null;
        }
        tail=tail.previous;
        return deletedNode;
    }
}
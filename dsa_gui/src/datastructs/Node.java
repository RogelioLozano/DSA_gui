package datastructs;

public class Node { //20 bytes in heap class
    float word; //4 bytes in heap
    Node next; // 8 bytes in heap
    Node previous; // 8bytes in heap

    public Node(float w){
        this.word=w;
    }
}

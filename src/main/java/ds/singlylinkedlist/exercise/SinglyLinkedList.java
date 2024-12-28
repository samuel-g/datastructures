package ds.singlylinkedlist.exercise;

import java.sql.SQLOutput;

public class SinglyLinkedList {

    private Node first;
    private Node last;

    public SinglyLinkedList() {

    }

    // Getter for first property
    public Node getFirst() {
        return first;
    }

    // Getter for last property
    public Node getLast() {
        return last;
    }

    public boolean isEmpty() {
        return (first == null);
    }

    public void insertFirst(int data) {
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }
        newNode.next = first;
        first = newNode;
    }

    public void insertLast(int data) {
        Node newNode = new Node();
        newNode.data = data;
        if (isEmpty()) {
            first = newNode;
            last = newNode;
        } else {
            last.next = newNode; // the next value of the last node will point to the new node
            last = newNode; // we make the new node we created be the last one in the list
        }
    }

    public void insertAfterPosition(int data, int position) {
        Node currentFirstNode = first;
        int counter = 1;
        while (currentFirstNode != null) {
            if (position == counter) {
                Node newNode = new Node();
                newNode.data = data;
                newNode.next = currentFirstNode.next;
                currentFirstNode.next = newNode;
                break;
            }
            else {
                currentFirstNode = currentFirstNode.next;
                counter++;
            }
        }

    }

    public int deleteFirst() {
        int temp = first.data;

        if (first.next == null) {
            last = null;
        }
        first = first.next;
        return temp;
    }

    public void displayList() {
        Node current = first;
        System.out.print("List (first --> last): ");
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

}
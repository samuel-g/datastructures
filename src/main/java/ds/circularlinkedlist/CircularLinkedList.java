package ds.circularlinkedlist;

public class CircularLinkedList {

    private Node first;
    private Node last;

    public CircularLinkedList() {
    }

    public void insertFirst(int data) {
        //[first] -> [5] -> [10] -> [15] -> null
        Node newNode = new Node();
        //[newNode] -> [20 | next=null]
        newNode.data = data;

        if (isEmpty()) {
            last = newNode;
        }
        //[newNode] -> [20 | next=first] --> [5] -> [10] -> [15] -> null
        newNode.next = first; //newNode point to -> old first

        //[first] -> [20 | next=5] --> [5] -> [10] -> [15] -> null
        first = newNode;
    }

    public void insertLast(int data) {
        //[1] -> [2] -> [3] (last points to [3])
        Node newNode = new Node();
        newNode.data = data;

        if (isEmpty()) {
            first = newNode;
        } else {
            //[1] -> [2] -> [3] -> [4] (last still points to [3], but [3].next points to [4]) (actual obj.)
            last.next = newNode;
            //[1] -> [2] -> [3] -> [4] (last now points to [4]) (ref.)
            last = newNode;
        }
    }

    public int deleteFirst() {
        //[first] -> [10] -> [20] -> [30] -> null
        int temp = first.data;

        if (first.next == null) {
            last = null;
        }
        //[first] -> [20] -> [30] -> null
        first = first.next; //first will point to old's next value
        return temp;
    }

    public void displayList() {
        System.out.println("List (first --> last) ");
        Node current = first;

        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }

    public boolean isEmpty() {
        return (first == null);
    }
}

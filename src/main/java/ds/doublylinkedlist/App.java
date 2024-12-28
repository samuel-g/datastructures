package ds.doublylinkedlist;

public class App {

    public static void main(String[] args) {
        DoublyLinkedList myList = new DoublyLinkedList();
        myList.insertFirst(1);
        myList.insertFirst(2);
        myList.insertFirst(3);
        myList.insertFirst(4);
        myList.insertLast(5);
        myList.displayForward();
        myList.deleteKey(3);
        myList.deleteLast();
        myList.insertAfter(2, 6);

        myList.displayForward();
        myList.displayBackward();
    }
}

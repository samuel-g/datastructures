package ds.singlylinkedlist.exercise;


public class App {
    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();
        myList.insertFirst(5);
        myList.insertFirst(4);
        myList.insertFirst(3);
        myList.insertFirst(2);
        myList.insertLast(9999);
        myList.insertAfterPosition(50, 1);
        myList.displayList();
        myList.deleteFirst();
        myList.displayList();
    }
}

package ds.linkedlist;

public class App {

    public static void main(String[] args) {

        Node nodeA = new Node();
        nodeA.data = 4;

        Node nodeB = new Node();
        nodeB.data = 3;

        Node nodeC = new Node();
        nodeC.data = 7;

        Node nodeD = new Node();
        nodeD.data = 8;

        //Link nodes
        nodeA.next = nodeB;
        nodeB.next = nodeC;
        nodeC.next = nodeD;
        System.out.println(listLength(nodeA)); //4
        System.out.println(listLength(nodeB)); //4
    }

    //Count length of linkedList,
    public static int listLength(Node aNode) {

        int length = 0;

        //Define current Node variable and set it to aNode
        Node currentNode = aNode;

        while (currentNode != null) {
            length++;
            currentNode = currentNode.next;
        }
        return length;
    }
}

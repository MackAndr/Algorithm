package homework3;

public class LinkedList {
    Node head;
    Node tail;

    public class Node {
        Node next;
        Node previous;
    }

    public void revert(){
        Node currentNode = head;
        while (currentNode != null){
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null){
                tail = currentNode;
            }
            if (next == null){
                head = currentNode;
            }

            currentNode = next;

        }
    }
}

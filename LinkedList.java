/*    public void reverseListIterative() {
        if(head == null || head.next == null) {
            return;
        }


        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }

    public Node reverseListRecursive(Node head) {
        //empty node || last node or only one node
        if(head == null || head.next == null) {
            return head;
        }


        Node newHead = reverseListRecursive(head.next);
    
        head.next.next = head;
        head.next = null;
        return newHead;
    } */

public class LinkedList {

    // Node class representing each element in the linked list
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Constructor to initialize an empty list
    public LinkedList() {
        head = null;
    }

    // Method to add a new node at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Iterative method to reverse the linked list
    public void reverseListIterative() {
        if (head == null || head.next == null) {
            return;
        }

        Node prevNode = head;
        Node currNode = head.next;
        while (currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
        
    }

    // Recursive method to reverse the linked list
    public Node reverseListRecursive(Node head) {
        // Base case: empty node or last node
        if (head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseListRecursive(head.next);

        head.next.next = head;
        head.next = null;

        return newHead;
    }

    // Method to call the recursive reversal from the list itself
    public void reverseListRecursive() {
        head = reverseListRecursive(head);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println("Original List:");
        list.printList();

        // Test iterative reversal
        list.reverseListIterative();
        System.out.println("List after iterative reversal:");
        list.printList();

        // Reverse it back using recursive method
        list.reverseListRecursive();
        System.out.println("List after recursive reversal:");
        list.printList();
    }
}



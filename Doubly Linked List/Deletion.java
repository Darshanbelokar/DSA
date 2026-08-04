class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Solution {

    public Node delPos(Node head, int x) {

        // Empty list
        if (head == null) {
            return null;
        }

        // Delete first node
        if (x == 1) {
            head = head.next;

            if (head != null) {
                head.prev = null;
            }

            return head;
        }

        Node temp = head;

        // Move to x-th node
        for (int i = 1; i < x && temp != null; i++) {
            temp = temp.next;
        }

        // Invalid position
        if (temp == null) {
            return head;
        }

        // Connect previous node to next node
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        // Connect next node to previous node
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        return head;
    }
}

public class Deletion {

    // Print Doubly Linked List
    static void print(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data);

            if (temp.next != null) {
                System.out.print(" <-> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        // Create DLL
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        System.out.println("Original List:");
        print(head);

        Solution obj = new Solution();

        // Delete node at position 3
        head = obj.delPos(head, 3);

        System.out.println("After Deletion:");
        print(head);
    }
}
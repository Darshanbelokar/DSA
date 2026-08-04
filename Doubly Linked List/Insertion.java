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

public class Insertion {
    public static void main(String[] args) {

        Node head = new Node(2);
        head.next = new Node(4);
        head.next.prev = head;

        head.next.next = new Node(5);
        head.next.next.prev = head.next;

        Solution obj = new Solution();

        head = obj.insertAtPos(head, 2, 6);

        print(head);
    }

    public static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Solution {
    Node insertAtPos(Node head, int p, int x) {

        Node newNode = new Node(x);

        Node temp = head;

        // Move to the p-th node (0-based)
        for (int i = 0; i < p && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            return head;
        }

        newNode.next = temp.next;
        newNode.prev = temp;

        if (temp.next != null) {
            temp.next.prev = newNode;
        }

        temp.next = newNode;

        return head;
    }
}
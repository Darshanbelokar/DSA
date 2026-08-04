class Node {
    int data;
    Node next, prev;

    Node(int data) {
        this.data = data;
    }
}

class Solution {

    Node reverse(Node head) {

        Node curr = head;
        Node temp = null;

        while (curr != null) {

            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }

        return head;
    }
}

public class ReverseDLL {

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;

        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head.next.next.next = new Node(4);
        head.next.next.next.prev = head.next.next;

        print(head);

        Solution obj = new Solution();
        head = obj.reverse(head);

        print(head);
    }
}
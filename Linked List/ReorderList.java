class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class ReorderList {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        printList(head);

        reOrderList(head);

        System.out.println();
        printList(head);
    }

    public static void printList(ListNode head) {

        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }

        System.out.println("null");
    }

    public static void reOrderList(ListNode head) {

        if (head == null || head.next == null)
            return;

        // 1. Find middle
        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode second = slow.next;
        slow.next = null;

        ListNode prev = null;

        while (second != null) {

            ListNode next = second.next;

            second.next = prev;

            prev = second;
            second = next;
        }

        // 3. Merge
        ListNode first = head;
        second = prev;

        while (second != null) {

            ListNode next1 = first.next;
            ListNode next2 = second.next;

            first.next = second;
            second.next = next1;

            first = next1;
            second = next2;
        }
    }
}
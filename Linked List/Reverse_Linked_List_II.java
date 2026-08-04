class ListNode{
  int val;
  ListNode next;

  ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Reverse_Linked_List_II{
  public static void main(String[] args) {
     ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Reverse_Linked_List_II obj = new Reverse_Linked_List_II();

        head = obj.reverseBetween(head,2,4);

        printList(head);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode currNode = head;

        for(int i =0;i<left-1;i++){
          prev = prev.next;
          currNode = currNode.next;
        }

        ListNode subListHead = currNode;

        ListNode preNode = null;
        for(int i =0;i<right-left;i++){
          ListNode nextNode = currNode.next;
          currNode.next = preNode;
          preNode = currNode;
          currNode = nextNode;
        }

        prev.next = preNode;
        subListHead.next = currNode;

        return dummy.next;

    }
}

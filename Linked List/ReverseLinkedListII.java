class ListNode{
    int val;
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class ReverseLinkedListII{
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        head = reverseLinkedList(head, 2, 4);
        printList(head);
    }

    public static void printList(ListNode head){

        while(head != null){
            System.out.print(head.val + "->");
            head = head.next; 
        }
        System.out.println("null");
    }

    public static ListNode reverseLinkedList(ListNode head,int left,int right){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode temp = dummy;

        for(int i = 0;i<left-1;i++){
            temp = temp.next;
        }

        ListNode subListHead = temp.next;

        ListNode currNode = subListHead;
        ListNode preNode = null;

        for(int i = 0;i<right-left+1;i++){
            ListNode nextNode = currNode.next;
            currNode.next = preNode;

            preNode = currNode;
            currNode = nextNode;
        }

        temp.next = preNode;

        subListHead.next = currNode;

        return dummy.next;
    }
}
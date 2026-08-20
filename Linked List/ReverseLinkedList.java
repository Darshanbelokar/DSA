public class ReverseLinkedList {
  public static void main(String[] args) {
    ListNode head = new ListNode(1);
    head.next = new ListNode(2);
    head.next.next = new ListNode(3);
    head.next.next.next = new ListNode(4);

    head = reverseLinkedlist(head);
    print(head);
  }

  public static void print(ListNode head){
    while(head != null){
      System.out.print(head.val + "->");
      head = head.next;
    }
  } 

  public static ListNode reverseLinkedlist(ListNode head){
    ListNode prev = null;
    ListNode curr = head;

    while(curr != null){
      ListNode next = curr.next;
      curr.next = prev;
      prev = curr;
      curr=next;
    }
    return prev;
  }
}

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

import java.util.ArrayList;

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

public class Sort_List{
  public static void main(String[] args) {
     ListNode head = new ListNode(4);
        head.next = new ListNode(2);
        head.next.next = new ListNode(1);
        head.next.next.next = new ListNode(3);
    
        Sort_List obj = new Sort_List();

        head = obj.sortList(head);

        printList(head);
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public ListNode sortList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();

        ListNode temp = head;
        while(temp != null){
            list.add(temp.val);
            temp = temp.next;
        }

        list.sort(null);

        temp = head;
        int i = 0;

        while(temp != null){
            temp.val = list.get(i);
            temp = temp.next;
            i++;
        }

        return head;
    }
}

import java.util.ArrayList;
import java.util.List;

public class Merge_k_sortedList {
  public static void main(String[] args) {
    
  }

  public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode merge(ListNode[] lists, int left,int right){

        if(left == right){
            return lists[left];
        }

        int mid = left + (right-left) / 2;
        ListNode l1 =  merge(lists,left,mid);
        ListNode l2 =  merge(lists,mid+1,right);

        return mergeSort(l1,l2);

    }   

    public ListNode mergeSort(ListNode l1,ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while(l1 != null && l2 != null){
            if(l1.val <= l2.val){
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        current.next = (l1 != null) ? l1 : l2;
        return dummy.next;
    }

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}

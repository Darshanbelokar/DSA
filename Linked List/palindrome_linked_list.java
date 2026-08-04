class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class palindrome_linked_list {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        palindrome_linked_list obj = new palindrome_linked_list();

        System.out.println(obj.isPalindrome(head));
    }

    public boolean isPalindrome(ListNode head){
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next!= null){
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reversing the second half
        ListNode prev = null;
        ListNode temp= slow;

        while(temp != null){
            ListNode next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        //Now compare first and second half
        ListNode first = head;
        ListNode second = prev;

        while(second != null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
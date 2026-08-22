public class Array_to_LL {

  static class Node{
    int data;
    Node next;

    Node(int data){
      this.data=data;
      this.next=null;

    }
  }
  public static void main(String[] args) {
    int[] arr={2,4,2};
    Node head=array_to_linked_list(arr);
    print(head);
    
  }

  static Node array_to_linked_list(int[] arr){
    if(arr.length==0){
      return null;
    }

    Node head=new Node(arr[0]);
    Node current = head;

    for(int i=1;i<arr.length;i++){
      current.next=new Node(arr[i]);
      current=current.next;
    }
    return head;

  }
  static void print(Node head) {
    Node temp = head;
    while (temp != null) {
      System.out.print(temp.data + " ");
      temp = temp.next;
    }
  }
}

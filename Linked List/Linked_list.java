import java.security.PublicKey;

public class Linked_list {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

        public Linked_list(int value){
            Node newNode=new Node(value);
            head=newNode;
            tail=newNode;
            length=1;
        }

    public static void main(String[] args) {
        Linked_list list1=new Linked_list(2);
        list1.append(3);

        list1.prepend(1);

        list1.print_list();
        list1.getHead();
        list1.getTail();
        list1.getLength();
    }

    public  void print_list(){
        Node temp=head;

        while(temp!=null) {
            System.out.println(temp.value);

            temp=temp.next;
        }
    }
    public void append(int value){
        Node newNode =new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }

    public Node remove_last(){
        Node temp=head;
        Node pre=head;
        if(length==0){
            return null;
        }
        while (temp.next!=null){
            pre=temp;
            temp=temp.next;
        }
        tail=pre;
        tail.next=null;
        length--;
        if(length==0){
            head=null;
            tail=null;
        }
        return temp;
    }
    public void prepend(int value){
        Node newNode=new Node(value);
        if(length==0){
            head=newNode;
            tail=newNode;
        }
        else{
            newNode.next=head;
            head=newNode;
        }
        length++;

    }
    public Node removeFirst(){
        if(length==0){
            return null;
        }
        Node temp=head;
        head=head.next;
        temp.next=null;
        length--;
        if(length==0){
            tail=null;
        }
        return temp;
    }

    public void getHead(){
        System.out.println("Head:"+head.value);
    }
    public void getTail(){
        System.out.println("Tail:"+tail.value);
    }
    public void getLength(){
        System.out.println("Length:"+length);
    }
}

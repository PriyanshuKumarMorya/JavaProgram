package LINKEDLISTQUESTION;
// recurse of linked list
public class Question2 {
    void display(Node head){
        if(head ==null) return ;
        display(head.next);
        System.out.println(head.data+" ");

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(9);
        Node b = new Node (7);
        Node c = new Node (3);
        Node d = new Node (6);
        Node e = new Node (21);
        Node f = new Node (13);
         a.next = b;
         b.next=c;
         c.next=d;
         d.next=e;
         e.next= f;
          Question2  o = new Question2();
          o.display(a);

    }
}

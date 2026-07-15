package LINKEDLISTQUESTION;

public class Question3 {
    void display(Node head){
        if(head==null) return;
        System.out.println(head.data+" ");
        display(head.next);
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(7);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        a.next =b;
        b.next=e;
        e.next=c;
        c.next=d;
        Question3 k = new Question3();
        k.display(a);

    }
}

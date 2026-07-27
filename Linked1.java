package Linked_List.Singly;

public class Linked1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    static void display(Node head){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }

    }
    static void main(String[] args) {
        Node a = new Node(8);
        Node b = new Node(12);
        Node c = new Node(4);
        Node d = new Node(16);
        Node e = new Node(1);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);

    }
}

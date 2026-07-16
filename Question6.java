package LINKEDLISTQUESTION;
import java.util.*;
public class Question6 {
    void display(Node head){
        if(head==null) return;
        display(head.next);
        System.out.println("Reverse of linked list: "+head.data);
        display(head.next);
        System.out.println();

    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.print("Empty Linkedlist list .");
            return;
        }
        System.out.println("Enter data for node 1: ");
        int data = sc.nextInt();
        Node head = new Node(data);
        Node current = head;
        for(int i=2;i<=n;i++){
            System.out.print("Enter data for node : ");
            data=sc.nextInt();
            current.next=new Node(data);
            current = current.next;
        }
        Question6 w = new Question6();
        w.display(head);

    }
}

package LINKEDLISTQUESTION;
import java.util.*;
public class Question4 {
    void display(Node head){
        if(head==null) return;
        System.out.println("Data Print: "+head.data+" ");
        display(head.next);
    }
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number of linnked : ");
        int n= sc.nextInt();

        if(n<1){
            System.out.println("Empty of linked list");
            return;
        }
        System.out.print("Enter data for node 1: ");
        int data = sc.nextInt();
        Node head = new Node(data);
        Node current = head;
        for(int i=2;i<=n;i++){
            System.out.print("Enter data "+i+" for node: ");
            data=sc.nextInt();
            current.next=new Node(data);
            current = current.next;

        }
        Question4 w =new Question4();
        w.display(head);
    }
}

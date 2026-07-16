package LINKEDLISTQUESTION;
import java.util.*;
public class Question5 {
    void display( Node head){
        if(head==null) return;
        display(head.next);
        System.out.println("Reverse of linked list: "+head.data);


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
        System.out.print("Enter range of linnked list: ");
        int n = sc.nextInt();
        if(n<1){
            System.out.print("Empty of linked it.");
            return;
        }
        System.out.print("Enter data for node 1: ");
        int data = sc.nextInt();
        Node head = new Node(data);
        Node current = head;
        for(int i=2;i<=n;i++){
            System.out.print("Enter data for node "+i+" : ");
            data = sc.nextInt();
            current.next= new Node(data);
            current = current.next;
        }
        System.out.println(" ");
        Question5 f = new Question5();
        f.display(head);

    }
}

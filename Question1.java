package LINKEDLISTQUESTION;

public class Question1 {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(8);
        Node c = new Node(3);
        a.next=b;
        b.next=c;
        Node temp= a;
        for(int i=1;i<=3;i++){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
}

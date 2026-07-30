package Linked_List.Singly;

public class Linked_InsertAtEnd1 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insertAtEnd(9);
        l.insertAtEnd(5);
        l.insertAtEnd(12);
        l.insertAtEnd(7);
        l.insertAtEnd(78);
        l.display();
    }
}

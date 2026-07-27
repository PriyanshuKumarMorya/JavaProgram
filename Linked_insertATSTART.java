package Linked_List.Singly;

public class Linked_insertATSTART {

    public static class Node{
        int data ;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
            }else{
                temp.next=head;
                head =temp;
            }
        }
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
            }else{
                tail.next = temp;
            }
            tail= temp;
        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp =temp.next;
            }
        }
    }
    public static void main(String[] args) {
        linkedlist l= new linkedlist();
        l.insertAtHead(6);
        l.insertAtHead(9);
        l.display();
        System.out.println();
        l.insertAtHead(34);
        l.insertAtEnd(14);
        l.display();

    }
}

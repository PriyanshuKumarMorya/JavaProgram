package Linked_List.Singly;

public class Linked_InsertAtEnd2 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist2{
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
        linkedlist2 l = new linkedlist2();
        l.insertAtEnd(5);
        l.display();

    }
}

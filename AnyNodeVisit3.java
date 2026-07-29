package Linked_List.Singly;

public class AnyNodeVisit3 {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class Linkedlist{
        Node head= null;
        Node tail = null;
        int size=0;

        void insertStart(int val){
            Node temp = new Node(val);
            if(head==null){
                head=tail =temp;
            }else{
                temp.next=head;
                head = temp;
                size++;
            }
        }

        void insertEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }else{
                tail.next= temp;
            }
            tail=temp;
            size++;
        }

        int size(){
            Node temp = head;
            int count=0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAny(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){
                insertEnd(val);
                return;
            }else if(idx==0){
                insertStart(val);
                return;
            }else if(idx<0 || idx>size()){
                System.out.println("Wrong index");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
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
        Linkedlist l = new Linkedlist();
        l.insertStart(8);
        l.insertEnd(13);
        l.insertStart(5);
        l.display();


    }
}

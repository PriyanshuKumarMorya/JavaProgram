package Linked_List.Singly;

public class AnyNodevisit1 {
    public static class Node{
        int data;
         Node next;
         Node(int data){
             this.data =data;
         }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size=0;
        void insertAtend(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }
        void insertStart(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp=tail;
                size++;
            }else{
                temp.next = head;
                head = temp;
                size++;
            }
        }
        int size(){
            Node temp = head;
            int count =0;
            while(temp!=null){
                count++;
                temp=temp.next;
            }
            return count;
        }

        void insertAny(int idx,int val){
            Node t = new Node(val);
            Node temp =head;
            if(idx==size()){
                insertAtend(val);
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
            t.next=temp.next;
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
        linkedlist l = new linkedlist();
        l.insertAtend(7);
        l.insertStart(3);
        l.display();
        System.out.println();
        l.insertAny(1,12);
        l.display();

    }
}

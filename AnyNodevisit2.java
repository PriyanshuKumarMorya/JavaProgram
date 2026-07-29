package Linked_List.Singly;

public class AnyNodevisit2 {

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
        int size;
        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }else{
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void insertAtStart(int val){
            Node temp = new Node(val);
            if(head==null){
                head = tail = temp;
                size++;
            }else{
                temp.next = head;
                head = temp;
                size++;
            }
        }
        int size(){
            Node temp = head;
            int count=0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
            return count;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        void insertAny(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size()){
                insertAtEnd(val);
                return;
            }else if(idx==0){
                insertAtEnd(val);
                return;
            }else if(idx<0||idx>size()){
                System.out.println("Wrong index.");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
    }

    public static void main(String[] args) {
        linkedlist l = new linkedlist();
        l.insertAtEnd(78);
        l.insertAtStart(23);
        System.out.print(l.size());
        System.out.println();
        l.insertAtEnd(67);
        l.display();
        System.out.println();
        l.insertAny(3,16);
        l.display();
        System.out.println();
        System.out.println(l.size());


    }
}

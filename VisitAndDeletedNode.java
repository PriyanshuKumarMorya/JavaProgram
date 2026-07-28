package Linked_List.Singly;

public class VisitAndDeletedNode {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class priyanshu{
        Node head = null;
        Node tail = null;
        int size=0;

        void insertStart(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp=tail;
                size++;
            }else{
                temp.next=head;
                head=temp;
                size++;
            }
        }

        void insertEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
                size++;
            }else{
                tail.next=temp;
                tail=temp;
                size++;
            }
        }


        void insertAny(int idx,int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==size()){
                insertEnd(val);
                return;
            }else if(idx==0){
                insertStart(val);
                return;
            }else if(idx<0||idx>size()){
                System.out.println("Wrong index.");
                return;
            }
            for(int i=1;i<=idx-1;i++){
                temp = temp.next;
            }
            t.next =temp.next;
            temp.next=t;
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

        void delete(int idx){
            if(idx==0){
                head = head.next;
                size--;
                return;

            }
            Node temp =head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next = temp.next.next;
            tail=temp;
            size--;
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
        priyanshu p = new priyanshu();
        p.insertEnd(45);
        p.insertEnd(78);
        p.insertEnd(34);
        p.insertEnd(67);
        p.insertEnd(89);
        p.insertEnd(76);
        p.display();
    }
}

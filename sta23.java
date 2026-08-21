package Stack;

//import java.util.*;
//import java.util.Stack;


public class sta23 {
    public static  class Node{
        int val;
        Node next ;
        Node(int val){
            this.val = val;
        }
    }
    public static class Stack5{
        Node head = null;
       private  int size =0;
        void push(int x ){
            Node temp = new Node(x);
            temp.next = head;
            head = temp;
            size++;
        }
        void Display1(Node h){
            if(h==null) return;
            Display1(h.next);
            System.out.print(h.val+" ");

        }
        void display(){
            Display1(head);
        }
        void displayRev(){
            Node temp = head;
            while(temp!=null){
                System.out.println(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        int size(){
            return size;
        }
        int pop(){
            if(isEmpty()){
                System.out.println("Stack is Empty.");
                return -1;
            }
            int x =head.val;
            head = head.next;
            size--;
            return x;
        }
        int peek(){
            if(head==null){
                System.out.println("Stack is Empty.");
                return -1;
            }
            return head.val;
        }
        boolean isEmpty(){
            if(size()==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack5 st = new Stack5();
        st.push(4);
        st.push(8);
        st.pop();
        st.push(34);
        st.push(45);
        st.push(89);
        st.pop();
        st.display();

        System.out.println(st.size());

    }
}

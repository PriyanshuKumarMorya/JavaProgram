package Stack;

class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Stack5{
    Node head = null;
    int size =0;
    void push(int x ){
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        size++;
    }
    int size(){
        return size;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    boolean isEmpty(){
        if(size==0) return true;
        else return false;
    }
    void display(){
        Display1(head);
    }
    void Display1(Node h){
        if(h==null) return ;
        Display1(h.next);
        System.out.println(h.val+" ");
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return head.val;
    }
}
public class sta24 {
    public static void main(String[] args) {
        Stack5 st = new Stack5();
        st.push(90);
        st.push(67);
        st.push(56);
        st.push(77);
        st.push(44);
        st.push(55);
        st.push(65);
        st.pop();
        st.pop();
        st.display();
        System.out.println("The stack is size: "+st.size());

    }
}

package Stack;

class Node1 {
    int val;
    Node next;
    Node1(int val){
        this.val = val;
    }
}
class Stack6{
    Node head = null;
    int size =0;
    void push(int x){
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
            System.out.println("Stack is Empty");
            return -1;
        }
        int x = head.val;
        head = head.next;
        size--;
        return x;
    }
    boolean isEmpty(){
        if(size()==0) return true;
        else return false;
    }
    void display(){
        Display(head);
    }
    void Display(Node h){
        if(h==null) return ;
        Display(h.next);
        System.out.println(h.val+" ");
    }
}
public class sta25 {
    public static void main(String[] args) {
        Stack6  st = new Stack6();
        st.push(45);
        st.push(25);
        st.push(69);
        st.push(23);
        System.out.println("Stack size is : "+st.size());
        st.pop();
        st.pop();
        System.out.println("Stack size is : "+st.size());
        st.push(76);
        st.push(89);
        st.display();
        System.out.println("Stack size is : "+st.size());

    }
}

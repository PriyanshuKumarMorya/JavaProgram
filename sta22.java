package Stack;

//import java.util.*;
import java.util.Stack;

class Stack4{
    int[] arr = new int[5];
    int idx =0;
    void push(int x){
        if(isFull()){
            System.out.println("Stack is Full.");
            return ;
        }
        arr[idx] = x;
        idx++;
    }
    int size(){
        return idx;
    }
    boolean isFull(){
        if(idx==arr.length) return true;
        else return false;
    }
    boolean isEmpty(){
        if(size()==0) return true;
        else return false;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        int top = arr[idx-1];
        arr[idx-1] =0;
        idx--;
        return top;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return arr[idx-1];
    }
    void display(){
        for(int i=0;i<=idx-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
public class sta22 {
    public static void main(String[] args) {
        Stack4 st = new Stack4();
        st.display();
        st.peek();
        st.push(8);
        st.pop();
        st.pop();
        st.push(67);
        st.push(67);
        st.push(56);
        st.push(34);
        st.push(45);
        st.display();
        st.push(89);
        st.pop();
        st.display();
        st.push(89);
        System.out.println(st.size());


    }
}

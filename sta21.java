package Stack;

import java.util.Stack;
import java.util.Stack;

class Stack3{
    int[] arr = new int[5];
    int idx = 0;
    void push(int x){
        if(isFull()){
            System.out.println("Stack is Full.");
            return ;
        }
        arr[idx] = x;
        idx++;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return arr[idx-1];
    }
    int size(){
        return idx;
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        int top = arr[idx-1];
        arr[idx-1]=0;
        idx--;
        return top;
    }
    void display(){
        for(int i=0;i<=idx-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    boolean isEmpty(){
        if(size()==0) return true;
        else return false;
    }
    boolean isFull(){
        if(idx==arr.length) return true;
        else return false;
    }
}

public class sta21 {
    public static void main(String[] args) {
        Stack3 st = new Stack3();
        st.push(5);
        st.push(8);
        st.push(78);
        st.push(34);
        st.push(67);
        st.push(1);
        st.pop();
        st.pop();
        st.display();

    }
}

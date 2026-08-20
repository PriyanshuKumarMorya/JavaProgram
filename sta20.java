package Stack;

//import java.util.Stack;
//import java.util.*;

class Stack2{
    int[] arr = new int[5];
    int idx =0;
    void push(int x){
        if(isFull()){
            System.out.println("Stack is Full");
            return;
        }
        arr[idx]=x;
        idx++;
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        return arr[idx-1];
    }
    int pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty.");
            return -1;
        }
        int top = arr[idx-1];
        arr[idx-1]= 0;
        idx--;
        return top;
    }
    int size(){
        return idx;
    }
    boolean isEmpty(){
        if(size()==0) return true;
        else return false;
    }
    boolean isFull(){
        if(idx==arr.length) return true ;
        else return false;
    }
    void display(){
        for(int i=0;i<=idx-1;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}



public class sta20 {
    public static void main(String[] args) {
        Stack2 st = new Stack2();
        st.pop();
        st.push(8);
        st.push(9);
        st.push(45);
        st.push(56);
        st.push(78);
        st.push(89);
        st.pop();
        st.push(34);
        st.push(56);
        st.push(23);
        st.pop();

        st.display();
        System.out.println(st.size());

    }
}

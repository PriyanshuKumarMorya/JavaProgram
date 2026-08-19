package Stack;

//import java.util.*;
//import java.util.Stack;

public class sta19 {
    public static class Stack1{
        int[] arr = new int[6];
        int idx =0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is Full.");
                return ;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("Empty is Empty.");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
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
            if(idx==arr.length) return  true ;
            else return false;
        }
        int size(){
            return idx;
        }
    }
    public static void main(String[] args) {
        Stack1 st = new Stack1();
        st.push(7);
        st.push(78);
        st.push(89);
        st.push(34);
        st.push(56);
        st.push(23);
        st.push(4);
        st.push(1);
        st.push(5);
        st.push(1);



    }
}

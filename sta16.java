package Stack;


import java.util.*;
import java.util.Stack;

public class sta16 {
    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
    public static void Display(Stack<Integer> st){
        if(st.size()==1) return;
        int top = st.pop();
        Display(st);
        pushAtBottom(st,top);

    }
    public static void main(String[] args) {
        Stack<Integer> st= new Stack<>();
        st.push(25);
        st.push(78);
        st.push(45);
        st.push(32);
        st.push(12);
        st.push(87);
        System.out.println(st);
        Display(st);
        System.out.println(st);


    }
}

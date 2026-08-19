package Stack;

import java.util.*;
import java.util.Stack;


public class sta17 {
    public static void pushAtBottom(Stack<Integer> st,int x){
        if(st.size()==0){
            st.push(x);
            return;
        }
        int top = st.pop();
        pushAtBottom(st,x);
        st.push(top);
    }
    public static void display1(Stack<Integer> st){
        if(st.size()==1) return ;
        int top = st.pop();
        display1(st);
        pushAtBottom(st,top);
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(78);
        st.push(89);
        st.push(34);
        st.push(56);
        st.push(23);
        System.out.println(st);
        display1(st);
        System.out.println(st);

    }
}

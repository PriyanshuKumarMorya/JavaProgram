package Stack;

import java.util.*;
import java.util.Stack;

public class sta10 {
    public static void displayreverse(Stack<Integer> st){
        if(st.size()==0) return ;
        int top = st.pop();
        System.out.print(top+" ");
        displayreverse(st);
        st.push(top);
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        st.push(78);
        st.push(879);
        st.push(89);
        st.push(25);
        st.push(43);
        st.push(98);
        displayreverse(st);


    }
}

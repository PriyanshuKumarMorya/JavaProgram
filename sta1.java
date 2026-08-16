package Stack;

import java.util.Stack;
import java.util.*;

public class sta1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.pop();
        st.push(8);
        st.push(12);
        st.push(7);
        //peek
        System.out.println(st.peek());
        System.out.println(st);

    }
}

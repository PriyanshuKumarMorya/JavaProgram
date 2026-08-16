package Stack;

import java.util.*;
public class sta3 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(56);
        st.push(69);
        st.push(85);
        st.push(96);
        System.out.println(st);
        // reverse
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
            System.out.println(rt);
        }
        System.out.println(rt);
    }
}

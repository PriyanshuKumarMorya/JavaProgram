package Stack;

import java.util.Stack;

public class sta5 {
    public static void main(String[] args) {
        // recursion
        Stack<Integer> st = new Stack<>();
        st.push(56);
        st.push(69);
        st.push(85);
        st.push(96);
        System.out.println(st);
        int idx = 1;
        int x = 87;
        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());

        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);
    }
}

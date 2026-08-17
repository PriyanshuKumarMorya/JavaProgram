package Stack;

import java.util.Stack;
public class sta6 {
    public static void main(String[] args) {
       // Display Stack
        Stack<Integer> st = new Stack<>();
        st.push(56);
        st.push(69);
        st.push(85);
        st.push(96);
        st.push(65);
        //System.out.println(st);
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        while(rt.size()>0){
            int x = rt.pop();
            System.out.print(x+" ");
            st.push(x);
        }
        System.out.println();
        System.out.println(st);
    }
}

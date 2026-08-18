package Stack;

import java.util.*;
import java.util.Stack;

public class sta15 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(25);
        st.push(78);
        st.push(45);
        st.push(32);
        st.push(12);
        st.push(87);

        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        Stack<Integer> gt = new Stack<>();
        while(rt.size()>0){
            gt.push(rt.pop());
        }
        while(gt.size()>0){
            st.push(gt.pop());
        }
        System.out.println(st);

    }
}

package Stack;

import java.util.*;
import java.util.Stack;

public class sta9 {
    public static void displayRec(Stack<Integer> st){
        st.push(89);

    }

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(89);
        st.push(56);
        st.push(34);
        st.push(33);
        st.push(14);
        displayRec(st);
        System.out.println(st);


    }
}

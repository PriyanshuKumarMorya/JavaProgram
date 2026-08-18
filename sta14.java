package Stack;

import java.util.*;
import java.util.Stack;

public class sta14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter a size of the Stack: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print("Enter a elements of Stack: ");
            int x =sc.nextInt();
            st.push(x);
        }

        System.out.print("Enter a index of the stack : ");
        int idx = sc.nextInt();

        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());

        }
        System.out.println(st);

    }
}

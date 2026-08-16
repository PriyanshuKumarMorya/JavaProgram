package Stack;

import java.util.*;
import java.util.Stack;
public class sta2 {
    public static void main(String[] args) {
        // move stack in same order
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.print("Enter the number  elements: ");
        n = sc.nextInt();
        System.out.print("enter elements of stack: ");
        for(int i=1;i<=n;i++){
            int x = sc.nextInt();
            st.push(x);
        }
        System.out.println(st);
        // reverse stack
        Stack<Integer> rt = new Stack<>();
        while(st.size()>0){
            int c = st.peek();
            rt.push(c);
            st.pop();
        }
        System.out.println(rt);

    }
}

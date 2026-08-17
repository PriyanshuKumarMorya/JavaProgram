package Stack;

import java.util.*;
import java.util.Stack;
public class sta7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter the size of the stack: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter the elements of stack: ");
            int x = sc.nextInt();
            st.push(x);
        }

        System.out.print("Enter the index of the elements push: ");
        int idx  = sc.nextInt();
        System.out.print("Enter the push element of stack: ");
        int ele = sc.nextInt();

        Stack<Integer> rt = new Stack<>();
        while(st.size()>idx){
            rt.push(st.pop());
        }
        st.push(ele);

        while(rt.size()>0){
         st.push(rt.pop());
        }
        System.out.println(st);
    }
}

package Stack;

import java.util.*;
import java.util.Stack;

public class sta12 {
    public static void dispalyRec(Stack<Integer> st){
        if(st.size()==0) return;
        int top = st.pop();
        dispalyRec(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter a size of the stack: ");
        int n  = sc.nextInt();

        for(int i=1;i<=n;i++){
            System.out.print("Enter a elements of the Stack: ");
            int x = sc.nextInt();
            st.push(x);

        }
         dispalyRec(st);


    }
}

package Stack;

import java.util.*;
import java.util.Stack;

public class sta11 {
    public static void display(Stack<Integer> st){
        if(st.size()==0) return ;
        int top = st.pop();
        System.out.print(top+" ");
        display(st);
        st.push(top);
    }
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter a sized of the Stack: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter a element of the Stack: ");
            int x = sc.nextInt();
            st.push(x);
        }
        display(st);


    }
}

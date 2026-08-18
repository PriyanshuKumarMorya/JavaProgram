package Stack;

import java.util.*;
import java.util.Stack;

public class sta13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        System.out.print("Enter a size of the array: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter a elements of the Stack: ");
            int x = sc.nextInt();
            st.push(x);

        }
        Stack<Integer> rt = new Stack<>();
        while(st.size()>1){
            rt.push(st.pop());

        }
        st.pop();
        while(rt.size()>0){
            st.push(rt.pop());
        }
        System.out.println(st);


    }
}

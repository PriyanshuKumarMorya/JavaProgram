package Stack;

import java.util.*;
import java.util.Stack;

public class sta8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();

        st.push(89);
        st.push(45);
        st.push(67);
        st.push(25);
        st.push(53);

        // Array the display of the stack
        int n = st.size();
        int[] arr= new int[n];
        for(int i=n-1;i>=0;i--){
            arr[i] = st.pop();

        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
            st.push(arr[i]);
        }


    }
}

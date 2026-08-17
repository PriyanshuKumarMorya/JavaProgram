package Stack;

import java.util.*;
import java.util.Stack;
public class sta4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        System.out.print("Enter size of the stack: ");
        int n =sc.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter the elements of the stack: ");
            int x = sc.nextInt();
            st.push(x);
        }
        Stack<Integer> gt = new Stack<>();
        while(st.size()>0){
            gt.push(st.pop());
        }
        System.out.println("Gt: "+gt);

        Stack<Integer> rt = new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
    }
}

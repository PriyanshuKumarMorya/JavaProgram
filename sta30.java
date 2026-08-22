package Stack;

import java.util.Scanner;
import java.util.Stack;

public class sta30 {
    public static int Balanced(String str){
        Stack<Character> st = new Stack<>();
        int count =0;
        int n = str.length();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(ch=='('){
                st.push(ch);
            }else{
                if(st.size()==0) {
                    count++;
                }else if(st.peek()=='('){
                    st.pop();
                }
            }
        }
        return count+st.size();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(Balanced(str));


    }
}

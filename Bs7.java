package BuilderString;
import java.util.*;
public class Bs7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        // toggle case
        for(int i=0;i<str.length();i++){
            //check -> alphabet - small,capital
            boolean flag = true;// true - capital
            char ch = str.charAt(i);
            if(ch==' ') continue;
            int asci = (int)ch;
            if(asci>=97) flag = false;//small
            if(flag==true){
                asci+=32;
                char dh = (char)asci;// a
                str.setCharAt(i,dh);
            }else{
                asci -=32;
                char dh = (char)asci;
                str.setCharAt(i,dh);
            }

        }
        System.out.println(str);
    }
}

package BuilderString;

import java.util.*;
public class Bs8 {
    public static void main(String[] args) {
        String str = "abcdcba";
        StringBuilder gtr = new StringBuilder(str);
        gtr.reverse();
        String s = gtr+"";
        if(str.equals(s)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

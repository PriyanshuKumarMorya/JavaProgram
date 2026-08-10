package String;

import java.util.Scanner;

public class str10 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str=sc.nextLine();
        String answer = " ";

        StringBuilder sb=new StringBuilder("");
        for(int i =0;i<str.length();i++){
            char ch = str.charAt(i);


            if (ch != ' ') {
                sb.append(ch);
            }else{
                sb.reverse();
                answer +=sb;
                answer +=' ';
                sb=new StringBuilder("");

            }
        }

        sb.reverse();
        answer  += sb;
        System.out.println(answer);



    }
}

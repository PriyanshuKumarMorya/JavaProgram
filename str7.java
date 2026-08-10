package String;

import java.util.Scanner;

public class str7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        StringBuilder sb=new StringBuilder(str);


        for(int i=0;i<sb.length();i++){
            boolean flag=true;
            char ch = str.charAt(i);
            if(ch==' ')  continue;
            int asci=(int)ch;
            if(asci>=97) flag = false;
            if(flag==true){
                asci+=32;
                char dh =(char)asci;
                str=str.substring(0,i)+dh+str.substring(i+1);
            }else{
                asci -=32;
                char dh =(char)asci;
                str=str.substring(0,i)+dh+str.substring(i+1);
            }

        }
        System.out.println(str);
    }
}

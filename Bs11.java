package BuilderString;

public class Bs11 {
    public static void main(String[] args) {
        String s =" I am Priyanshu";
        String ans = "";
        StringBuilder str = new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch!=' '){
                str.append(ch);
            }else{
                str.reverse();
                ans += str;
                ans +=" ";
                str = new StringBuilder(" ");
            }
        }
        str.reverse();
        ans += str;
        System.out.println(ans);
    }
}

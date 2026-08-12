package String;

public class str13 {
    public static void main(String[] args) {
        String str = "hello";
        String s2 = "hello";
        String s3 = new String("hello");
        System.out.println(str==s2);
        System.out.println(str.equals(s2));
    }
}

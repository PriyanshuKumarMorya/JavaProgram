public class PassByValue {
    static void changevalue(int a){
        a*=100;
    }
    public static void main(String[] args){
        int a = 10;
        System.out.println("Before changing value "+a);
        changevalue(a);
        System.out.println("After changing value "+a);
    }
}

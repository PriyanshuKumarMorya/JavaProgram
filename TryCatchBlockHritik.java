package Hritik;

public class TryCatchBlockHritik {
    public static void main(String[] args) {
        int a = 24;
        int b=0;
        int c=2;
        try{
            int y= a/b;

        }catch (ArithmeticException e){
            System.out.println("Divison by Zero");
        }
        finally{

        }
        int d=a/c;
        System.out.println(d);
    }
}

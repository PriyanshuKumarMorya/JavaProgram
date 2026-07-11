import java.util.Scanner;
public class Reversedigits {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int reverse =0;
        while(n>0){
            reverse = reverse*10 + n%10;
            n=n/10;
        }
        System.out.println("Reverse is: "+reverse);
    }
}

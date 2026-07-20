import java.util.Scanner;
public class SumOfNaturalNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum =0;
        int num=1;
        while(num<=n){
            sum = num+sum;
            num++;
            System.out.println("Sum is :"+sum);
        }
        System.out.println("Sum is :"+sum);
    }
}

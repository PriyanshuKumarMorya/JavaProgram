import java.util.Scanner;
public class SumOfNatural {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int num =1;num<=n;num++){
            sum = num+sum;
            System.out.println("Sum is:"+sum);

        }
        System.out.println("Sum is:"+sum);

    }
}

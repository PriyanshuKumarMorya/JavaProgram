import java.util.Scanner;
public class swapOfTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter frist  number: ");
        float n = sc.nextFloat();
        System.out.print("Enter second  number: ");
        float b = sc.nextFloat();
        float temp = n;
        n=b;
        b=temp;
        System.out.println("Swap frist number: "+n);
        System.out.println("swap second number: "+b);
    }
}

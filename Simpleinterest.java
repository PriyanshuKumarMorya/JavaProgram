package BE_LEVEL;
import java.util.*;
public class Simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle number : ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of number : ");
        double r = sc.nextInt();
        System.out.print("Enter the time of number : ");
        double t = sc.nextDouble();
        double SI = (p*r*t)/100;
        System.out.println("Simple Interest is : "+SI);
    }
}

import java.util.Scanner;
public class WhileCondition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = 1;
        while(num<=n){
            System.out.println(num);
            num++;
        }
    }
}

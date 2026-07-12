import java.util.Scanner;
public class CountDigital {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int num =0;
        while(n>0){
            n = n/10;
            num++;
        }
        System.out.println("Count digital is :"+num);
    }
}

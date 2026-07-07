package MOM;

import java.util.Scanner;

public class AddingtwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number: ");
        int a = sc.nextInt();
        System.out.print("Enter a second number: ");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Adding two numbers : "+c);

    }
}

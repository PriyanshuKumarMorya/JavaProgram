package PatterQuestion;
import java.util.*;
public class RectangualrPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        for(int i = 1;i<n;i++){
            for(int j=1;j<n+2;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

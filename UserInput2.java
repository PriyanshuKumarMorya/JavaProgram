package Array2D;

import java.util.*;

public class UserInput2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a rows : ");
        int row = sc.nextInt();
        System.out.print("Enter a Columns: ");
        int columns = sc.nextInt();
        int[][] arr = new int[row][columns];
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<columns;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}

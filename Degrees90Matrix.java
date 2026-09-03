package Array2D;

import java.util.*;

public class Degrees90Matrix {
    static void print(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void transposeInplace(int[][] a, int n){
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
    }
    static void reverseArray(int[] arr){
        int i=0, j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp ;
            i++;
            j--;
        }
    }
    static void rotate(int[][] a,int n){
        transposeInplace(a,n);
        for(int i=0;i<n;i++){
            reverseArray(a[i]);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number rows and columns of matrix : ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        print(a);
       rotate(a,r);
        System.out.println("Enter a rotate : ");
       print(a);
    }
}

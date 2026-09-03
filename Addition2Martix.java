package Array2D;


import java.util.*;
public class Addition2Martix {
    static void printmatrix(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns of matrix 1 ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("Enter matrix1 value ");
        for(int i =0;i<r1;i++){
            for(int j=0;j<c1;j++){
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter number of rows and columns of matrix2 ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();

        int[][] b = new int[r2][c2];
        System.out.println("Enter matrix2 value");
        for(int i=0;i<r2;i++){
            for(int j=0;j<c2;j++){
                b[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 1");
       printmatrix(a);
        System.out.println("Matrix 2");
        printmatrix(b);
    }
}

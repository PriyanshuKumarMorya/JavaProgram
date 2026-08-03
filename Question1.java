package Array2D;

public class Question1 {
    public static void main(String[] args) {
        int[] m = new int[10];
        int[] n = new int[10];
        for (int i = 0; i < 10; i++) {
            m[i] = i + 1;
            n[i] = i + 1;
        }
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                int  total =n[i]*m[j];
                System.out.print(total+" ");
            }
            System.out.println();
        }


    }
}

import java.util.Scanner;

public class MinumNumberOfArray {
    static int findmax(int arr[]){
        int mn = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<mn){
                mn = arr[i];

            }
        }
        return mn;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter a array elements: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findmax(arr));
    }
}



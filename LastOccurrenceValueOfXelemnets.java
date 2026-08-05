import java.util.Scanner;

public class LastOccurrenceValueOfXelemnets {
    static int lastOccurrences(int arr[],int x){
        int index=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                index = i;

            }

        }
        return index;
    }
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter "+ n +" elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter x: ");
        int x=sc.nextInt();
        System.out.println(lastOccurrences(arr,x));
    }

}

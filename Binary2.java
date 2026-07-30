package Searching;

import java.util.Scanner;

public class Binary2 {
    static void Sorted(int[] arr){
        int m = arr.length;
        for(int i=0;i<m;i++){
            for(int j=0;j<m-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    static void dispalyArray(int[] arr){
        for(int val:arr){
            System.out.println(val+" ");
        }
    }

    static int binarysearch(int[] arr,int k){
        int start = 0;int end=arr.length-1;
        while(start<=end){
            int mid  = (start+end)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]<k){
                start =  mid+1;
            }else{
                end =  mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a size of array: ");
        int n = sc.nextInt();
        int arr[] = new int[5];
        for(int i=0;i<n;i++){
            System.out.print("Enter a element of array: ");
            arr[i] = sc.nextInt();
        }
        Sorted(arr);
        dispalyArray(arr);
        System.out.print("Enter a Searching key: ");
        int k = sc.nextInt();
        int result = binarysearch(arr,k);
        if(result !=-1){
            System.out.println(result);
        }else{
            System.out.println("Not Found");
        }


    }
}

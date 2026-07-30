package Searching;

public class Binary1 {
    static int binarySearch(int[] arr, int m) {
        int start = 0; int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == m) {
                return mid;
            } else if (arr[mid] < m) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 13, 15, 18};
        int m = 5;
        int result = binarySearch(arr, m);
        if (result != -1) {
            System.out.println(result);
        } else {
            System.out.println("Not Found");
        }
    }
}
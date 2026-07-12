class ArraysExample{
    void maxOfArray(){
        int arr[]={1,5,3};
        int max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum is: "+max);
    }
}
public class MaximumArrays {
    public static void main(String[] args){
        ArraysExample obj = new ArraysExample();
        obj.maxOfArray();
    }
}

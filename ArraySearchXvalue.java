class ArraySearch{
    void searchValue(){
        int arr[] = {1,5,3,8,9,4,3};
        int x = 98;
        int ans = -1;
        for(int i=0;i<arr.length;i++) {
            if (x == arr[i]) {
                ans = i;
                break;
            }
        }
            if (ans == -1) {

                System.out.println("Not found");
            }else{
                System.out.println(ans);
            }


            }
        }





public class ArraySearchXvalue {
    public static void main(String[] args){
    ArraySearch obj = new ArraySearch();
    obj.searchValue();

}
}

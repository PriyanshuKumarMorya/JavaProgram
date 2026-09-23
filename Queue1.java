package Queue.ImplementationOfArray;

public class Queue1 {
    public static class QueueArray{
        int f = -1;
        int r = -1;
        int size =0;
        int[] arr = new int[5];
        public void add(int val){
            if(r==arr.length-1){
                System.out.println("Queue is full");
                return ;
            }
            if(f==-1){
                f =r=0;
                arr[0]= val;
            }else{
                arr[++r]= val;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty.");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is empty.");
                return -1;
            }
            return arr[f];
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
            }else{
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    static void main(String[] args) {
        QueueArray q = new QueueArray();
        q.add(78);
        q.display();
        q.add(67);

    }
}

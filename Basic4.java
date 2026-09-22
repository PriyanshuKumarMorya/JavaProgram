package Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Basic4 {
    public static void main(String[] args) {
           Queue<Integer> q = new LinkedList<>();
           q.add(2);
           q.add(87);
           q.add(43);
           q.add(4);
           q.add(42);

           Queue<Integer> helper = new ArrayDeque<>();
           while(q.size()>0){
               System.out.print(q.peek()+" ");
               helper.add(q.poll());
           }
           while(helper.size()>0){
               q.add(helper.poll());
           }
    }
}

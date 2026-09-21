package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Basic2 {
    public static void main(String[] args) {
        Queue<Integer>  q = new ArrayDeque<>();
        q.add(78);
        q.add(43);
        q.add(32);
        q.add(67);
        q.remove();
        q.remove();
        q.add(69);
        q.add(65);
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.peek());
    }
}

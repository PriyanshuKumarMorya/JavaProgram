package Queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class Basic3 {
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        System.out.println(q.peek());
        System.out.println(q.size());
        q.add(0);
        q.add(45);
        q.add(77);
        q.remove();
        q.add(0);
        q.add(76);
        q.poll();
        q.add(21);
        System.out.println(q);
    }
}

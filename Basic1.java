package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Basic1 {
    static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        System.out.println(q.peek());
        q.add(7);
        q.add(5);
        q.add(12);
        System.out.println(q);
        System.out.println(q.size());
        System.out.println(q.element());
    }
}

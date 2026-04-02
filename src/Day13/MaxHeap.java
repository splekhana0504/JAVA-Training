package Day13;

import java.util.Collections;
import java.util.PriorityQueue;

public class MaxHeap {
    public static void main(String[] args) {
        //Max heap using priority Queue-> reverse order()
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.offer(10);
        pq.offer(30);
        pq.offer(5);
        pq.offer(45);
        pq.offer(36);
        System.out.println(pq.peek());
    }
}

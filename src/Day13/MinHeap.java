package Day13;

import java.util.PriorityQueue;

public class MinHeap {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.offer(10);
        pq.offer(30);
        pq.offer(5);
        pq.offer(45);
        pq.offer(36);
        System.out.println(pq.peek());
    }
}
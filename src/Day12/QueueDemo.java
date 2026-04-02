package Day12;

import java.util.Queue;
import java.util.LinkedList;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>(); //if we type queue it gives error
        q.offer(10);
        q.offer(20);
        q.offer(30);
        System.out.println(q);
        System.out.println("Top element:"+q.peek());
        System.out.println("Remove:"+q.remove());
        System.out.println(q);
        System.out.println("Size:"+q.size());
        System.out.println("Empty Queue:"+q.isEmpty());
    }
}
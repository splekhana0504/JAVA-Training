package Day13;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
        int k=3;
        // Max heap using reverse order comparator
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        pq.addAll(Arrays.asList(7,10,4,3,20,15));

        int result=0;
        for(int i=0;i<k;i++){
            result=pq.poll();
        }
        System.out.println("Kth largest element:"+result);
    }
}

package Day13;

import java.util.Arrays;
import java.util.PriorityQueue;

public class KthSmallest {
    public static void main(String[] args) {
        int k=4;
        PriorityQueue<Integer> pq= new PriorityQueue<>(Arrays.asList(7,10,4,3,20,15));
        int result=0;
        for(int i=0;i<k;i++){
            result=pq.poll();
        }
        System.out.println("Kth Smallest Element:"+result);
    }
}

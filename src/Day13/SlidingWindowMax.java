package Day13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class SlidingWindowMax {
    public static void main(String[] args) {
        int []nums={1,3,-1,-3,5,3,6,7};
        int k=3;
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer> result=new ArrayList<>();
        for(int i=0;i<k;i++){
            pq.offer(nums[i]);
        }
        result.add(pq.peek());
        for(int i=k;i<nums.length;i++){
            pq.remove(nums[i-k]);
            pq.offer(nums[i]);
            pq.add(pq.peek());
            result.add(pq.peek());
        }
        System.out.println("Sliding Window Max:"+result);
    }
}

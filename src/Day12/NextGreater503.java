package Day12;

import java.util.Arrays;
import java.util.ArrayDeque;

public class NextGreater503 {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int []res=new int[n];
        Arrays.fill(res,-1);
        ArrayDeque<Integer> stack=new ArrayDeque<>();
        for(int i=0;i<2*n;i++){
            int num=nums[i%n];
            while(!stack.isEmpty() && nums[stack.peek()]<num){
                res[stack.pop()]=num;
            }
            if(i<n){
                stack.push(i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        NextGreater503 sol=new NextGreater503();
        int []nums={1,2,3,4,3};
        //int []nums={1,2,1};
        int []result=sol.nextGreaterElements(nums);
        System.out.println(Arrays.toString(result));
    }
}
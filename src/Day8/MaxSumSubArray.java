package Day8;

public class MaxSumSubArray {
    public static void main(String[] args) {
        int []arr={1,3,2,6,-1,4,1,8,2};
        int k=3;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        int max=sum;
        for(int i=k;i< arr.length;i++){
            sum+=arr[i]-arr[i-k];
            max=Math.max(max,sum);
        }
        System.out.println("Max sum of Sub Array :"+ max);
    }
}
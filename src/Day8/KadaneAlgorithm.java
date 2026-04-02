package Day8;

public class KadaneAlgorithm {
    public static void main(String[] args) {
        int []arr={-2,-3,4,-1,-2,1,5,-3};
        int cs=arr[0];
        int ms=arr[0];
        for(int i=1;i<arr.length;i++){
            cs=Math.max(arr[i],cs+arr[i]);
            ms=Math.max(ms,cs);
        }
        System.out.println("Max SubArray Sum:"+ms);
    }
}
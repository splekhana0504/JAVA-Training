package Day15;
import java.util.Arrays;
public class FibonacciMemoization {
    static int[]dp;
    static int fib(int n){
        if(n<=1)return n;
        if(dp[n]!=-1)return dp[n];
        dp[n]=fib(n-1)+fib(n-2);
        return dp[n];
    }
    public static void main(String[] args) {
        int n=10;
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.print("Fibonacci series upTo:"+n+":");
        for (int i = 0; i <= n; i++) {
            System.out.print(fib(i)+" ");
        }
    }
}

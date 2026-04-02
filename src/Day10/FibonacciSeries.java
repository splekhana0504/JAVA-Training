package Day10;

public class FibonacciSeries {
    public static int fib(int n){
        //Base Case
        if(n==0||n==1){
            return n;
        }
        //Recursive case
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        int terms=10;
        System.out.print("Fibonacci Series : ");
        for(int i=0;i<terms;i++){
            System.out.print(fib(i)+" ");
        }
    }
}
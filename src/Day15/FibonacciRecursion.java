package Day15;

public class FibonacciRecursion {
    static int fib(int n) {
        if (n <= 1) {//Base Case
            return n;
        }
        return fib(n - 1) + fib(n - 2);//Recursive Case
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci(" + n + ") = " + fib(n));
    }
}
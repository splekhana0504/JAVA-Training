package Day6;

public class ThrowInBlock {
    public static void main(String[] args) {
        try {
            System.out.println("Inside Try Block");
            throw new ArithmeticException("Exception from try block");
        }
        catch (ArithmeticException e){
            System.out.println("Exception Caught"+e.getMessage());
            throw new NullPointerException("Exception from catch");
        }
        finally{
            System.out.println("Inside finally block");
            throw new IllegalStateException("Execution from finally block");
        }
    }
}

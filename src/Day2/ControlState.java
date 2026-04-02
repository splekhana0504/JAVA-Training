package Day2;

public class ControlState {
    public static void main(String[] args) {
        // even i=2 odd i=1
        int i=99;  // reverse
        while(i>=1){     // i<=50
            /*if(i%2==0){
                System.out.println(i);
            }
            i++;*/
            System.out.println(i+" "); //without modulus
            i=i-2;  //i+2
        }
    }
}

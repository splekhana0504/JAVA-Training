package Day5;
final class BreakingBad{
    //final void run(){
      //System.out.println("Running");
   // }
}
//class walterWhite extends BreakingBad{ //final class cant be extended or inherited
    //@Override //final method cant be Override
    //void run(){
       // System.out.println("WalterWhite");
    //}
//}
public class FinalDestination {
    public static void main(String[] args) {
        final int MAX=100;
        System.out.println(MAX);
        //MAX=200; -> final variable cant be updated
    }
}

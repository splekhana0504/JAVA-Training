package Day5;

import java.awt.*;

//static variable,method,block
public class KGF2 {
    static String HeroName="RSY";
    static {
        System.out.println("Kalash Nikaov");
    }
    static void dialogue(){
        System.out.println("Violence Violence Violence");
    }

    public static void main(String[] args) {
        System.out.println("HeroName: "+KGF2.HeroName);
        dialogue();
    }
}

//1.static variable->can be called directly in main class name
//2.static method-> can be directly called in getMain
//3.static block-> executes even before main method
package Day2;

import java.util.Scanner;

public class YieldSwitch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        String color = switch(ch){
            case 'v'->{yield "Violet";}
            case 'i'->{yield "Indigo";}
            case 'b'->{yield "Blue";}
            case 'g'->{yield "Green";}
            case 'y'->{yield "Yellow";}
            case 'o'->{yield "Orange";}
            case 'r'->{yield "red";}
            default -> {yield "Invalid Input";}
        };
        System.out.println("Color="+color);
    }
}
package Day2;

import java.util.Scanner;

public class VIBGYOR {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the letter: ");
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        String color;
            /*case 'v': System.out.println("violet");break;
            case 'i': System.out.println("Indigo");break;
            case 'b': System.out.println("Blue");break;
            case 'g': System.out.println("Green");break;
            case 'y': System.out.println("Yellow");break;
            case 'o': System.out.println("Orange");break;
            case 'r': System.out.println("Red");break;
            default: System.out.println("Invalid input");*/
        switch (ch){
            case 'v':
                color="Violet";
                break;
            case 'i':
                color="Indigo";
                break;
            case 'b':
                color="Blue";
                break;
            case 'g':
                color="Green";
                break;
            case 'y':
                color="Yellow";
                break;
            case 'o':
                color="Orange";
                break;
            case 'r':
                color="Red";
                break;
            default:
                color="Invalid color";
        }
        System.out.println("color="+color);
    }
}

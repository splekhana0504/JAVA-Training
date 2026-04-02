package Day2;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch=Character.toLowerCase(ch);
        switch(ch){
            case 'a': case 'e': case 'i': case 'o': case 'u':
            //case 'A': case 'E': case 'I': case 'O': case 'U':
                System.out.println("Vowel"); break;
            default:
                System.out.println("Consonant");

            /*case 'a','e','i','o','u','A','E','I','O','U'-> System.out.println("Vowel");
            default -> System.out.println("Consonant");*/
        }
    }
}

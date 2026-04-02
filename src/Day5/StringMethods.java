package Day5;
import java.util.Scanner;
public class StringMethods {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String");
        String str=sc.nextLine();

        //1.Length
        System.out.println("Length: "+str.length());
        //2. toUpperCase()
        System.out.println("UpperCase: "+str.toUpperCase());
        //3. toLowerCase()
        System.out.println("LowerCase: "+str.toLowerCase());
        //4.charAt()
        System.out.println("Character at index: "+str.charAt(2));
        //5.substring(begin,end)
        System.out.println("Substring: "+str.substring(0,4));
        //6.concat or '+'
        String str1="Alien Force";
        System.out.println("Concat: "+str.concat(str1));
        //7.equals()
        System.out.println("Equals: "+str.equals("sapthagiri"));
        //8.EqualsIgnoreCase()
        System.out.println(str.equalsIgnoreCase("sapthagiri"));
        //9.replace(old,new)
        System.out.println(str.replace("i","Jail"));
        //10.trim()
        String speed=" "+str+" ";
        System.out.println(speed.trim());
        //11.startsWith()
        System.out.println(str.startsWith("s"));
        //12.endsWith()
        System.out.println(str.endsWith("B"));
        //13.indexof()
        System.out.println(str.indexOf('h'));
        //14.compareTo()\
        System.out.println(str.compareTo("sapthagiri"));
        //15.split()
        String[] words=str.split(",");
        for(String word: words){
            System.out.println(word);
        }
        //16.isLetter()  17.isDigit()
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
                System.out.println(c+" is a letter");
            }else if (Character.isDigit(c)){
                System.out.println(c+" is a digit");
            }else{
                System.out.println(c+" neither digit nor letter");
            }
        }
    }
}

package Day6;

import java.util.Scanner;
public class StringBuilderEx {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine();
        StringBuilder sb=new StringBuilder(input);

        //1.append()
        sb.append(" Alien Force");
        System.out.println(sb);

        //2.Insert(index,value)
        sb.insert(1,"XLRB");
        System.out.println(sb);

        //3.delete()
        sb.delete(1,5);
        System.out.println(sb);

        //4.replace(start,end,value)
        sb.replace(6,11,"Ultimate Alien");
        System.out.println(sb);

        //5.reverse();
        sb.reverse();
        System.out.println(sb);
    }
}

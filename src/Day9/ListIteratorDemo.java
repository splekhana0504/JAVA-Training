package Day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));
        list.add(3,20);
        System.out.println(list);
        System.out.println("using ListIterator");

        ListIterator<Integer> itr=list.listIterator();
        System.out.println("Forward Traversal");

        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }

        System.out.println(); //changing the line
        System.out.println("Backward Traversal");

        while(itr.hasPrevious()){
            System.out.print(itr.previous()+" ");
        }
    }
}
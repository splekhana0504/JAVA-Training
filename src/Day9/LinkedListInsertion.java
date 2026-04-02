package Day9;

import java.util.LinkedList;

public class LinkedListInsertion {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(1);
        ll.add(2);
        System.out.println(ll);

        //add at beginning
        ll.addFirst(45);
        //add at last
        ll.addLast(77);
        System.out.println(ll);
        //specific position
        ll.add(2,7);
        System.out.println(ll);
    }
}

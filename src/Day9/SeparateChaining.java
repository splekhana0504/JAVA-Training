package Day9;

import java.util.LinkedList;

public class SeparateChaining {
    static int tableSize=10;
    static LinkedList<Integer>[] table=new LinkedList[tableSize];
    static void insert(int key){
        int index=key%tableSize;
        if(table[index]==null){
            table[index]=new LinkedList<>();
        }
        table[index].add(key);
    }
    static void display() {
        for (int i = 0; i < tableSize; i++) {
            System.out.print(i + " ->");
            if (table[i] != null) {
                for (int value : table[i]) {
                    System.out.print(value + " ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        insert(32);
        insert(42);
        insert(33);
        insert(45);
        insert(56);
        insert(77);
        insert(90);
        insert(35);
        insert(15);
        insert(62);

        display();
    }
}
package Day9;

public class LinearProbing {
    static int tableSize=10;
    static int table[]=new int[tableSize];

    static void insert(int key){
       int index=key%tableSize;
       while(table[index]!=0){
           index=(index+1)%tableSize;
       }
       table[index]=key;
    }
    static void display(){
        for(int i=0;i<tableSize;i++){
            System.out.println(i+" -> "+table[i]);
        }
    }
    public static void main(String[] args) {
        insert(45);
        insert(35);
        insert(25);
        insert(65);
        insert(75);
        insert(85);
        insert(95);
        insert(15);
        insert(5);
        insert(55);

        display();

    }
}

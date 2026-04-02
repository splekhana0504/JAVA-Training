package Day6;
class MyThread1 extends Thread{
    public void run(){
        try{
            System.out.println("Sleeping");
            Thread.sleep(10000);
            System.out.println("Awake");
        }
        catch (Exception e){}
    }
}
public class Waiting_Blocked {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        t1.start();
    }
}
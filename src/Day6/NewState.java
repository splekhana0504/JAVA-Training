package Day6;
class MyThread extends Thread {
    public void run(){
        System.out.println("Thread is Running");
    }
}
public class NewState {
    public static void main(String[] args) {
        MyThread t1=new MyThread();// 1st state->to start
        System.out.println("State "+t1.getState());
        t1.start();//to start the run method use start()
        System.out.println("State: "+t1.getState());
    }
}

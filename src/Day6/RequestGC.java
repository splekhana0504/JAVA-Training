package Day6;
//Requesting Garbage Collection
public class RequestGC {
    public static void main(String[] args) {
        RequestGC r=new RequestGC();
        r=null;
        System.gc();
        System.out.println("GC Requested");
    }
}
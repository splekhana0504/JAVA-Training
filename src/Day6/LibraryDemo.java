package Day6;
class GC extends Exception{
    GC(String message){
        super(message);
    }
}
public class LibraryDemo {
    static void CheckAttendance(boolean absent)throws GC{
        if(absent){
            throw new GC("Penalty to submit 5 books to library");
        }else{
            System.out.println("Good Student");
        }
    }

    public static void main(String[] args) {
        try{
            CheckAttendance(false);
        }
        catch (GC e) {
            System.out.println("Caught and exception:"+e.getMessage());
        }finally {
            System.out.println("Welcome to sapthagiri : chai peelo");
        }
    }
}

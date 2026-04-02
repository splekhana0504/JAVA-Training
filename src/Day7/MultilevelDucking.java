package Day7;
//Ducking->Throwing an exception back to the caller without handling

/*import java.io.FileReader;
import java.io.IOException;*/
import java.io.*;

public class MultilevelDucking {
    static void readFile() throws IOException{
        FileReader fr=new FileReader("file.txt");
        System.out.println("File Opened Successfully");
    }
    static void processFile() throws IOException{
        readFile();
    }
    static void handleFile() throws IOException{
        processFile();
    }
    public static void main(String[] args) {
        try{
            handleFile();
        }
        catch(IOException e){
            System.out.println("Caught Exception:"+e.getMessage());
        }
        finally {
            System.out.println("Program Executed");
        }
    }
}


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;

public class App {
    static String line = "";
    public static void main(String[] args) throws Exception {
        String cmd = System.in.toString();
        switch(cmd){
         case "-c":

            break;
        }
    }

    public static String getFile(String fileName){
        
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            while((line = reader.readLine()) != null){
                
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
        return line;
    }

    public static void numOfBytes(){
        RandomAccessFile raf = new RandomAccessFile("/Users/grantcoutts/Documents/Programing_projects/text.txt");
        fl = raf.length();
        byte[] nob = new byte[]
    }
}

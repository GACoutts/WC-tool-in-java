
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception {
        
    }

    public static void getFile(String fileName){
        try(BufferedReader reader = new BufferedReader(new FileReader(fileName))){
            String line;
            while((line = reader.readLine()) != null){
                
            }
        }catch(IOException e){
            System.out.println("Error: " + e.getLocalizedMessage());
        }
    }
}

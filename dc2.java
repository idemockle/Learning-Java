import java.nio.file.*;
import java.nio.charset.*;
import java.io.*;


public class dc2 {
    public static void main(String[] args) {
        BufferedReader reader;
        String line;
        
        try {
            reader = Files.newBufferedReader(Paths.get(args[0]), StandardCharsets.UTF_8);
            
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            
            reader.close();
        }
        catch (IOException e) {
            System.err.format("IOException: %s%n", e);
        }
    }
}
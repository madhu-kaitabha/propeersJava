package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingToFile {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/chalasanin.vc/Documents/Non-work/java-ghub/propeersJava/jav.txt";
        FileWriter writer = null;
        try{
            File file1 = new File(filePath);
            writer = new FileWriter(file1, true);
            char[] ch = {'a', 'i', 'l'};
            writer.write("\n");
            writer.write("Java");
            writer.write(95);
            writer.write(65);
            writer.write("\n");
            writer.write(ch);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            writer.close();
        }
    }
}

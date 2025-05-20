package fileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadingFromFile {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/chalasanin.vc/Documents/Non-work/java-ghub/propeersJava/jav.txt";
        FileReader reader = null;
        try{

            File file1 = new File(filePath);
            reader = new FileReader(file1);
            char[] chr = new char[(int)file1.length()];
            reader.read(chr);

            for (char c : chr){
                System.out.println(c);
            }

//
//             int i = reader.read();
//             while (i != -1){
//                 System.out.println((char)i);
//                 i = reader.read();
//             }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            reader.close();
        }
    }
}

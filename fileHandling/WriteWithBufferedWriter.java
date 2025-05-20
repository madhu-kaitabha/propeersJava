package fileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteWithBufferedWriter {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/chalasanin.vc/Documents/Non-work/java-ghub/propeersJava/jav.txt";
        FileWriter writer = null;
        BufferedWriter bwriter = null;
        try{
            File file1 = new File(filePath);
            writer = new FileWriter(file1);
            bwriter = new BufferedWriter(writer);
            char[] ch = {'J', 'a', 'v', 'a'};
            bwriter.write("Alien");
            bwriter.newLine();
            bwriter.write(95);
            bwriter.newLine();
            bwriter.write(65);
            bwriter.newLine();
            bwriter.write(ch);
            System.out.println("Open java.txt file in hard disk");

        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            bwriter.close();
        }
    }
}

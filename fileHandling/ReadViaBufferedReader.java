package fileHandling;

import java.io.*;

public class ReadViaBufferedReader {
    public static void main(String[] args) throws IOException {
        String filePath = "/Users/chalasanin.vc/Documents/Non-work/java-ghub/propeersJava/jav.txt";
        FileReader reader = null;
        BufferedReader breader = null;
        try{

            File file1 = new File(filePath);
            reader = new FileReader(file1);
            breader = new BufferedReader(reader);
            String str = breader.readLine();
            while (str != null){
                System.out.println(str);
                str = breader.readLine();
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }finally {
            breader.close();
        }
    }
}

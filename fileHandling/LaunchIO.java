package fileHandling;

import java.io.File;

public class LaunchIO {


    public static void main(String[] args) {

        try{
            File file1 = new File("/Users/chalasanin.vc/Documents/Non-work/java-ghub/propeersJava/jav.txt");
            System.out.println(file1.exists());
            System.out.println(file1.createNewFile());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

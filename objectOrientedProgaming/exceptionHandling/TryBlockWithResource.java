package objectOrientedProgaming.exceptionHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryBlockWithResource {
    public static void main(String[] args) throws IOException {
        int num = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) // here post try block resources are closed automatically
        {
            num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }
    }
}

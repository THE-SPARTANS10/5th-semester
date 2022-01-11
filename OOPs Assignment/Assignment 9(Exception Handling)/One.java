import java.io.*;
import java.util.*;

public class One {
    public static void main(String[] args)throws IOException {
        System.out.println("Enter a number");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        try{
            System.out.println(2/n);
        }
        catch (ArithmeticException ae){
            System.out.println("Do not divide by zero");
        }
    }
}

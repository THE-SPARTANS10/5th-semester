import java.io.*;
import java.util.*;

public class Five {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number");
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(buffer.readLine());
        if (n == 0)
            throw new ArithmeticException();
        else
            System.out.println(2/n);
    }
}

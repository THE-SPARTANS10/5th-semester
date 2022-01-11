import java.io.*;
import java.util.*;

public class Three {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter size of an array");
        int n = Integer.parseInt(buffer.readLine());
        try {
            int [] arr = new int[n];
            System.out.println(Arrays.toString(arr));
        }
        catch (NegativeArraySizeException ne){
            System.out.println("Array size can not be negative");
        }
    }
}

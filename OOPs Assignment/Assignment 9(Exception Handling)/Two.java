import java.io.*;
import java.util.*;

public class Two {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter numbers of an array");
        String [] inp = buffer.readLine().split(" ");
        int n = inp.length;
        int [] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(inp[i]);
        System.out.println("Enter a position of the array");
        int posArr = Integer.parseInt(buffer.readLine());
        System.out.println("Enter a string");
        String s = buffer.readLine();
        System.out.println("Enter a position of the string");
        int posStr = Integer.parseInt(buffer.readLine());
        try {
            System.out.println(arr[posArr-1]);
            System.out.println(s.charAt(posStr-1));
        }
        catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println("Array index chosen is not valid");
        }
        catch (StringIndexOutOfBoundsException se){
            System.out.println("String index chosen is not valid");
        }
    }
}

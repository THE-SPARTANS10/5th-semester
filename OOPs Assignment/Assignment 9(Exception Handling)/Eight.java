import java.io.*;
import java.util.*;

public class Eight {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter a string");
        String s = buffer.readLine();
        System.out.println("Enter start and end of substring");
        String [] inp = buffer.readLine().split(" ");
        int start = Integer.parseInt(inp[0]), end = Integer.parseInt(inp[1]);
        try {
            String substring = s.substring(start-1, end);
            sb.append(substring);
            sb.reverse();
            System.out.println(sb);
        }
        catch (StringIndexOutOfBoundsException sioube){
            System.out.println("The positions entered were not within valid range");
        }
    }
}

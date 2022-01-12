import java.io.*;
import java.util.*;

public class Five {
    public static void main(String[] args) throws IOException {
        File f = new File("program.txt");
        if (f.exists()) {
            System.out.println("File exists");
        }
        else {
            throw new FileNotFoundException();
        }
    }
}

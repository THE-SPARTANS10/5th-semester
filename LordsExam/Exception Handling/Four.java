import java.io.*;
import java.util.*;

public class Four {
    public void printRandomThing(){
        System.out.println("Printing something random");
    }
    public static void main(String[] args){
        Four obj = null;
        try {
            obj.printRandomThing();
        }
        catch (NullPointerException ne){
            System.out.println("Object is pointing to null");
        }
    }
}

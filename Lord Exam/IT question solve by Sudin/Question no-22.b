import java.util.Scanner;

class Outer{
    private int i=30;
    class inner{
        void Display()
        {
            System.out.println("The value is: "+i);
        }
    }
}


public class Main
{
    public static void main(String[] args)
    {
       Outer t=new Outer();
       Outer.inner in =new Outer().new inner();
       in.Display();
    }
}

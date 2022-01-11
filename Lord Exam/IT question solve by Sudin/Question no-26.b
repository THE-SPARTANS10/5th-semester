import java.util.Scanner;



class Program{
    String lang;
    Program()
    {
        
    }
    Program(String lang)
    {
        this.lang=lang;
    }

    void Display()
    {
        if(lang==null)
        {
            System.out.println("I love Programming Language");
        }
        else
        {
            System.out.println("I love "+this.lang+" Language");
        }
    }
}

public class Main
{
    
    public static void main(String[] args)
    {
        Program programmer1=new Program();
        Program programmer2=new Program("java");
        programmer1.Display();
        programmer2.Display();
    }
}

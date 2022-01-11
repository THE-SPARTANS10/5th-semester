import java.util.Scanner;

interface first{
    public void m1();

}

interface second{
    public void m2();
}

interface third extends first,second{
    public void m3();
}

class Test{
    public void m4()
    {
        System.out.println("m4()-method");
    }
}

class A  extends Test implements third {
   public void m1()
   {
       System.out.println("m1()-method");
   }
   public void m2()
   {
       System.out.println("m2()-method");
   }
   public void m3()
   {
       System.out.println("m3()-method");
   }
}



public class Main
{
    
    public static void main(String[] args)
    {
        A t=new A();
        t.m1();
        t.m2();
        t.m3();
        t.m4();
    }
}

import java.util.Scanner;




public class Main
{
    public static int gcd(int a,int b)
    {
        if(b==0)
        return a;
        return gcd(b,a%b);
    }

    public static int lcm(int a,int b)
    {
        int g=gcd(a,b);
        int res=(a*b)/g;
        return res;
    }
    public static void main(String[] args)
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the two number");
       int a,b;
       a=sc.nextInt();
       b=sc.nextInt();
       System.out.println("Gcd of two number is:  "+gcd(a,b));
       System.out.println("Lcm of two number is:  "+lcm(a,b));
       
    }
}

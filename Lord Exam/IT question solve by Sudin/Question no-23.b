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
       System.out.println("Enter the number");
       int n;
       n=sc.nextInt();
       int g=1;
       for(int i=2;i<=n;i++)
       {
           g=gcd(g,i);
       }

       int l=1;

       for(int i=2;i<=n;i++)
       {
           l=lcm(l,i);
       }

       System.out.println("Gcd of n numbers is:  "+g);
       System.out.println("Lcm of n numbers is:  "+l);
    }
}

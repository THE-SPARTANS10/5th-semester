import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

class Test {
    public static void main(String[] args) throws IOException {
        int num1,num2,res;
        Scanner sc=new Scanner(System.in);
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter first number: ");
        num1=sc.nextInt();
        System.out.print("Enter second number: ");
        num2=Integer.parseInt(br.readLine());
        res=num1+num2;
        System.out.println("After adding two numbers: "+res);
    }
}
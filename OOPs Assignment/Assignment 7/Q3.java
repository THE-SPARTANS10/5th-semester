import java.util.Scanner;
class Q3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.nextLine();
        System.out.println("Length of String = "+str.length());
        String s=str.trim();
        System.out.println("Length of String without spaces= "+s.length());
    }    
}

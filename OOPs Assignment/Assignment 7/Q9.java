import java.util.Scanner;

class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str=sc.nextLine();
        System.out.println("Enter the two ends of substring : ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        System.out.println(str.substring(n,n+m));  
    }
}

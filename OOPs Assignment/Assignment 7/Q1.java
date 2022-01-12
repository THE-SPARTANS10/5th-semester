import java.util.Scanner;

class Q1{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=sc.nextLine();
        char[] ch=str.toCharArray();
        for(int i=0;i<ch.length;i++){
            System.out.println(ch[i]);
        }
    }

}
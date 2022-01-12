import java.util.Arrays;
import java.util.Scanner;

class Q2 {
        public static void main(String[] args){
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a string: ");
            String str=sc.nextLine();
            int size=str.length();
            
            System.out.println("Enter a char Array: ");
            char[] ch = new char[size+5];
            for(int i=0;i<size+5;i++){
                if(i>4){
                    ch[i]=str.charAt(i-5);
                }
                else{
                    char c = sc.next().charAt(0);
                    ch[i]=c;
                }
            }
            System.out.println(Arrays.toString(ch));
    }
}

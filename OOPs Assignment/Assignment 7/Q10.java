import java.util.Scanner;

class Q10 {
    public static String deleteMe(String str,int m){
        int size=str.length(); 
        if(m==0){
            return str.substring(1,size);
        }
        else if(m==size-1){
            return str.substring(0,m);
        }
        else{
            String str1=new String();
            String str2=new String();
            String str3=new String();
            str1=str.substring(0,m);
            str2=str.substring(m+1,size-1);
            str3=str1.concat(str2);
            return str3;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Enter the mth character : ");
        int m=sc.nextInt();
        String s=deleteMe(str,m);
        System.out.println(s);
    }    
}

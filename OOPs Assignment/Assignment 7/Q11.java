import java.util.Scanner;

class Q11 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String str2=new String("Swarup Sarkar");
        // int count=0;
        for(int i=0;i<3;i++){
            System.out.println("Who is the lover of JAVA ??");
            String str1=sc.nextLine();
            if(str1.equals(str2)){
                System.out.println("Good");
                // count++;
                break;
            }
            else if(i==2){
                System.out.println("Wrong");
                System.out.println(str2);
            }
            else{
                System.out.println("Try Again");
            }
        }
        
    }
}

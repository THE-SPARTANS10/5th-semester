import java.lang.reflect.Array;
import java.util.*;
class Q5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence : ");
        String str=sc.nextLine();
        String[] s=str.split(" ");
        int size=s.length;
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<s.length;j++){
                if(s[i].compareTo(s[j])>0){
                    String temp=s[i];
                    s[i]=s[j];
                    s[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(s));
    }
}

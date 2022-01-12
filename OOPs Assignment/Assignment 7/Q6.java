import java.util.Scanner;

class Q6 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your name: ");
        String name=sc.nextLine();
        System.out.println("Enter Your roll no.: ");
        String roll=sc.nextLine();
        String nme=name.trim();
        int i=nme.indexOf(" ");
        // System.out.println(i);
        int j=nme.lastIndexOf(" ");
        // System.out.println(j);
        String pass1= nme.substring(0,1);
        String pass2= nme.substring(i+1,i+2);
        String pass3= nme.substring(j+1,j+2);
        System.out.println(pass1+pass2+pass3+roll);     
    }   
}

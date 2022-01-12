import java.io.*;
class PayOutOfBoundException extends Exception{
    PayOutOfBoundException(String msg){
        super(msg);
    }
    PayOutOfBoundException(){
        super();
    }
}
public class Six {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your salary");
        int salary = Integer.parseInt(buffer.readLine());
        int maxSalary = 9999;
        try
        {
            if (salary > maxSalary)
                throw new PayOutOfBoundException("Company can't pay you so much");
            System.out.println("Okay company can pay you this much");
        }
        catch (PayOutOfBoundException pe) {
            System.out.println(pe);
            System.out.println(pe.getMessage());
        }
    }
}

import java.io.*;
class PayOutOfBoundException extends Exception{
    PayOutOfBoundException(String errorMessage){
        super(errorMessage);
    }
    PayOutOfBoundException(){
        super("Sorry company cant pay you so much money!!");
    }
}
public class Six {
    public static void main(String[] args) throws Exception {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        int salary = Integer.parseInt(buffer.readLine());
        int maxSalary = 9999;
        if (salary > maxSalary)
            throw new PayOutOfBoundException();
        else
            System.out.println("Okay company can pay you this much");
    }
}

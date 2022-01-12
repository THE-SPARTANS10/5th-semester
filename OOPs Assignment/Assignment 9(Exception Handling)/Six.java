import java.io.*;
class PayOutOfBoundException extends Exception{
    @Override
    public String toString() {
        return "PayOutOfBoundException: Sorry company can't pay you so much money!!";
    }

    @Override
    public String getMessage() {
        return "Sorry company can't pay you so much money!!";
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
                throw new PayOutOfBoundException();
            System.out.println("Okay company can pay you this much");
        }
        catch (PayOutOfBoundException pe) {
            System.out.println(pe);
            System.out.println(pe.getMessage());
        }
    }
}

import java.io.*;
class PayOutOfBoundException extends Exception{
    @Override
    public String toString() {
        return "Sorry company cant pay you so much money!!";
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
        }
    }
}

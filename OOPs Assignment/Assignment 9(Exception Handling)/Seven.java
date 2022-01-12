class ExceptionF extends Exception{
    String message, className;
    ExceptionF(){
        className = "ExceptionF";
        message = "F exception raised";
    }
    @Override
    public String toString() {
        return className+": "+message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
class ExceptionG extends Exception{
    String message, className;
    ExceptionG(){
        className = "ExceptionG";
        message = "G exception raised";
    }
    @Override
    public String toString() {
        return className+": "+message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
public class Seven {
    void f() throws Exception {
        try{
            new Seven().g();
        }
        catch (ExceptionG eg){
            System.out.println("G exception was caught");
            throw new ExceptionF();
        }
    }
    void g()throws Exception{
        throw new ExceptionG();
    }
    public static void main(String[] args) throws Exception {
        Seven obj = new Seven();
        obj.f();
    }
}

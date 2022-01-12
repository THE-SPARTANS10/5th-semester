class ExceptionF extends Exception{
    String message, className;
    ExceptionF(){
        className = "ExceptionF";
        message = "F exception raised";
    }
    ExceptionF(String msg){
        className = "ExceptionF";
        message = msg;
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
    ExceptionG(String msg){
        className = "ExceptionG";
        message = msg;
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
    void f() throws ExceptionF {
        try{
            new Seven().g();
        }
        catch (ExceptionG eg){
            System.out.println("G exception was caught");
            throw new ExceptionF();
        }
    }
    void g()throws ExceptionG{
        throw new ExceptionG();
    }
    public static void main(String[] args) throws Exception {
        Seven obj = new Seven();
        obj.f();
    }
}

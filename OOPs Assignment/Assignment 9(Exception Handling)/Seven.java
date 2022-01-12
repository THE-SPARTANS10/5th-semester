class ExceptionF extends Exception{
    ExceptionF(){
    }
    ExceptionF(String msg){
        super(msg);
    }
}
class ExceptionG extends Exception{
    ExceptionG(){
        super();
    }
    ExceptionG(String msg){
        super(msg);
    }
}
public class Seven {
    void f() throws ExceptionF {
        try{
            new Seven().g();
        }
        catch (ExceptionG eg){
            System.out.println("G exception was caught");
            throw new ExceptionF("ExceptionF was raised");
        }
    }
    void g()throws ExceptionG{
        throw new ExceptionG("ExceptionG was raised");
    }
    public static void main(String[] args) throws Exception {
        Seven obj = new Seven();
        obj.f();
    }
}

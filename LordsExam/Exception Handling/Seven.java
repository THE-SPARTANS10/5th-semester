import java.io.*;
import java.util.*;
class ExceptionF extends Exception{
    ExceptionF(){
        super();
    }
}
class ExceptionG extends Exception{
    ExceptionG(){
        super();
    }
}
public class Seven {
    void f() throws Exception {
        try{
            new Seven().g();
        }
        catch (ExceptionG eg){
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

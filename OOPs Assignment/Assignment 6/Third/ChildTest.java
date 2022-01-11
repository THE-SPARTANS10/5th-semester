package pTwo;
import pOne.Test;

public class ChildTest extends Test {
    public ChildTest(int val) {
        super(val);
    }

    public static void main(String[] args) {
        Test t=new Test(123);
        System.out.println(t.a);
        t.m1();
    }
}
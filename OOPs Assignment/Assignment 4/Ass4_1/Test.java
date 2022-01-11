abstract class Demo {
    void m1() {
        System.out.println("Inside m1() method of abstract class Demo");
    }

    void m2() {
        System.out.println("Inside m2() method of abstract class Demo");
    }
}

class Test extends Demo{
    public static void main(String[] args) {
        /*
        Check without having any abstract method/s whether a class can be abstract.
        -> Yes totally possible
        */
        Test t=new Test();
        t.m1();
        t.m2();
    }
}
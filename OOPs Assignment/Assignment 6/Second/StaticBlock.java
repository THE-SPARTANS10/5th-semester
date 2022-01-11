class SuperTest {
    SuperTest() {
        System.out.println("Inside SuperTest Constructor");
    }

    {
        System.out.println("Inside SuperTest block 1");
    }

    {
        System.out.println("Inside SuperTest block 2");
    }

    static {
        System.out.println("Inside SuperTest static block 1");
    }

    {
        System.out.println("Inside SuperTest block 3");
    }

    static {
        System.out.println("Inside SuperTest static block 2");
    }
}

class Test extends SuperTest {
    Test() {
        System.out.println("Inside Test Constructor");
    }

    {
        System.out.println("Inside Test block 1");
    }

    {
        System.out.println("Inside Test block 2");
    }

    static {
        System.out.println("Inside Test static block 1");
    }

    {
        System.out.println("Inside Test block 3");
    }

    static {
        System.out.println("Inside Test static block 2");
    }
}

public class StaticBlock { 
    public static void main(String[] args) {
        new Test();
        new Test();
        // In line 56 when we are again creating object then static blocks will not run again
        // cause Test class is also loaded but ordinary blocs will run again because ordinary 
        // block execution depends on object creation.
        // So it means static block will execute on class loading time.
    }
}
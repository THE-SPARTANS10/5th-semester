class SuperTest {
    SuperTest() {
        System.out.println("Inside SuperTest Constructor");
    }

    {
        System.out.println("Inside SuperTest Block 1");
    }

    {
        System.out.println("Inside SuperTest Block 2");
    }

    {
        System.out.println("Inside SuperTest Block 3");
    }
}

class Test extends SuperTest {
    Test() {
        System.out.println("Inside Test Constructor");
    }

    {
        System.out.println("Inside Test Block 1");
    }

    {
        System.out.println("Inside Test Block 2");
    }

    {
        System.out.println("Inside Test Block 3");
    }
}

public class OrdBlock {
    public static void main(String[] args) {
        new Test();
        // If line 21 commented out then blocks in Test class will not execute hence proved 
        // Ordinary blocks will not run without object creation
    }
}
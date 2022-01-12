package pkgTwo;

import pkgOne.*;

class Demo implements Interf {
    public void methodOne() {
        System.out.println("First Method of the Interface.");
    }

    public void methodTwo() {
        System.out.println("Second Method of the Interface.");
    }

    public void methodThree() {
        System.out.println("Third Method of the Interface.");
    }
}

class Test {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.methodOne();
        d.methodTwo();
        d.methodThree();
        System.out.println("Main method");
    }
}
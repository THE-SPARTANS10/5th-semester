abstract class Demo {
    abstract void m1();
    abstract void m2();
    abstract void m3();
}

class SubClass extends Demo {
    void m1() {
        System.out.println("m1() method implemented");
    }

    void m2() {
        System.out.println("m2() method implemented");
    }
}

class Test {
    public static void main(String[] args) {
        /*
         * Create an abstract class with three abstract methods check whether you can we
         * override only few methods (not all methods) in
         * subclass or not.
         * -> Not possible, all methods must be implemented in
         * subclass
         */    
        SubClass sc=new SubClass();
        sc.m1();
        sc.m2();
    }
}
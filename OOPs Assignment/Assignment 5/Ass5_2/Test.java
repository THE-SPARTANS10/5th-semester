class Outer {
    void outerFunc() {
        System.out.println("Methid inside Outer class");
    }

    class Inner {
        void innerFunc() {
            System.out.println("Methid inside Inner class");
            outerFunc();
        }
    }
}

class Test {
    public static void main(String[] args) {
        Outer o=new Outer();
        Outer.Inner i=o.new Inner();
        i.innerFunc();
    }
}
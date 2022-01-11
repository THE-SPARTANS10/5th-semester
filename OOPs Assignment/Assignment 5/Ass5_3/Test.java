interface FirstIntf {
    void first();
    void second();
}

interface SecondIntf {
    void third();
    void fourth();
}

interface ThirdIntf extends FirstIntf,SecondIntf {
    void fifth();
}

class Parent {
    void parentMethod() {
        System.out.println("Inside Parent class parentMethod() method.");
    }
}

class Child extends Parent implements ThirdIntf {
    public void first() {
        System.out.println("first() method of FirstIntf Interface");
    }

    public void second() {
        System.out.println("second() method of FirstIntf Interface");
    }

    public void third() {
        System.out.println("third() method of SecondIntf Interface");
    }

    public void fourth() {
        System.out.println("fourth() method of SecondIntf Interface");
    }

    public void fifth() {
        System.out.println("fifth() method of derived ThirdIntf Interface");
    }

    void childMethod() {
        System.out.println("childMethod() of Child class");
    }
}

class Test {
    public static void main(String[] args) {
        Child c=new Child();
        c.first();
        c.second();
        c.third();
        c.fourth();
        c.fifth();
        c.parentMethod();
        c.childMethod();
    }
}
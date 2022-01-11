interface First {
    void firstMethod();
}

class Second {
    void secondMethod() {
        System.out.println("Inside Second class secondMethod() method.");
    }
}

class Test {
    public static void main(String[] args) {
        Second s1=new Second() {
            void secondMethod() {
                System.out.println("Inside Annonymous innerclass overriden secondMethod() method.");
            }
        };
        s1.secondMethod();

        Second s2=new Second();
        s2.secondMethod();

        First f=new First() {
            public void firstMethod() {
                System.out.println("Inside Annonymous innerclass implemented firstMethod() method.");
            }
        };
        f.firstMethod();
    }
}
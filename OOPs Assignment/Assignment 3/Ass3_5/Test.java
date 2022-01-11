class MainClass {
    void show() {
        System.out.println("Inside MainClass show() method");
    }
}
 
class FirstSubClass extends MainClass {
    void show() {
        System.out.println("Inside FirstSubClass overriden show() method");
    }
}

class SecondSubClass extends MainClass {
    void show() {
        System.out.println("Inside SecondSubClass overriden show() method");
    }
}

class ThirdSubClass extends MainClass {
    void show() {
        System.out.println("Inside ThirdSubClass overriden show() method");
    }
} 

class Test {
    public static void main(String[] args) {
        MainClass mc=new MainClass();
        FirstSubClass fsc=new FirstSubClass();
        SecondSubClass ssc=new SecondSubClass();
        ThirdSubClass tsc=new ThirdSubClass();

        mc.show();
        fsc.show();
        ssc.show();
        tsc.show();
    }
}
class Demo {
    void getClassCustom(Object obj) {
        if(this==obj) {
            System.out.println("Same object passed");
        } else {
            System.out.println("Different object passed");
        }
    }
}

class Test {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.getClassCustom(d);
        d.getClassCustom(new Object());
    }
}
class Demo {
    int x;
    Demo(int x) {
        this.x=x;
    }

    void show() {
        System.out.println("Value of x using show() method in Demo class: "+x);
    }
}

class Driver {
    public static void main(String[] args) {
        Demo d=new Demo(321);
        System.out.println("Value of x using instance variable of Demo class: "+d.x);
        d.show();
    }
}